package com.benjiman.capstone;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Person {

    private String name;

    private String number;

    private String percentage;

    private String ammo;

    private String water;

    private String weapon;

    private String rations;

    public Person(String name, String number, String percentage, String ammo, String water, String weapon, String rations) {
        this.name = name;
        this.number = number;
        this.percentage = percentage;
        this.ammo = ammo;
        this.water = water;
        this.weapon = weapon;
        this.rations = rations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage() {
        this.percentage = percentage;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRations() {
        return rations;
    }

    public void setRations(String rations) {
        this.rations = rations;
    }

    public int liken(Person p1, Person p2) {
        return Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage());
    }

}
