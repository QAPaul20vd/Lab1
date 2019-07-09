package com.company.lab6.AnimalRescue.Food;

public abstract class Food {
    private String nume;
    private int price;
    private int stock;
    private String packaging;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public abstract void smells();

    public abstract void expire();

    public abstract void hasCalories();

    public abstract void isPrepared();

}
