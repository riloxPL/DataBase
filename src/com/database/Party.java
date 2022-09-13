package com.database;

import java.util.*;
import java.util.ArrayList;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Guest guest;

    Scanner scanner = new Scanner(System.in);
    public void addGuest(){
        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("Enter meal");
        String meal = scanner.nextLine();

        System.out.println("Enter phone number");
        int phoneNumber = Integer.valueOf(scanner.nextInt());

        System.out.println("Is veagn?");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if(isVeganString.equals("Y")||isVeganString.equals("y")){
            isVegan = true;
        }else{
            isVegan = false;
        }

        new Guest(name, meal, phoneNumber, isVegan);

        guests.add(guest);
    }

    public void displayGuests(){
        for (Guest guest : guests){
            System.out.println(guest);
        }
    }
}

