package com.benjiman.capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrooperExtras {

    // Sorts the List by Ammo Ascending and shows Top Five Results
    public static List<Person> topFiveAmmo(List<Person> troops, String ammoorder) {
        List<Person> ammooutput = troops;
        ammooutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getAmmo())));
        if(ammoorder.equals("desc")){
            Collections.reverse(ammooutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(ammooutput.get(i));
        }
        return top;
    }

    // Sorts the List by Water Ascending and shows Top Five Results
    public static List<Person> topFiveWater(List<Person> troops, String waterorder) {
        List<Person> wateroutput = troops;
        wateroutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getWater())));
        if(waterorder.equals("desc")){
            Collections.reverse(wateroutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(wateroutput.get(i));
        }
        return top;
    }

    // Sorts the List by Percentage Ascending and shows Top Five Results
    public static List<Person> topFive(List<Person> troops, String toporder) {
        List<Person> output = troops;
        output.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getPercentage())));
        if(toporder.equals("desc")){
            Collections.reverse(output);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(output.get(i));
        }
        return top;
    }

    // Sorts the List by Rations Ascending and shows Top Five Results
    public static List<Person> topFiveRations(List<Person> troops, String rationsorder) {
        List<Person> rationsoutput = troops;
        rationsoutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getRations())));
        if(rationsorder.equals("desc")){
            Collections.reverse(rationsoutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(rationsoutput.get(i));
        }
        return top;
    }

}
