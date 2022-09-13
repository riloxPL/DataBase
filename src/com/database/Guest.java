package com.database;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isvegan;

    public Guest(String name, String meal, int phoneNumber, boolean isvegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isvegan = isvegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isIsvegan() {
        return isvegan;
    }

    boolean shouldContinue = true;
}
