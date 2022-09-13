package com.database;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);

        Party party = new Party();

        System.out.println("====="+"dbName"+"=====");
        System.out.println("1 Display");
        System.out.println("2 Add");
        System.out.println("3 Display meals");
        System.out.println("4 Find by phone number");
        System.out.println("5 Exit");

        while(shouldContinue)
        {
            int userChoise =  scanner.nextInt();

            switch (userChoise) {


                case 1-> party.displayGuests();
                case 2-> party.addGuest();
                case 3-> System.out.println("3 Display meals");
                case 4-> System.out.println("4 Find by phone number");
                case 5-> shouldContinue=false;



            }


        }

    }

}