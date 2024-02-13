package com.example.AlabsTest;

import java.util.HashMap;

public class User {
    private long id;

    private String name;
    private String emailAddress;
    private HashMap<Item, Integer> cart;

    public User(String name, String emailAddress, HashMap<Item, Integer> cart) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.cart = cart;
    }

    public long getId(){
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public HashMap<Item, Integer> getCart() {
        return cart;
    }

}
