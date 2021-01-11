package com.greenfoxacademy.webshop.model;

public class ShopItem {
    private String name;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
    public void SetPriceToEuro(double multiplier){
        price=price*multiplier;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    private String description;
    private Double price;
    private Integer quantityOfStock;

    public String getType() {
        return type;
    }

    private String type;

    public ShopItem(String name, String description, Double price, Integer quantityOfStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
    }

    public String priceWithValute(){
        return this.getPrice()+"Kč";
    }
}
