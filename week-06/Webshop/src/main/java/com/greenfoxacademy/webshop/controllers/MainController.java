package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class MainController {

    private List<ShopItem> items = new ArrayList<>();

    public MainController() {
        items.add(new ShopItem("Printer", "Just a printer", 300d, 20, "Indoor"));
        items.add(new ShopItem("Bojler", "Just a bojler", 500d, 30, "Quality of life"));
        items.add(new ShopItem("Can", "Just a can", 100d, 9, "Indoor"));
        items.add(new ShopItem("Car", "Just a very expensive car", 3000d, 2, "Outdoor"));
        items.add(new ShopItem("Life", "You can buy real life here", 1d, 1, "Indoor"));
        items.add(new ShopItem("Brain", "No words need", 800d, 0, "Quality of life"));
        items.add(new ShopItem("Kimny", "You can sell your bojler for this", 4500d, 2, "Quality of life"));
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



    @GetMapping("/more")
    public String more( Model model)
    {
        model.addAttribute("items", items);
        return "more";
    }

    @GetMapping("/indoor")
    public String indoor(Model model) {
        model.addAttribute("items", items.stream()
                .filter(x->x.getType().equals("Indoor"))
                .collect(Collectors.toList()));
        return "more";
    }

    @GetMapping("/quality-of-life")
    public String qol(Model model) {
        model.addAttribute("items", items.stream()
                .filter(x->x.getType().equals("Quality of life"))
                .collect(Collectors.toList()));
        return "more";
    }

    @GetMapping("/outdoor")
    public String ourdoor(Model model) {
        model.addAttribute("items", items.stream()
                .filter(x->x.getType().equals("Outdoor"))
                .collect(Collectors.toList()));
        return "more";
    }
    @GetMapping("/euro")
    public String euro(Model model) {
        items.forEach(f->f.SetPriceToEuro(0.38));
        model.addAttribute("items",items);
        return "more";
    }
    @GetMapping("/czk")
    public String czk(Model model) {
        items.forEach(f->f.SetPriceToEuro(1/0.38));
        model.addAttribute("items",items);
        return "more";
    }
    @PostMapping("/above")
    public String filterItemAbove(Model model, @RequestParam String search) {
        System.out.println(search);
        Long treshHold=Long.parseLong(search, 10);
        model.addAttribute("items", items.stream()
                .filter(x -> x.getPrice()>treshHold)
                .collect(Collectors.toList()));
        return "more";
    }
    @PostMapping("/below")
    public String filterItemBelow(Model model, @RequestParam String search) {
        System.out.println(search);
        Long treshHold=Long.parseLong(search, 10);
        model.addAttribute("items", items.stream()
                .filter(x -> x.getPrice()<treshHold)
                .collect(Collectors.toList()));
        return "more";
    }
    @PostMapping("/exactly")
    public String filterItemExactlySame(Model model, @RequestParam String search) {
        System.out.println(search);
        Long treshHold=Long.parseLong(search, 10);
        model.addAttribute("items", items.stream()
                .filter(x -> x.getPrice()==treshHold.doubleValue())
                .collect(Collectors.toList()));
        return "more";
    }
}
