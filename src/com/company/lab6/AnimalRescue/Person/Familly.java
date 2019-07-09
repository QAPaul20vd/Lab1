package com.company.lab6.AnimalRescue.Person;

import com.company.lab6.AnimalRescue.Person.Person;

public abstract class Familly extends Person {
    private int sizeOfFamilly;
    private String placeOfLiving;

    public int getSizeOfFamilly() {
        return sizeOfFamilly;
    }

    public void setSizeOfFamilly(int sizeOfFamilly) {
        this.sizeOfFamilly = sizeOfFamilly;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public void playGames(){
        System.out.println("Every familly has a favorite game to play together.");
    }

    @Override
    public void hasMoney() {
        System.out.println("Every familly spend some extra money on what they love the most.");
    }

    @Override
    public void careAnimals() {
        System.out.println("Inside a familly kids learns to care about animals.");
    }
}
