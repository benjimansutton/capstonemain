package com.benjiman.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class CapstoneApplication {

	// Local variable for troops that passes the List to a new ArrayList

	public static List<Person> troops = new ArrayList<>();
	private String name;
	private String number;

	public static void main(String[] args) {

		Controller.getXML();
		Controller.sortTroopsByNumber("asc");
		Controller.sortTroopsByPercentage("asc");
		Controller.topFiveByPercentage("desc");
		Controller.searchTrooperByNumber(2);

//		XMLData.GrabXML();
//		System.out.println(SortClass.sortAsc("desc"));
//		topFivePercHigh("asc");
		SpringApplication.run(CapstoneApplication.class, args);


	}

	@RequestMapping("/")
	public String getGreeting() {
		return "Hi its Ben and Your Live in New York City";
	}


//	@PostMapping(path="/troops/add")
//	public String addTroop(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "number", defaultValue = "null", @RequestParam(value = "percentage", defaultValue = "null")) String number){
//		this.name = name;
//		this.number = number;
//		if(name.equals("null") || number.equals("null")){
//			return "Parameters not accepted";
//		}
//		String percentage = null;
//		Person p = new Person(name, number, null);
//		troops.add(p);
//		return (p.getName() + " added");
//	}

}
