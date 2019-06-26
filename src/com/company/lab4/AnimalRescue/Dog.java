package com.company.lab4.AnimalRescue;

public class Dog extends Animal{

    private int aggressiveness;
    private boolean companion;

    public int getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(int aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public boolean isCompanion() {
        return companion;
    }

    public void setCompanion(boolean companion) {
        this.companion = companion; }


    public void bark(){
        System.out.println("The dog barks loudly: Whof-Whof.");
    }





}
