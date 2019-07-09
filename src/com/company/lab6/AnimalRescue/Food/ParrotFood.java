package com.company.lab6.AnimalRescue.Food;

public class ParrotFood extends Food {
    private String fruit;
    private String vegetables;

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }


    @Override
    public void smells() {
        System.out.println("The parrot food smells nice.");
    }

    @Override
    public void expire() {
        System.out.println("The parrot food expires in a few days after it was opened.");

    }

    @Override
    public void hasCalories() {
        System.out.println("The parrot food is less caloric than other animals food.");
    }

    @Override
    public void isPrepared() {
        System.out.println("The parrot food has to be prepared in advance.");
    }
}
