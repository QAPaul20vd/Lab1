package com.company.lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setCompanion(true);
        dog.setAge(2.5f);
        dog.setAggressiveness(8);
        dog.setWeight(15);
        System.out.println("My dog, " + dog.getName() + ", has " + dog.getWeight() + " kilos and is " + dog.getAge() + " years old.");
        dog.sleep();

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setColor("white");
        cat.setAge(3);
        cat.setWeight(4);
        System.out.println("My cat, " + cat.getName() + ", has " + cat.getWeight() + " kilos and is " + cat.getColor() + ".");
        cat.purr();
        cat.scratch();

        Parrot parrot = new Parrot();
        parrot.setName("Lizzy");
        parrot.setColor("Red");
        parrot.setWeight(0.5f);
        System.out.println("My parrot is " + parrot.getName() + " and his feather is " + parrot.getColor() + ".");
        parrot.isSinging();

        Rescuer rescuer = new Rescuer();
        rescuer.setName("John");
        rescuer.setGender("male");
        rescuer.setMoney(1500);
        rescuer.setSpace("backyard");
        rescuer.setTypeOfAnimal("dog");
        System.out.println(rescuer.getName() + " has " + rescuer.getMoney() + " dollars and would like to save a " + rescuer.getTypeOfAnimal() + " and play with it in his " + rescuer.getSpace() + ".");
        rescuer.feedsAnimals();
        rescuer.lovesAnimals();

        Nurse nurse = new Nurse();
        nurse.setName("Evelyn");
        nurse.setAge(45);
        nurse.setYearsOfPractice(5);
        nurse.setYearsOfStudy(13);
        System.out.println(nurse.getName() + " is nurse for " + nurse.getYearsOfPractice() + " years.");
        nurse.giveMedication();
        nurse.preparePatient();

    }
}
