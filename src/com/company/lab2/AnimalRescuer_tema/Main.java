package com.company.lab2.AnimalRescuer_tema;

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

        Adopter adult = new Adopter();
        adult.nameAdopter = "George";
        adult.money = 1000;
        adult.spend();

    }
}
