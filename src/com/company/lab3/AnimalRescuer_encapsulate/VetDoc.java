package com.company.lab3.AnimalRescuer_encapsulate;

public class VetDoc {
    private String name;
    private String discipline;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void doctor() {
        System.out.println(name + " is a good doctor. He studied " + discipline + ".");
    }
}
