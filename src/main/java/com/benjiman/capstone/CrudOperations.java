package com.benjiman.capstone;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CrudOperations {

    public static int troopSearch(List<Person> troops, int index) {
        for(int i = 0; i <= troops.size()-1; i++){
            if(index == Integer.parseInt(troops.get(i).getNumber())){
                return i;
            }
        }
        return -1;
    }

//    @PostMapping(path="/troops/add")
//    public String addTroop(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null") String number){
//        if(name.equals("null") || number.equals("null")){
//            return "Parameters not accepted";
//        }
//        Person p = new Person(name, number);
//        troops.add(p);
//        return (p.getName() + " added");
//    }



}
