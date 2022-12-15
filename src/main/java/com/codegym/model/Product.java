package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String describe;
    private int quantity;

    public Product() {
    }

    public Product(int id, String name, String describe, int quantity) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
