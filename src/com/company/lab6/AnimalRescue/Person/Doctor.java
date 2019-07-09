package com.company.lab6.AnimalRescue.Person;


public class Doctor extends MedicalStaff {


    public void evaluatePatient(){
        System.out.println("The doctor evaluates the medical condition of his patient.");
    }

    public void writePrescription(){
        System.out.println("The doctor writes the prescriptions for his patients.");
    }

    public void applyTreatment(){
        System.out.println("The doctor does the surgical operations.");
    }

    public void learn(){
        System.out.println("All doctors studies many years the biology and chemistry of living bodies.");
    }

    @Override
    public void hasMoney() {
        System.out.println("The doctor earns money from his patients.");
    }

}
