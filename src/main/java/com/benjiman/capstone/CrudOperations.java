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

    // Method for the delete function
    public static boolean delete(List<Person> troops, int index){
        int troopIndex = troopSearch(troops, index);
        if(troopIndex == -1) return false;
        troops.remove(index);
        return true;
    }



}