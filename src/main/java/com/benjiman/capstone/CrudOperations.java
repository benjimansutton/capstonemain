package com.benjiman.capstone;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Scanner;

import static com.benjiman.capstone.CapstoneApplication.troops;

// Main Crud class
public class CrudOperations {

    // Search for the trooper by the *INDEX* code
    public static int troopSearch(List<Person> troops, int number) {
        for(int i = 0; i <= troops.size()-1; i++){
            if(number == Integer.parseInt(troops.get(i).getNumber())){
                return i;
            }
        }
        return -1;
    }

//    // Add Troop function to enable Manually Adding their information
//    public static String addTroop(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage, @RequestParam(value = "ammo", defaultValue = "null") String ammo, @RequestParam(value = "water", defaultValue = "null") String water, @RequestParam(value = "weapon", defaultValue = "null") String weapon, @RequestParam(value = "rations", defaultValue = "null") String rations){
//        if(name.equals("null") || number.equals("null") || percentage.equals("null") || ammo.equals("null") || water.equals("null") || weapon.equals("null") || rations.equals("null")){
//            return "Parameters not accepted";
//        }
//
//        Scanner sc = new Scanner(System.in);
//        String nameInput = sc.nextLine();
//
//
//        Person p = new Person(nameInput, "51", "0", "120", "5", "SA-80", "3");
//        troops.add(p);
//        return (p.getName() + " added");
//    }

    // Method for the delete function
    public static boolean delete(List<Person> troops, int index){
        int troopIndex = troopSearch(troops, index);
        if(troopIndex == -1) return false;
        troops.remove(index);
        return true;
    }

    public static String spawn(@RequestParam(value = "name", defaultValue = "null") String name) {
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "51", "0", "120", "5", "SA-80", "3");
        troops.add(p);
        System.out.println(troops);
        return (p.getName() + " added");
    }
}