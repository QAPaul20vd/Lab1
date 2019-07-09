package com.company.lab6.AnimalRescue.Animal;

import com.company.lab6.AnimalRescue.Animal.Animal;

public class Dog extends Animal {

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
        this.companion = companion;
    }


    @Override
    public void eat() {
        System.out.println("The dog eats bones and meat.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps on the floor.");

    }

    public void speak() {
        System.out.println("The dog barks loudly: Whof-Whof.");
    }

    @Override
    public void drink() {
        System.out.println("The dog drinks a lot of water.");

    }

    @Override
    public void play() {
        System.out.println("The dog likes to play with balls.");

    }


}
