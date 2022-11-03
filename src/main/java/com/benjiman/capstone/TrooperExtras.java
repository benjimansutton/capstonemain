package com.benjiman.capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

 * Java Class TrooperExtras that holds the function topFiveAmmo(1) which takes the parameters of the List of
 * Person troops and an String type of ammoOrder. This takes the List Person and sets troops to ammoOutput.
 * It then takes the ammoOutput and sorts it via the comparator. This then has an if statement that if ammoOrder is
 * equals to desc it would take the Collections class in Java and reverse the ammoOutput of the parameter ammoOutput.
 * Then it would take the list create a new ArrayList called top. Then using a for loop to iterate through the top 5
 * and return this list and add it each top 5 into the variable top and then returns the ArrayList top.
 */
public class TrooperExtras {

    // (1)
    public static List<Person> topFiveAmmo(List<Person> troops, String ammoOrder) {
        List<Person> ammoOutput = troops;
        ammoOutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getAmmo())));
        if(ammoOrder.equals("desc")){
            Collections.reverse(ammoOutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(ammoOutput.get(i));
        }
        return top;
    }

    /*

     * This function topFiveWater which takes the parameters of the List of Person troops and an String type of
     * waterOrder. This takes the List Person and sets troops to waterOutput.
     * It then takes the waterOutput and sorts it via the comparator. This then has an if statement that if waterOrder
     * is equals to desc it would take the Collections class in Java and reverse the waterOutput of the parameter
     * waterOutput. Then it would take the list create a new ArrayList called top. Then using a for loop to
     * iterate through the top 5 and return this list and add it each top 5 into the variable top and then
     * returns the ArrayList top.
     */
    public static List<Person> topFiveWater(List<Person> troops, String waterOrder) {
        List<Person> waterOutput = troops;
        waterOutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getWater())));
        if(waterOrder.equals("desc")){
            Collections.reverse(waterOutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(waterOutput.get(i));
        }
        return top;
    }

    /*

     * This function topFive which takes the parameters of the List of Person troops and an String type of
     * topOrder. This takes the List Person and sets troops to Output.
     * It then takes the topOutput and sorts it via the comparator. This then has an if statement that if topOrder
     * is equals to desc it would take the Collections class in Java and reverse the output of the parameter
     * output. Then it would take the list create a new ArrayList called top. Then using a for loop to
     * iterate through the top 5 and return this list and add it each top 5 into the variable top and then
     * returns the ArrayList top.
     */
    public static List<Person> topFive(List<Person> troops, String topOrder) {
        List<Person> output = troops;
        output.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getPercentage())));
        if(topOrder.equals("desc")){
            Collections.reverse(output);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(output.get(i));
        }
        return top;
    }

    /*

     * This function topFiveRations which takes the parameters of the List of Person troops and an String type of
     * rationsOrder. This takes the List Person and sets troops to rationsOutput.
     * It then takes the rationsOutput and sorts it via the comparator. This then has an if statement that if
     * rationsOrder is equals to desc it would take the Collections class in Java and reverse the rationsOutput of the
     * parameter rationsOutput. Then it would take the list create a new ArrayList called top. Then using a for loop to
     * iterate through the top 5 and return this list and add it each top 5 into the variable top and then
     * returns the ArrayList top.
     */
    public static List<Person> topFiveRations(List<Person> troops, String rationsOrder) {
        List<Person> rationsOutput = troops;
        rationsOutput.sort(Comparator.comparingInt((Person p) -> Integer.parseInt(p.getRations())));
        if(rationsOrder.equals("desc")){
            Collections.reverse(rationsOutput);
        }
        List<Person> top = new ArrayList<Person>();
        for(int i = 0; i <= 4; i++){
            top.add(rationsOutput.get(i));
        }
        return top;
    }

}
