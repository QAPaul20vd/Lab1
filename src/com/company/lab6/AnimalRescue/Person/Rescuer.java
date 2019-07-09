package com.company.lab6.AnimalRescue.Person;

import com.company.lab6.AnimalRescue.Person.Person;

public class Rescuer extends Person {
    private int money;
    private String space;
    private String typeOfAnimal;

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void lovesAnimals(){
        System.out.println("This person loves the animals.");
    }

    public void feedsAnimals(){
        System.out.println("This person feeds the animals.");
    }

    public void playGames(){
        System.out.println("This person likes to play with his animals.");
    }

    @Override
    public void hasMoney() {
        System.out.println("The rescuer want to spend some money on rescue of the animals.");
    }

    @Override
    public void careAnimals() {
        System.out.println("Rescuer care about animals.");
    }
}
