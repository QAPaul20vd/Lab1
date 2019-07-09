package com.company.lab6.AnimalRescue.Animal;

import com.company.lab6.AnimalRescue.Animal.Animal;

public class Cat extends Animal {

    public void purr() {
        System.out.println("The cat purrs.");
    }

    public void scratch() {
        System.out.println("The cat has big claws and likes to scratch everything.");
    }

    @Override
    public void eat() {
        System.out.println("The cat likes to eat mice.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat liked to sleep in warm places.");
    }

    public void speak() {
        System.out.println("The cat says: miau, miau!");
    }

    public void drink() {
        System.out.println("The cat drinks more milk than water.");
    }

    @Override
    public void play() {
        System.out.println("The cat likes to play with her owner.");

    }
}
