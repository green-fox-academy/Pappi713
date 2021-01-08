package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class MainController {

    private List<ShopItem> items = new ArrayList<>();

    public MainController() {
        items.add(new ShopItem("Printer", "Just a printer", 300d, 20));
        items.add(new ShopItem("Bojler", "Just a bojler", 500d, 30));
        items.add(new ShopItem("Can", "Just a can", 100d, 9));
        items.add(new ShopItem("Car", "Just a very expensive car", 3000d, 2));
        items.add(new ShopItem("Life", "You can buy real life here", 1d, 1));
        items.add(new ShopItem("Brain", "No words need", 800d, 0));
        items.add(new ShopItem("Kimny", "You can sell your bojler for this", 4500d, 2));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("items", items);
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", items.stream().filter(x -> x.getQuantityOfStock() > 0).collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", items.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/contains-bojler")
    public String containsBojler(Model model) {
        model.addAttribute("items", items.stream()
                .filter(x -> x.getName().toLowerCase().contains("bojler") || x.getDescription().toLowerCase().contains("bojler"))
                .collect(Collectors.toList()));
        return "index";
    }

    @GetMapping("/average-stock")
    public String average(Model model) {
        OptionalDouble average = items.stream().mapToInt(ShopItem::getQuantityOfStock).average();
        if (average.isPresent()) {
            model.addAttribute("specificinfo", "Average stock: " + String.format("%.2f", average.getAsDouble()));
        } else {
            System.out.println("Out of items");
        }
        return "specificdata";
    }

    @GetMapping("/most-expensive")
    public String mostExpensiveName(Model model) {
        String itemName;
        Optional<ShopItem> mostExpensive = items.stream().max(Comparator.comparing(ShopItem::getPrice));
        if (mostExpensive.isPresent()) {
            itemName = mostExpensive.get().getName();
            model.addAttribute("specificinfo", itemName + " is the most expensive item in the webshop.");
        } else {
            model.addAttribute("Our shop is out of items");
        }

        return "specificdata";
    }

    @PostMapping("/search")
    public String searchItem(Model model, @RequestParam String search) {
        model.addAttribute("items", items.stream()
                .filter(x -> x.getName().toLowerCase().contains(search.toLowerCase()) || x.getDescription().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList()));
        return "index";
    }
}
