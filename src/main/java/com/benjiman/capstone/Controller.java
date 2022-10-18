package com.benjiman.capstone;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.benjiman.capstone.CapstoneApplication.troops;

// Controller class which holds all the mapping for functions
@RestController
public class Controller {

    // Controller function to initialise the XML Grab function will retrieve data from the linked file and pass to ArrayList this is unsorted
    @GetMapping("/xml")
    public static List<Person> getXML() {
        System.out.println("Printing from the Controller XML");
        return XMLData.GrabXML();
    }

    // Controller function to initialise the XML Grab function will retrieve data from the linked file and pass to ArrayList this is sorted
    @GetMapping(path="/troops/XML")
    public List<Person> getTroopersByXML(@RequestParam(value = "order", defaultValue = "asc") String order) {
        System.out.println("Printing from the Controller sort by XML Export");
        return SortClass.sortNum(troops, order);
    }

    // Controller function to initialise the Sort ArrayList by Number Ascending and Descending
    @GetMapping("/sortnum")
    public static List<Person> sortTroopsByNumber(@RequestParam(value = "order", defaultValue = "asc") String order) {
        System.out.println("Printing from the Controller sort by Number");
        return SortClass.sortNum(troops, order);
    }

    // Controller function to initialise the Sorting the troopers by Ammo
    @GetMapping("/sortperc")
    public static List<Person> sortTroopsByPercentage(@RequestParam(value = "perc", defaultValue = "asc") String sorted) {
        System.out.println("Printing from the Controller sort by Percentage");
        return SortClass.sortPerc(troops, sorted);
    }

    // Controller function to initialise the Sorting the troopers by Ammo
    @GetMapping("/sortammo")
    public static List<Person> sortTroopsByAmmo(@RequestParam(value = "ammoorder", defaultValue = "asc") String ammoorder) {
        System.out.println("Printing from the Controller sort by Ammo");
        return SortClass.sortAmmo(troops, ammoorder);
    }

    // Sort the troopers by Water
    @GetMapping("/sortwater")
    public static List<Person> sortTroopsByWater(@RequestParam(value = "waterorder", defaultValue = "asc") String waterorder) {
        System.out.println("Printing from the Controller sort by Water");
        return SortClass.sortWater(troops, waterorder);
    }

    // Sort the troopers by Weapon
    @GetMapping("/sortweapon")
    public static List<Person> sortTroopsByWeapon(@RequestParam(value = "weaponorder", defaultValue = "asc") String weaponorder) {
        System.out.println("Printing from the Controller sort by Weapon");
        return SortClass.sortWeapon(troops, weaponorder);
    }

    // Sort the troopers by Rations
    @GetMapping("/sortrations")
    public static List<Person> sortTroopsByRations(@RequestParam(value = "rationsorder", defaultValue = "asc") String rationsorder) {
        System.out.println("Printing from the Controller sort by Rations");
        return SortClass.sortRations(troops, rationsorder);
    }

    // Function that searches for a trooper by their number
    @GetMapping("/troops/bynumber/{number}")
    public static Person searchTrooperByNumber(@PathVariable int number) {
        System.out.println("Printing from the Controller sort by search by number");
        int index = CrudOperations.troopSearch(troops, number);
        if (index == -1) {
            return new Person("Trooper doesn't exist", "0", "0 Percent", "0", "0", "NULL", "0");
        } else {
            return troops.get(index);
        }
    }

    // Function that deletes the Trooper by their number
    @GetMapping(path="/troops/delete/{number}")
    public String deleteTroop(@PathVariable int number){
        int troopNumber = CrudOperations.troopSearch(troops, number);
        if(troopNumber <= 0){
            return "Service Number not recognised";
        } else{
            Person p = troops.get(number);
            troops.remove(number);
            return (p.getName() + " has been removed.");
        }
    }

    // Function that searchers by number in the List
    @GetMapping(path="troops/update/{number}")
    public static boolean update(@PathVariable int number, @RequestParam String name){
        int index = CrudOperations.troopSearch(troops, number);
        if(CrudOperations.troopSearch(troops, number) != -1){
            troops.set(index, new Person(name, troops.get(index).getNumber()));
            return true;
        }
        return false;
    }

    // Function that Adds a trooper to the ArrayList, this is fully editable each element via HTTP Requests
    @GetMapping("/troops/add")
    public String addTrooper(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage, @RequestParam(value = "ammo", defaultValue = "null") String ammo, @RequestParam(value = "water", defaultValue = "null") String water, @RequestParam(value = "weapon", defaultValue = "null") String weapon, @RequestParam(value = "rations", defaultValue = "null") String rations) {
        if(name.equals("null") || number.equals("null") || percentage.equals("null") || ammo.equals("null") || water.equals("null") || weapon.equals("null") || rations.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
        troops.add(p);
        return (p.getName() + " has been added");
    }

    // Controller function to initialise the Sorts the List by Ascending Percentage and shows Top Five Troopers
    @GetMapping("/topfivehighperc")
    public static List<Person> topFiveBy(@RequestParam(value = "percfive", defaultValue = "asc") String toporder) {
        System.out.println("Printing from the Controller sort by Top Five Percentage");
        return TrooperExtras.topFive(troops, "asc");
    }

    // Controller function to initialise to Sort the List by Ascending Ammo and shows Top Five Troopers
    @GetMapping("/topfivehighammo")
    public static List<Person> topFiveByAmmo(@RequestParam(value = "ammofive", defaultValue = "desc") String ammoorder) {
        System.out.println("Printing from the Controller sort by Top Five Ammo");
        return TrooperExtras.topFiveAmmo(troops, "desc");
    }

    // Controller function to initialise to Sorts the List by Ascending Water and shows Top Five Troopers
    @GetMapping("/topfivehighwater")
    public static List<Person> topFiveByWater(@RequestParam(value = "waterfive", defaultValue = "desc") String waterorder) {
        System.out.println("Printing from the Controller sort by Top Five Water");
        return TrooperExtras.topFiveWater(troops, "desc");
    }

    // Controller function to initialise to Sorts the List by Ascending Rations and shows Top Five Troopers
    @GetMapping("/topfivehighrations")
    public static List<Person> topFiveByRations(@RequestParam(value = "rationsfive", defaultValue = "desc") String rationsorder) {
        System.out.println("Printing from the Controller sort by Top Five Rations");
        return TrooperExtras.topFiveRations(troops, "desc");
    }


    // Incomplete functions that are in testing phase
//    @GetMapping("/spawn")
//    public static List<Person> spawn(@RequestParam(value = "rationsfive", defaultValue = "desc") String rationsorder) {
//        System.out.println("Printing from the Controller sort by Top Five Rations");
//        return CrudOperations.spawn(String numbers);
//    }
//
//    @GetMapping("/troops/spwan/infantry")
//    public static String spawnTrooper(@RequestParam(value = "name", defaultValue = "Troopers Name") String name, @RequestParam(value = "number", defaultValue = index +1) String number, @RequestParam(value = "percentage", defaultValue = "0") String percentage, @RequestParam(value = "ammo", defaultValue = "120") String ammo, @RequestParam(value = "water", defaultValue = "5") String water, @RequestParam(value = "weapon", defaultValue = "SA-80") String weapon, @RequestParam(value = "rations", defaultValue = "3") String rations) {
//        if(name.equals("null") || number.equals("null") || percentage.equals("null") || ammo.equals("null") || water.equals("null") || weapon.equals("null") || rations.equals("null")){
//            return "Parameters not accepted";
//        }
//        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
//        troops.add(p);
//        return (p.getName() + " added");
//    }
//
//    @GetMapping("/troops/spawn/ready/trooper")
//    public static String trooperSpawning(@RequestParam(value = "name", defaultValue = "Troopers name")) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);
//        String spawnName = null;
//        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
//        spawnName = Person.name;
//        troops.add(spawnName, "51", "0", "120", "5", "SA-80", "3");
//
//        return (p.getName() + " has been added");
//    }

}







