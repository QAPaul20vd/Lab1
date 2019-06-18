package com.company.lab3.AnimalRescuer_encapsulate;

public class Adopter {
    private String nameAdopter;
    private float money;


    public String getNameAdopter() {
        return nameAdopter;
    }

    public void setNameAdopter(String nameAdopter) {
        this.nameAdopter = nameAdopter;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void spend() {
        System.out.println(nameAdopter + " has " + money + " USD and wants to adopt an animal.");
    }
}
