package com.company.lab6.AnimalRescue.Person;

public class Nurse extends MedicalStaff {

    public void preparePatient(){
        System.out.println("The nurse prepares the patients and their files for the doctor.");
    }

    public void giveMedication(){
        System.out.println("The nurse monitors and administers medication and intravenous infusions.");
    }

    public void learn(){
        System.out.println("The nurses have to study just 3 years in order to practice their job.");
    }

    @Override
    public void hasMoney() {
        System.out.println("The nurse earn enough money to have one little animal.");
    }
}
