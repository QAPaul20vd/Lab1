package com.company.lab6.AnimalRescue.Animal;

import com.company.lab6.AnimalRescue.Animal.Animal;

public class Parrot extends Animal {

    @Override
    public void eat() {
        System.out.println("The Parrot likes to eat seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("The parrot sleeps in his bird cage.");
    }

    public void speak() {
        System.out.println("The parrot likes to sing every morning.");
    }

    public void eatFruit() {
        System.out.println("My parrot likes to eat fruits.");
    }

    public void eatVegetables() {
        System.out.println("My parrot likes to eat vegetables.");
    }

    public void drink() {
        System.out.println("The parrot drinks water and milk.");
    }

    @Override
    public void play() {
        System.out.println("A parrot likes to play with a mirror.");
    }
}
