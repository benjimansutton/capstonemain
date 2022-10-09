package com.benjiman.capstone;


import org.springframework.web.bind.annotation.*;

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
    public static List<Person> topFiveBy(@RequestParam(value = "percfive", defaultValue = "desc") String toporder) {
        System.out.println("Printing from the Controller sort by Top Five Percentage");
        return SortClass.topFive(troops, "asc");
    }

    // Searches the Troopers by their number
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

    // Trooper Extras including Ammo, Water, Weapon, Rations

    @GetMapping("/sortammo")
    public static List<Person> sortTroopsByAmmo(@RequestParam(value = "ammoorder", defaultValue = "asc") String ammoorder) {
        System.out.println("Printing from the Controller sort by Ammo");
        return TrooperExtras.sortAmmo(troops, ammoorder);
    }

    @GetMapping("/sortwater")
    public static List<Person> sortTroopsByWater(@RequestParam(value = "waterorder", defaultValue = "asc") String waterorder) {
        System.out.println("Printing from the Controller sort by Water");
        return TrooperExtras.sortWater(troops, waterorder);
    }

    @GetMapping("/sortweapon")
    public static List<Person> sortTroopsByWeapon(@RequestParam(value = "weaponorder", defaultValue = "asc") String weaponorder) {
        System.out.println("Printing from the Controller sort by Weapon");
        return TrooperExtras.sortWeapon(troops, weaponorder);
    }

    @GetMapping("/sortrations")
    public static List<Person> sortTroopsByRations(@RequestParam(value = "rationsorder", defaultValue = "asc") String rationsorder) {
        System.out.println("Printing from the Controller sort by Rations");
        return TrooperExtras.sortRations(troops, rationsorder);
    }

    // Adds a trooper to the ArrayList
    @GetMapping("/troops/add")
    public String addTrooper(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage, @RequestParam(value = "ammo", defaultValue = "null") String ammo, @RequestParam(value = "water", defaultValue = "null") String water, @RequestParam(value = "weapon", defaultValue = "null") String weapon, @RequestParam(value = "rations", defaultValue = "null") String rations) {
        if(name.equals("null") || number.equals("null") || percentage.equals("null") || ammo.equals("null") || water.equals("null") || weapon.equals("null") || rations.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
        troops.add(p);
        return (p.getName() + " has been added");
    }

    // Sorts the List by Ascending Ammo and shows Top Five Troopers
    @GetMapping("/topfivehighammo")
    public static List<Person> topFiveByAmmo(@RequestParam(value = "ammofive", defaultValue = "desc") String ammoorder) {
        System.out.println("Printing from the Controller sort by Top Five Ammo");
        return TrooperExtras.topFiveAmmo(troops, "desc");
    }

    // Sorts the List by Ascending Water and shows Top Five Troopers
    @GetMapping("/topfivehighwater")
    public static List<Person> topFiveByWater(@RequestParam(value = "waterfive", defaultValue = "desc") String waterorder) {
        System.out.println("Printing from the Controller sort by Top Five Water");
        return TrooperExtras.topFiveWater(troops, "desc");
    }

    // Sorts the List by Ascending Rations and shows Top Five Troopers
    @GetMapping("/topfivehighrations")
    public static List<Person> topFiveByRations(@RequestParam(value = "rationsfive", defaultValue = "desc") String rationsorder) {
        System.out.println("Printing from the Controller sort by Top Five Rations");
        return TrooperExtras.topFiveRations(troops, "desc");
    }





}







