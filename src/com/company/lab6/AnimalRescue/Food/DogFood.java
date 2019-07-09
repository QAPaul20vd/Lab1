package com.company.lab6.AnimalRescue.Food;

public class DogFood extends Food {

    public void eatBones(){
        System.out.println("This dog eats bones.");
    }


    @Override
    public void smells() {
        System.out.println("The dog food smells not so pleasant.");
    }

    @Override
    public void expire() {
        System.out.println("The dog food has a long term of validity.");
    }

    @Override
    public void hasCalories() {
        System.out.println("The dog food has a lot of calories.");
    }

    @Override
    public void isPrepared() {
        System.out.println("The dog food doesn't need to be prepared in advance.");
    }
}
