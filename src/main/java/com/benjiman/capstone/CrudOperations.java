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

    public static String addTroop(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage){
        if(name.equals("null") || number.equals("null") || percentage.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, number, percentage);
        troops.add(p);
        return (p.getName() + " added");
    }



}
