package com.encore.server.listing;

public class Listing {
    private String title;
    private double price;
    private String size;
    private String color;

    public Listing(String title, double price, String size, String color) { //constructor
        this.title = title;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public String getTitle() { //title getter
        return this.title;
    }

    public double getPrice() { //price getter 
        return this.price;
    }

    public String getSize() { //size getter
        return this.size;
    }

    public String getColor() { //color getter
        return this.color;
    }

}
