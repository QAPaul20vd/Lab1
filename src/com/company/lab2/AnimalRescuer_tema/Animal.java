package com.company.lab2.AnimalRescuer_tema;

public class Animal {
    String name;
    String food;
    String favGame;
    float age;
    byte healthy;
    byte hungry;
    byte happiness;


    public void identity() {
        System.out.println(name + " has " + age + " years.");
    }

    public void eat() {
        System.out.println(name + " likes to eat " + food + ".");
    }

    public void play() {
        System.out.println(name + " likes to play with " + favGame + ".");
    }

}
