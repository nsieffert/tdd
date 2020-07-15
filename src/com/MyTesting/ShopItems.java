package com.MyTesting;

public class ShopItems {
    private String item;
    private double price;
    private double tax;

    public static final ShopItems BOOK = new ShopItems("Book", 12.49, 1);
    public static final ShopItems CHOCOLATEBAR = new ShopItems("Chocolate Bar", .85, 1);
    public static final ShopItems HEADACHEPILLS = new ShopItems("Headache Pills", 9.75, 1);
    public static final ShopItems MUSICCD = new ShopItems("Music CD", 14.99, 1.10);
    public static final ShopItems PERFUME = new ShopItems("Perfume", 18.99, 1.10);
    public static final ShopItems IMPORTCHOCOLATESMALL = new ShopItems("Imported Chocolate (small)", 10.00, 1.05);
    public static final ShopItems IMPORTCHOCOLATELARGE = new ShopItems("Imported Chocolate (large)", 11.25, 1.05);
    public static final ShopItems IMPORTPERFUMESMALL = new ShopItems("Imported Perfume (small)", 27.99, 1.15);
    public static final ShopItems IMPORTPERFUMELARGE = new ShopItems("Imported Perfume (large)", 47.50, 1.15);

    public ShopItems(String item, double price, double tax) {
        this.item = item;
        this.price = price;
        this.tax = tax;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return String.format(item);
    }
}