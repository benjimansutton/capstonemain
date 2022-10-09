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

	public static void main(String[] args) {

		Controller.getXML();
		Controller.sortTroopsByNumber("asc");
		Controller.sortTroopsByPercentage("asc");
//		SortClass.topFive("asc");
		Controller.searchTrooperByNumber(2);
//		addTroop("Ben Sutton", "66", "28", "120", "5", "SA-80", "2");

//		XMLData.GrabXML();
//		System.out.println(SortClass.sortAsc("desc"));
//		topFivePercHigh("asc");
		SpringApplication.run(CapstoneApplication.class, args);



	}

}
