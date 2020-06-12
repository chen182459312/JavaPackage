package com.em.beans;

public class Books {
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private int price;
}
