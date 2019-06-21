package com.company.lab4.AnimalRescue;

public class Animal {
    private String name;
    private String food;
    private String favGame;
    private float age;
    private byte healthy;
    private byte hungry;
    private byte happiness;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFavGame(String favGame) {
        this.favGame = favGame;
    }

    public String getFavGame() {
        return favGame;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }

    public void setHealthy(byte healthy) {
        this.healthy = healthy;
    }

    public byte getHealthy() {
        return healthy;
    }

    public void setHungry(byte hungry) {
        this.hungry = hungry;
    }

    public byte getHungry() {
        return hungry;
    }

    public void setHappiness(byte happiness) {
        this.happiness = happiness;
    }

    public byte getHappiness() {
        return happiness;
    }

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
