package com.MyTesting;

import java.util.ArrayList;

public abstract class InPutOutPut {
    private ArrayList<ShopItems> items;

        public ArrayList<ShopItems> getItems() {
            for (ShopItems item : items) {
                System.out.println("Added " + item.getItem());
            }
            return this.items;
        }
    }
