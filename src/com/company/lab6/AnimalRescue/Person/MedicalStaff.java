package com.company.lab6.AnimalRescue.Person;

public abstract class MedicalStaff extends Person {
    private int yearsOfStudy;
    private String domain;
    private int yearsOfPractice;

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    public void learn(){
        System.out.println("Medical staff studies in detail about human body and about animals.");
    }

    @Override
    public void careAnimals() {
        System.out.println("");
    }
}
