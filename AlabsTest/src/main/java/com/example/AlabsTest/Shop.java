package com.example.AlabsTest;

import java.util.HashMap;

public class Shop {
    private long id;

    private String name;
    private HashMap<Item, Integer> stock;

    public Shop(String name){
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Item, Integer> getStock() {
        return stock;
    }

}
