package com.company.lab2.AnimalRescuer_tema;

public class AnimalFood {
    String foodName;
    float price;
    int quantity;
    String availability;

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
