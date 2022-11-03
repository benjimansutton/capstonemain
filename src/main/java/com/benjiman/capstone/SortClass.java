package com.benjiman.capstone;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*

 * Java Class SortClass that holds the functions sortNum, sortPerc, sortWater, sortAmmo, sortWeapon, sortRations
 */
public class SortClass {

    /*

     * This function sortNum is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of order. This takes the List Person and sets troops to output.
     * It then takes the output and sorts it via the comparator. This then has a switch statement that if
     * order is equals to asc it would return output, if it was desc it would take the Collections class in Java and
     * reverse the output and then return output, Otherwise it would return troops list.
     */
    public static List<Person> sortNum(List<Person> troops, String order) {
        List<Person> output = troops;
        output.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getNumber())));

        switch(order) {
            case "asc": return output;

            case "desc": {
                Collections.reverse(output);
                return output;
            }
        }
        return troops;
    }

    /*

     * This function sortPerc is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of sorted. This takes the List Person and sets troops to input.
     * It then takes the input and sorts it via the comparator. This then has a switch statement that if
     * sorted is equals to asc it would return input, if it was desc it would take the Collections class in Java and
     * reverse the input and then return input, Otherwise it would return troops list.
     */
    public static List<Person> sortPerc(List<Person> troops, String sorted) {
        List<Person> input = troops;
        input.sort((Comparator<Person>) (p1, p2) -> Integer.parseInt(p1.getPercentage()) - Integer.parseInt(p2.getPercentage()));

        switch(sorted) {
            case "asc": return input;

            case "desc": {
                Collections.reverse(input);
                return input;
            }
        }
        return troops;
    }


    /*

     * This function sortWater is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of waterOrder. This takes the List Person and sets troops to waterOutput.
     * It then takes the waterOutput and sorts it via the comparator. This then has a switch statement that if
     * waterOrder is equals to asc it would return waterOutput, if it was desc it would take the Collections class
     * in Java and reverse the waterOutput and then return waterOutput, Otherwise it would return troops list.
     */
    public static List<Person> sortWater(List<Person> troops, String waterOrder) {
        List<Person> waterOutput = troops;
        waterOutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getWater())));

        switch(waterOrder) {
            case "asc": return waterOutput;

            case "desc": {
                Collections.reverse(waterOutput);
                return waterOutput;
            }
        }
        return troops;
    }

    /*

     * This function sortAmmo is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of ammoOrder. This takes the List Person and sets troops to ammoOutput.
     * It then takes the ammoOutput and sorts it via the comparator. This then has a switch statement that if
     * ammoOrder is equals to asc it would return ammoOutput, if it was desc it would take the Collections class
     * in Java and reverse the ammoOutput and then return ammoOutput, Otherwise it would return troops list.
     */
    public static List<Person> sortAmmo(List<Person> troops, String ammoOrder) {
        List<Person> ammoOutput = troops;
        ammoOutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getAmmo())));

        switch(ammoOrder) {
            case "asc": return ammoOutput;

            case "desc": {
                Collections.reverse(ammoOutput);
                return ammoOutput;
            }
        }
        return troops;
    }

    /*

     * This function sortWeapon is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of weaponOrder. This takes the List Person and sets troops to weaponOutput. It also then sets
     * weaponOutput using stream function collect and setting this to variable sortedList
     * It then takes the weaponOutput and sorts it via the comparator. This then has a switch statement that if
     * weaponOrder is equals to asc it would return weaponOutput, if it was desc it would take the Collections class
     * in Java and reverse the sortedLis and then return sortedLis, Otherwise it would return troops list.
     */
    public static List<Person> sortWeapon(List<Person> troops, String weaponOrder) {
        List<Person> weaponOutput = troops;

        List<Person> sortedList = weaponOutput.stream().collect(Collectors.toList());

        switch(weaponOrder) {
            case "asc":
                return sortedList;

            case "desc": {
                Collections.reverse(sortedList);
                return sortedList;
            }
        }
        return troops;
    }

    /*

     * This function sortRations is which a type of List Person which takes the parameters of the List of Person troops
     * and a String type of rationOrder. This takes the List Person and sets troops to rationOrder.
     * It then takes the rationOutput and sorts it via the comparator. This then has a switch statement that if
     * ammoOrder is equals to asc it would return rationOutput, if it was desc it would take the Collections class
     * in Java and reverse the rationOutput and then return rationOutput, Otherwise it would return troops list.
     */
    public static List<Person> sortRations(List<Person> troops, String rationOrder) {
        List<Person> rationOutput = troops;
        rationOutput.sort((Comparator<Person>) Comparator.comparingInt((Person p) -> Integer.parseInt(p.getRations())));

        switch(rationOrder) {
            case "asc": return rationOutput;

            case "desc": {
                Collections.reverse(rationOutput);
                return rationOutput;
            }
        }
        return troops;
    }
}