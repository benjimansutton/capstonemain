package com.benjiman.capstone;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Person {

    private String name;

    private String number;

    private String percentage;

    public Person(String name, String number, String percentage) {
        this.name = name;
        this.number = number;
        this.percentage = percentage;
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

    public int liken(Person p1, Person p2) {
        return Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage());
    }

}
