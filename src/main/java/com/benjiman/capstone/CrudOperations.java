package com.benjiman.capstone;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.benjiman.capstone.CapstoneApplication.troops;

// Main Crud class
public class CrudOperations {

    // Search for the trooper by the *INDEX* code
    public static int troopSearch(List<Person> troops, int index) {
        for(int i = 0; i <= troops.size()-1; i++){
            if(index == Integer.parseInt(troops.get(i).getNumber())){
                return i;
            }
        }
        return -1;
    }

//    The @PostMapping is a specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).

    public static String addTroop(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage, @RequestParam(value = "ammo", defaultValue = "null") String ammo, @RequestParam(value = "water", defaultValue = "null") String water, @RequestParam(value = "weapon", defaultValue = "null") String weapon, @RequestParam(value = "rations", defaultValue = "null") String rations){
        if(name.equals("null") || number.equals("null") || percentage.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
        troops.add(p);
        return (p.getName() + " added");
    }


    public static boolean delete(List<Person> troops, int index){
        int troopIndex = troopSearch(troops, index);
        if(troopIndex == -1) return false;
        troops.remove(index);
        return true;
    }

//    public static String updateName(List<Person> troops, int indexOf) {
//        int index = list.indexOf("Candnumbera Gunumberoni"),
//        list.set(index, "New Name");
//        System.out.println(list);
//    }



}
