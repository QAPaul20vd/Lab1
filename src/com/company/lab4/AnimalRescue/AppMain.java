package com.company.lab4.AnimalRescue;

import com.company.lab3.AnimalRescuer_encapsulate.Animal;
import com.company.lab3.AnimalRescuer_encapsulate.*;

public class AppMain {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.setName("Rex");
        dog.setAge(5);
        dog.setFavGame("running");
        dog.setFood("Pedigree");
        dog.setHappiness((byte) 9);
        dog.setHealthy((byte) 10);
        dog.setHungry((byte) 5);

        Animal cat = new Animal();
        cat.setName("Mieunel");
        cat.setAge(2.5f);
        cat.setHealthy((byte) 6);
        cat.setHungry((byte) 10);
        cat.setHappiness((byte) 5);
        cat.setFood("milk");
        cat.setFavGame("mice");

        Adopter adult = new Adopter();
        adult.setNameAdopter("George");
        adult.setMoney(1000);

        AnimalFood dogFood = new AnimalFood();
        dogFood.setFoodName("Royal Canin");
        dogFood.setPrice(12.5f);
        dogFood.setQuantity(35);
        dogFood.setAvailability("Yes");

        AnimalFood catFood = new AnimalFood();
        catFood.setFoodName("Purina");
        catFood.setPrice(8.3f);
        catFood.setQuantity(20);
        catFood.setAvailability("Yes");

        Activity freeTime = new Activity();
        freeTime.setAction("run in forest");

        VetDoc dr = new VetDoc();
        dr.setName("Samuel Micu");
        dr.setDiscipline("microbiology");

    }
}
