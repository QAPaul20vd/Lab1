package com.company.lab5.AnimalRescue;

public class Person {

    private int age;
    private String gender;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void learn(){
        System.out.println("Every person learns something about human body and about animals.");
    }

    public void playGames(){
        System.out.println("Everyone likes to play sometimes with friends.");
    }




}
