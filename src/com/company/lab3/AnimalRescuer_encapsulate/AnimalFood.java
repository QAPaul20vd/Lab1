package com.company.lab3.AnimalRescuer_encapsulate;

public class AnimalFood {
    private String foodName;
    private float price;
    private int quantity;
    private String availability;

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void sell() {
        System.out.println("The " + foodName + " costs " + price + " USD.");
    }

    public void stock() {
        System.out.println("In our stock there are " + quantity + ".");
    }

    public void question() {
        System.out.println("Do you have " + foodName + "?");
    }

}
