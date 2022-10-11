package com.benjiman.capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    // Sorts the List by Percentage Ascending and shows Top Five Results
    public static List<Person> topFive(List<Person> troops, String toporder) {
        List<Person> output = troops;
        output.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getNumber())));
        if(toporder.equals("desc")){
            Collections.reverse(output);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(output.get(i));
        }
        return top;
    }
}