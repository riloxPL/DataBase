package com.database;

public class Guest {
    private final String name;
    private final String meal;
    private final int phoneNumber;
    private final boolean isvegan;

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
