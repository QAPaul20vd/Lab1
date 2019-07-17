package com.company.lab7.App;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Paul", 1234);
        map.put("Andrei", 4444);
        map.put("Ion", 9876);

        System.out.print("Insert username: ");
        Read read = new Read();
        String user = read.getString();
        System.out.print("Insert password: ");
        int pass = read.getInt();



        if (map.containsValue(map.get(user))) {
            if (map.get(user) == pass) {
                System.out.println(map.get(user));
                Run run = new Run();
                run.runTheProgram();
            } else {
                System.out.println("try again");
            }
        } else {
            System.out.println("user inexistent");
        }

    }
}
