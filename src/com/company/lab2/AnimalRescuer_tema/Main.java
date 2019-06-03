package com.company.lab2.AnimalRescuer_tema;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Rex";
        dog.age = 4;
        dog.healthy = 10;
        dog.hungry = 3;
        dog.happiness = 10;
        dog.food = "bones";
        dog.favGame = "balls";

        dog.identity();
        dog.eat();
        dog.play();
        System.out.println(dog.name + " is healthy: " + dog.healthy + ". He is hungry: " + dog.hungry + ", and is happy: " + dog.happiness + "." + '\n');


        Animal cat = new Animal();
        cat.name = "Mieunel";
        cat.age = 2.5f;
        cat.healthy = 6;
        cat.hungry = 10;
        cat.happiness = 5;
        cat.food = "milk";
        cat.favGame = "mice";

        cat.identity();
        cat.eat();
        cat.play();
        System.out.println(cat.name + " is healthy: " + cat.healthy + ". She is hungry: " + cat.hungry + ", and is happy: " + cat.happiness + "."+'\n');

        Adopter adult = new Adopter();
        adult.nameAdopter = "George";
        adult.money = 1000;
        adult.spend();

        AnimalFood dogFood = new AnimalFood();
        dogFood.foodName = "Royal Canin";
        dogFood.price = 12.5f;
        dogFood.quantity = 35;
        dogFood.availability = "Yes";

        dogFood.sell();
        dogFood.question();
        System.out.print(dogFood.availability + "." + '\t');
        dogFood.stock();

        AnimalFood catFood = new AnimalFood();
        catFood.foodName = "Purina";
        catFood.price = 8.3f;
        catFood.quantity = 20;
        catFood.availability = "Yes";

        catFood.sell();
        catFood.question();
        System.out.print(catFood.availability + "." + '\t');
        catFood.stock();

        Activity freeTime = new Activity();
        freeTime.action = "run in forest";
        freeTime.freeTime();

        VetDoc dr = new VetDoc();
        dr.name = "Samuel Micu";
        dr.discipline = "microbiology";
        dr.doctor();


    }
}
