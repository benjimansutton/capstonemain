package com.benjiman.capstone;

// Main Variables for the Person, bringing all the elements into it
public class Person {

    private String name;

    private String number;

    private String percentage;

    private String ammo;

    private String water;

    private String weapon;

    private String rations;

    // Constructor for Person
    public Person(String name, String number, String percentage, String ammo, String water, String weapon, String rations) {
        this.name = name;
        this.number = number;
        this.percentage = percentage;
        this.ammo = ammo;
        this.water = water;
        this.weapon = weapon;
        this.rations = rations;
    }

    public Person(String name, String number) {
    }

    // Getters for the Person Elements
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getWater() {
        return water;
    }

    public String getAmmo() {
        return ammo;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getRations() {
        return rations;
    }
    // Setters for the Person Elements

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPercentage() {
        this.percentage = percentage;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setRations(String rations) {
        this.rations = rations;
    }

    // Comparator for Person
    public int liken(Person p1, Person p2) {
        return Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage());
    }

}
