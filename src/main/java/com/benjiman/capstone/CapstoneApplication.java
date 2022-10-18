package com.benjiman.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

// Main Class to Run the SpringBoot & Java Application
@SpringBootApplication
public class CapstoneApplication {

	// Local variable for troops that passes the List to a new ArrayList
	public static List<Person> troops = new ArrayList<>();

	// Main method to run the springboot program
	public static void main(String[] args) {

		SpringApplication.run(CapstoneApplication.class, args);

	}

}