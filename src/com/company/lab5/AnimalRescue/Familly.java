package com.company.lab5.AnimalRescue;

public class Familly extends Person {
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
}
