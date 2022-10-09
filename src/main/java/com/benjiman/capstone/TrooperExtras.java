package com.benjiman.capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrooperExtras {

    // AMMO Sorting & Top 5

    // Sort Function for sorting Ammo by Ascending and Descending
    public static List<Person> sortAmmo(List<Person> troops, String ammoorder) {
        List<Person> ammooutput = troops;
        ammooutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getAmmo())));

        // Switch for Ascending and Descending
        switch(ammoorder) {
            case "asc": return ammooutput;

            case "desc": {
                Collections.reverse(ammooutput);
                return ammooutput;

            }

        }
        // Return statement for Troops List
        return troops;
    }

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


    // WATER Sorting & Top 5

    // Sort Function for sorting Water by Ascending and Descending
    public static List<Person> sortWater(List<Person> troops, String waterorder) {
        List<Person> wateroutput = troops;
        wateroutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getWater())));

        // Switch for Ascending and Descending
        switch(waterorder) {
            case "asc": return wateroutput;

            case "desc": {
                Collections.reverse(wateroutput);
                return wateroutput;

            }

        }
        // Return statement for Troops List
        return troops;
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


    // WEAPON Sorting

    // Sort Function for sorting Weapons by Ascending and Descending
    public static List<Person> sortWeapon(List<Person> troops, String weaponorder) {
        List<Person> weaponoutput = troops;

        List<Person> sortedList = weaponoutput.stream().collect(Collectors.toList());
//        weaponoutput.sort(Comparator.naturalOrder());
        // Switch for Ascending and Descending
        switch(weaponorder) {
            case "asc":
//                Comparator.naturalOrder();
                return sortedList;

            case "desc": {
                Collections.reverse(sortedList);
                return sortedList;

            }

        }
        // Return statement for Troops List
        return troops;
    }



    // Rations Sorting & Top 5

    // Sort Function for sorting Rations by Ascending and Descending
    public static List<Person> sortRations(List<Person> troops, String rationorder) {
        List<Person> rationoutput = troops;
        rationoutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getRations())));

        // Switch for Ascending and Descending
        switch(rationorder) {
            case "asc": return rationoutput;

            case "desc": {
                Collections.reverse(rationoutput);
                return rationoutput;

            }

        }
        // Return statement for Troops List
        return troops;
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
