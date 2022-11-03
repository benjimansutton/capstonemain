package com.benjiman.capstone;

/*

 * The Person class holds the private variables for all the elements of the XML file that holds the data,
 * (1) being a .... (2) are all the getters for each of the variables. (3) are all the setters for the
 * variables. (4) is the comparator function for some of the other functions outside of this.
 */
public class Person {

    private String name;

    private String number;

    private String percentage;

    private String ammo;

    private String water;

    private String weapon;

    private String rations;

    // (1).
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

    // (2)
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

    // (3)
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

    // (4)
    public int liken(Person p1, Person p2) {
        return Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage());
    }

}
