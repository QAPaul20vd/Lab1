package com.company.lab5.AnimalRescue;

public class Animal {

    private String name;
    private String color;
    private String food;
    private float age;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public void eatFood() {
        System.out.println(name + " likes to eat " + food + ".");
    }

    public void sleep() {
        System.out.println("This animal sleeps all night.");
    }

    public void speak(){
        System.out.println("Each animal makes a sound.");
    }

    public void drink(){
        System.out.println("Each animal drinks water.");
    }

}