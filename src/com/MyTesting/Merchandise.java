package com.MyTesting;

abstract class Merchandise {
    private final String name = "Product";
    private final double price = 0;
    private final double tax = 0;


    public String getNAME() {
        return name;
    }
    public double getOriginalPrice(){
        return price;
    }
    public double getAfterTaxPrice() {
      return (price * tax) + price;
    }
    public double getTAX() {
        return price * tax;
    }
}
