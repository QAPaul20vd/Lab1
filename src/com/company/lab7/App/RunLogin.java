package com.company.lab7.App;

import java.util.HashMap;

public class RunLogin {
    public static void main(String[] args) {
        int i = 1;
        boolean found = false;
        LogicalOp logic = new LogicalOp();
        Read read = new Read();

        HashMap<Login, Integer> map = new HashMap<>();

        String user1 = "Ion";
        int pass1 = 999;
        Login firstUser = new Login(user1, pass1);
        firstUser.setPassword(pass1);
        firstUser.setUsername(user1);

        String user2 = "Paul";
        int pass2 = 1234;
        Login secondUser = new Login(user2, pass2);
        secondUser.setPassword(pass2);
        secondUser.setUsername(user2);

        map.put(firstUser, 1);
        map.put(secondUser, 2);

        do {
            System.out.print("Username: ");
            String userx = read.getString();
            System.out.print("Password: ");
            int passx = read.getInt();
            Login newUser = new Login(userx, passx);
            i++;
            if (map.containsKey(newUser)) {
                System.out.println("success!");
                found = true;
            } else
                if (i < 3)
                    System.out.println("try again");

        } while (i <= 3 && !found);

        if (!found)
            System.out.println("Bye-Bye!");
    }

}
