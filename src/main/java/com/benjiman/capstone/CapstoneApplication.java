package com.benjiman.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

/*

 * Main Java Class CapstoneApplication that holds the main function (1) to Run the SpringBoot & Java Application,
 * With the first function (2) creating a new ArrayList troops and assigning the List of Person to it.
 */
@SpringBootApplication
public class CapstoneApplication {

	// (2)
	public static List<Person> troops = new ArrayList<>();

	// (1)
	public static void main(String[] args) {

		SpringApplication.run(CapstoneApplication.class, args);

	}

}