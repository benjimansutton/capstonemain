package com.benjiman.capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Main sort class holds all Sort Bys
public class SortClass {

    // Ascending & Descending sorting by Number using switch with default as Asc
    public static List<Person> sortNum(List<Person> troops, String order) {
        List<Person> output = troops;
        output.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getNumber())));

        // Switch for Ascending and Descending
        switch(order) {
            case "asc": return output;

            case "desc": {
                Collections.reverse(output);
                return output;
            }
        }
        // Return statement for Troops List
        return troops;
    }

    // Ascending & Descending for sorting by Percentage using switch with default as Dec
    public static List<Person> sortPerc(List<Person> troops, String sorted) {
        List<Person> input = troops;
        input.sort((Comparator<Person>) (p1, p2) -> Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage()));

        // Switch for Ascending and Descending
        switch(sorted) {
            case "asc": return input;

            case "desc": {
                Collections.reverse(input);
                return input;
            }
        }
        return troops;
    }


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
}