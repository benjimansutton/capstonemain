package com.benjiman.capstone;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.benjiman.capstone.CapstoneApplication.troops;

/*

 * This is the Controller class that holds all the functions that map using the REST API,
 * HTTP callings. The use of postman to show the data visually has been used to capture the
 * HTTP requests.
 */
@RestController
public class Controller {

    /*

     * This function called getXML which is the type of List of persons doesn't take any parameters,
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call XMLData and the function GrabXML. The HTTP request of xml is mapped to this  function.
     */
    @GetMapping("/xml")
    public static List<Person> getXML() {
        System.out.println("Printing from the Controller XML");
        return XMLData.GrabXML();
    }

    /*

     * This function called getTroopersByXML which is the type of List of persons that takes a parameter String type,
     * order, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortNum. The HTTP request of getTroopersByXML is mapped to this function.
     */
    @GetMapping(path="/troops/getTroopersByXML")
    public List<Person> getTroopersByXML(@RequestParam(value = "order", defaultValue = "asc") String order) {
        System.out.println("Printing from the Controller sort by XML Export");
        return SortClass.sortNum(troops, order);
    }

    /*

     * This function called sortTroopsByNumber which is the type of List of persons that takes a parameter String type,
     * order, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortNum this then takes the troops list and the order as the parameters.
     * The HTTP request of sortTroopsByNumber is mapped to this function.
     */
    @GetMapping("/sortTroopsByNumber")
    public static List<Person> sortTroopsByNumber(@RequestParam(value = "order", defaultValue = "asc") String order) {
        System.out.println("Printing from the Controller sort by Number");
        return SortClass.sortNum(troops, order);
    }

    /*

     * This function called sortTroopsByPercentage which is the type of List of persons that takes a parameter String
     * type, sorted, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortPerc this then takes the troops list and the sorted as the parameters.
     * The HTTP request of sortTroopsByPercentage is mapped to this function.
     */
    @GetMapping("/sortTroopsByPercentage")
    public static List<Person> sortTroopsByPercentage(@RequestParam(value = "perc", defaultValue = "asc") String sorted) {
        System.out.println("Printing from the Controller sort by Percentage");
        return SortClass.sortPerc(troops, sorted);
    }

    /*

     * This function called sortTroopsByAmmo which is the type of List of persons that takes a parameter String type,
     * ammoOrder, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortPerc this then takes the troops list and the sorted as the parameters.
     * The HTTP request of sortTroopsByAmmo is mapped to this function.
     */
    @GetMapping("/sortTroopsByAmmo")
    public static List<Person> sortTroopsByAmmo(@RequestParam(value = "ammoOrder", defaultValue = "asc") String ammoOrder) {
        System.out.println("Printing from the Controller sort by Ammo");
        return SortClass.sortAmmo(troops, ammoOrder);
    }

    /*

     * This function called sortTroopsByWater which is the type of List of persons that takes a parameter String type,
     * waterOrder, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortWater this then takes the troops list and the waterOrder as the parameters.
     * The HTTP request of sortTroopsByWater is mapped to this function.
     */
    @GetMapping("/sortTroopsByWater")
    public static List<Person> sortTroopsByWater(@RequestParam(value = "waterOrder", defaultValue = "asc") String waterOrder) {
        System.out.println("Printing from the Controller sort by Water");
        return SortClass.sortWater(troops, waterOrder);
    }

    /*

     * This function called sortTroopsByWeapon which is the type of List of persons that takes a parameter String type,
     * weaponOrder, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortWeapon this then takes the troops list and the weaponOrder as the parameters.
     * The HTTP request of sortTroopsByWeapon is mapped to this function.
     */
    @GetMapping("/sortTroopsByWeapon")
    public static List<Person> sortTroopsByWeapon(@RequestParam(value = "weaponOrder", defaultValue = "asc") String weaponOrder) {
        System.out.println("Printing from the Controller sort by Weapon");
        return SortClass.sortWeapon(troops, weaponOrder);
    }

    /*

     * This function called sortTroopsByRations which is the type of List of persons that takes a parameter String type,
     * rationsOrder, and it also sets the request mapping to order and the default value of asc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call SortClass and the function sortRations this then takes the troops list and the rationsOrder as the parameters.
     * The HTTP request of sortTroopsByRations is mapped to this function.
     */
    @GetMapping("/sortTroopsByRations")
    public static List<Person> sortTroopsByRations(@RequestParam(value = "rationsOrder", defaultValue = "asc") String rationsOrder) {
        System.out.println("Printing from the Controller sort by Rations");
        return SortClass.sortRations(troops, rationsOrder);
    }

    /*

     * This function called searchTrooperByNumber which is the type of Person that takes a parameter int type,
     * number, and it also sets the path mapping to it.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call CrudOperations class and the function troopSearch this then takes the troops list and the number as the parameters.
     * The HTTP request of searchTrooperByNumber is mapped to this function.
     * Inside this function we have an if statement that if the index number we have passed as a parameter
     * and if the index doesnt exist then a -1 (false) will then return the error message.
     * If the index number does exist then it will return that Person at the Index.
     */
    @GetMapping("/troops/searchTrooperByNumber/{number}")
    public static Person searchTrooperByNumber(@PathVariable int number) {
        System.out.println("Printing from the Controller sort by search by number");
        int index = CrudOperations.troopSearch(troops, number);
        if (index == -1) {
            return new Person("Trooper doesn't exist", "0", "0 Percent", "0", "0", "NULL", "0");
        } else {
            return troops.get(index);
        }
    }

    /*

     * This function called deleteTroop which is the type of String that takes a parameter int type,
     * number, and it also sets the path mapping to it.
     * it calls a print statement for the console log to verify it's been called. It then calls the call CrudOperations
     * class and the function troopSearch this then takes the troops list and the number as the parameters.
     * The HTTP request of deleteTroop is mapped to this function.
     * Inside this function we have an if statement that if the troopNumber is less than or equal to 0 then a
     * error message is returned, otherwise it will get the Person and put the list of troops to a variable p
     * it will then get the troops number set by troopNumber and then remove it. It will then return the persons name
     * along with the message " has been removed".
     */
    @GetMapping(path="/troops/deleteTroop/{number}")
    public String deleteTroop(@PathVariable int number){
        int troopNumber = CrudOperations.troopSearch(troops, number);
        if(troopNumber <= 0){
            return "Service Number not recognised";
        } else{
            Person p = troops.get(troopNumber);
            troops.remove(troopNumber);
            return (p.getName() + " has been removed.");
        }
    }

    /*

     * This function called update which is the type of boolean that takes a parameter int type,
     * number, and it also sets the path mapping to it and a parameter type of String name and sets the Request
     * mapping to it. It calls a print statement for the console log to verify it's been called.
     * It then calls the call CrudOperations class and the function troopSearch this then takes the troops list
     * and the number as the parameters. The HTTP request of update is mapped to this function.
     * Inside this function we have an if statement that takes the CrupOperations troopSearch as a parameter and if it's
     * not equals to -1 return the troops list and set it to the index number with a new Person that takes the
     * parameters of name, the troops number otherwise return false.
     */
    @GetMapping(path="troops/update/{number}")
    public static boolean update(@PathVariable int number, @RequestParam String name){
        int index = CrudOperations.troopSearch(troops, number);
        if(CrudOperations.troopSearch(troops, number) != -1){
            troops.set(index, new Person(name, troops.get(index).getNumber()));
            return true;
        }
        return false;
    }

    /*

     * This function called addTrooper which is the type of String that takes a parameters Strings of name, number,
     * percentage ammo, water, weapon and rations they all have the request parameters with the value as the same as
     * the string name and defaultValue of null. The HTTP request of addTrooper is mapped to this function.
     * This function holds an if statement that holds parameters for all the strings and to see if they are equals to
     * null OR if any of the others are null. This will return Parameters not accepted.
     * Otherwise, it will take a Person and set that to a variable p and creates a new Person that takes the parameters
     * of name, number, percentage, ammo, water, weapon and rations. It then takes that input and adds it to the troop
     * ArrayList. It will then return a message of the persons name along with " has been added".
     */
    @GetMapping("/troops/addTrooper")
    public String addTrooper(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number, @RequestParam(value = "percentage", defaultValue = "null") String percentage, @RequestParam(value = "ammo", defaultValue = "null") String ammo, @RequestParam(value = "water", defaultValue = "null") String water, @RequestParam(value = "weapon", defaultValue = "null") String weapon, @RequestParam(value = "rations", defaultValue = "null") String rations) {
        if(name.equals("null") || number.equals("null") || percentage.equals("null") || ammo.equals("null") || water.equals("null") || weapon.equals("null") || rations.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, number, percentage, ammo, water, weapon, rations);
        troops.add(p);
        return (p.getName() + " has been added");
    }

    /*

     * This function called topFiveBy which is the type of List of persons that takes a parameter String type,
     * topOrder, and it also sets the request mapping to toporder and the default value of desc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call TrooperExtras and the function topFive this then takes the troops list and the topOrder as the parameters.
     * The HTTP request of topFiveHighPercentage is mapped to this function.
     */
    @GetMapping("/topFiveHighPercentage")
    public static List<Person> topFiveBy(@RequestParam(value = "percFive", defaultValue = "desc") String topOrder) {
        System.out.println("Printing from the Controller sort by Top Five Percentage");
        return TrooperExtras.topFive(troops, "desc");
    }

    /*

     * This function called topFiveByAmmo which is the type of List of persons that takes a parameter String type,
     * ammoOrder, and it also sets the request mapping to ammoOrder and the default value of desc.
     * it calls a print statement for the console log to verify it's been called. It then calls the
     * call TrooperExtras and the function topFiveAmmo this then takes the troops list and the ammoOrder as the parameters.
     * The HTTP request of topFiveByAmmo is mapped to this function.
     */
    @GetMapping("/topFiveByAmmo")
    public static List<Person> topFiveByAmmo(@RequestParam(value = "ammoFive", defaultValue = "desc") String ammoOrder) {
        System.out.println("Printing from the Controller sort by Top Five Ammo");
        return TrooperExtras.topFiveAmmo(troops, "desc");
    }

    /*

     * This function called topFiveByWater which is the type of List of persons that takes a parameter String type,
     * topFiveByWater, and it also sets the request mapping to waterFive and the default value of desc.
     * It calls a print statement for the console log to verify it's been called. It then calls the
     * call TrooperExtras and the function topFiveWater this then takes the troops list and the waterOrder as the parameters.
     * The HTTP request of topFiveByWater is mapped to this function.
     */
    @GetMapping("/topFiveByWater")
    public static List<Person> topFiveByWater(@RequestParam(value = "waterFive", defaultValue = "desc") String topFiveByWater) {
        System.out.println("Printing from the Controller sort by Top Five Water");
        return TrooperExtras.topFiveWater(troops, "desc");
    }

    /*

     * This function called topFiveByRations which is the type of List of persons that takes a parameter String type,
     * rationsOrder, and it also sets the request mapping to rationsFive and the default value of desc.
     * It calls a print statement for the console log to verify it's been called. It then calls the
     * call TrooperExtras and the function topFiveRations this then takes the troops list and the rationsOrder as the parameters.
     * The HTTP request of topFiveByRations is mapped to this function.
     */
    @GetMapping("/topFiveByRations")
    public static List<Person> topFiveByRations(@RequestParam(value = "rationsFive", defaultValue = "desc") String rationsOrder) {
        System.out.println("Printing from the Controller sort by Top Five Rations");
        return TrooperExtras.topFiveRations(troops, "desc");
    }

    /*

     * This function called spawnInfantry which is the type of String that takes a parameter String type,
     * name, and it also sets the request mapping to name and the default value of null.
     * It calls a print statement for the console log to verify it's been called. It then calls an if statement that
     * takes the name parameter and if it equals to null then it returns "Parameters not accepted".
     * Otherwise, it would take the Person and assign a new Person to the p variable. it will set all the parameters,
     * but you specify the name fo the infantry member. It will then take that and add it to the list of troops.
     * Then finally returns the p variable including the name and the message " added".
     */
    @GetMapping("/spawnInfantry")
    public static String spawnInfantry(@RequestParam(value = "name", defaultValue = "null") String name) {
        System.out.println("Printing from the Controller sort by spawn");
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "51", "0", "120", "5", "SA-80", "3");
        troops.add(p);
        return (p.getName() + " added");
    }

    /*

     * This function called spawnOfficer which is the type of String that takes a parameter String type,
     * name, and it also sets the request mapping to name and the default value of null.
     * It calls a print statement for the console log to verify it's been called. It then calls an if statement that
     * takes the name parameter and if it equals to null then it returns "Parameters not accepted".
     * Otherwise, it would take the Person and assign a new Person to the p variable. it will set all the parameters,
     * but you specify the name fo the infantry member. It will then take that and add it to the list of troops.
     * Then finally returns the p variable including the name and the message " added".
     */
    @GetMapping("/spawnOfficer")
    public static String spawnOfficer(@RequestParam(value = "name", defaultValue = "null") String name) {
        System.out.println("Printing from the Controller sort by spawn");
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "52", "0", "120", "5", "SA-80", "3");
        troops.add(p);
        return (p.getName() + " added");
    }

    /*

     * This function called spawnSpecialForces which is the type of String that takes a parameter String type,
     * name, and it also sets the request mapping to name and the default value of null.
     * It calls a print statement for the console log to verify it's been called. It then calls an if statement that
     * takes the name parameter and if it equals to null then it returns "Parameters not accepted".
     * Otherwise, it would take the Person and assign a new Person to the p variable. it will set all the parameters,
     * but you specify the name fo the infantry member. It will then take that and add it to the list of troops.
     * Then finally returns the p variable including the name and the message " added".
     */
    @GetMapping("/spawnSpecialForces")
    public static String spawnSpecialForces(@RequestParam(value = "name", defaultValue = "null") String name) {
        System.out.println("Printing from the Controller sort by spawn");
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "53", "0", "1200", "15", "M16", "3");
        troops.add(p);
        return (p.getName() + " added");
    }

    /*

     * This function called spawnRadioOperator which is the type of String that takes a parameter String type,
     * name, and it also sets the request mapping to name and the default value of null.
     * It calls a print statement for the console log to verify it's been called. It then calls an if statement that
     * takes the name parameter and if it equals to null then it returns "Parameters not accepted".
     * Otherwise, it would take the Person and assign a new Person to the p variable. it will set all the parameters,
     * but you specify the name fo the infantry member. It will then take that and add it to the list of troops.
     * Then finally returns the p variable including the name and the message " added".
     */
    @GetMapping("/spawnRadioOperator")
    public static String spawnRadioOperator(@RequestParam(value = "name", defaultValue = "null") String name) {
        System.out.println("Printing from the Controller sort by spawn");
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "54", "0", "120", "5", "PISTOL", "3");
        troops.add(p);
        return (p.getName() + " added");
    }

    /*

     * This function called spawnMedic which is the type of String that takes a parameter String type,
     * name, and it also sets the request mapping to name and the default value of null.
     * It calls a print statement for the console log to verify it's been called. It then calls an if statement that
     * takes the name parameter and if it equals to null then it returns "Parameters not accepted".
     * Otherwise, it would take the Person and assign a new Person to the p variable. it will set all the parameters,
     * but you specify the name fo the infantry member. It will then take that and add it to the list of troops.
     * Then finally returns the p variable including the name and the message " added".
     */
    @GetMapping("/spawnMedic")
    public static String spawnMedic(@RequestParam(value = "name", defaultValue = "null") String name) {
        System.out.println("Printing from the Controller sort by spawn");
        if(name.equals("null")){
            return "Parameters not accepted";
        }
        Person p = new Person(name, "55", "0", "0", "15", "MEDIC", "4");
        troops.add(p);
        return (p.getName() + " added");
    }

}







