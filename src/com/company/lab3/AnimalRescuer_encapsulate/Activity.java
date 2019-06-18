package com.company.lab3.AnimalRescuer_encapsulate;

public class Activity {
     private String action;

     public String getAction(){
         return action;
     }

     public void setAction(String action){
         this.action = action;
     }

    public void freeTime() {
        System.out.println("When I have some free time I like to " + action + ".");

    }

}
