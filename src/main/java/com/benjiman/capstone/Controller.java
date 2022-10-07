package com.benjiman.capstone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.benjiman.capstone.CapstoneApplication.troops;


// Controller class which holds all the mapping for functions
@RestController
public class Controller {

    // placeholders for the controller functions with basic mapping

    // XML Grab function will retrieve data from the linked file and pass to ArrayList
    @GetMapping("/xml")
    public static List<Person> getXML() {
        System.out.println("Printing from the Controller XML");
        return XMLData.GrabXML();
    }

    // Sort ArrayList by Number Ascending and Descending
    @GetMapping("/sortnum")
    public static List<Person> sortTroopsByNumber(@RequestParam(value = "order", defaultValue = "asc") String order) {
        System.out.println("Printing from the Controller sort by Number");
        return SortClass.sortNum(troops, order);
    }

    // Sort ArrayList by Number Ascending and Descending
    @GetMapping("/sortperc")
    public static List<Person> sortTroopsByPercentage(@RequestParam(value = "perc", defaultValue = "asc") String sorted) {
        System.out.println("Printing from the Controller sort by Percentage");
        return SortClass.sortPerc(troops, sorted);
    }

    // Sorts the List by Ascending Percentage and shows Top Five Troopers
    @GetMapping("/topfivehighperc")
    public static List<Person> topFiveByPercentage(@RequestParam(value = "percfive", defaultValue = "desc") String toporder) {
        System.out.println("Printing from the Controller sort by Top Five Percentage");
        return SortClass.topFivePercHigh(troops, toporder);
    }

    // Searches the Troopers by their number
    @GetMapping("/troopsearch/byID/{id}")
    public static Person searchTrooperByNumber(@PathVariable int id) {
        System.out.println("Printing from the Controller sort by search by number");
        int index = CrudOperations.troopSearch(troops, id);
        if (index == -1) {
            return new Person("Trooper doesn't exist", "0", "0 Percent");
        } else {
            return troops.get(index);
        }
    }
}

//
//    // Adds a trooper to the ArrayList
//    @GetMapping("/troopadd")
//    public List<Person> addTrooper(@RequestParam(value = "sort", defaultValue = "asc") String sort) {
//        return String.format("Hello %s!", name);
//    }
//




