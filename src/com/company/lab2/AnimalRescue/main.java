package com.company.lab2.AnimalRescue;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.age);
        System.out.println(cat.name + ". " + cat.colour );
        cat.eat();
        cat.sleep();
        cat.play();
    }
}
