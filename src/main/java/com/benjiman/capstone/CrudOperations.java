package com.benjiman.capstone;

import java.util.List;

/*

 * Main Java Class CrudOperations that holds the function troopSearch(1) which takes the parameters of the List of
 * Person troops and an int type of number. This has a for loop that iterates through the troops list and if the
 * parameter number is equal to the comparator and if it does it will return i and if its doesn't it will return a
 * -1 (false). The second function delete (2) is the type of boolean which takes parameters a List of Person troops
 * and the type int number. The first variable type of int troopIndex takes the troopSearch function which takes the
 * parameters troops list and int index. Once this is set we take an if statement and see if the troopIndex is equals
 * to -1 return false if not, take the troops list and remove that parameter of index.
 */
public class CrudOperations {

    // (1)
    public static int troopSearch(List<Person> troops, int number) {
        for(int i = 0; i <= troops.size()-1; i++){
            if(number == Integer.parseInt(troops.get(i).getNumber())){
                return i;
            }
        }
        return -1;
    }

    // (2)
    public static boolean delete(List<Person> troops, int index){
        int troopIndex = troopSearch(troops, index);
        if(troopIndex == -1) return false;
        troops.remove(index);
        return true;
    }



}