package com.benjiman.capstone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.benjiman.capstone.CapstoneApplication.troops;

@SpringBootTest
class CapstoneApplicationTests {

	@Test
	void contextLoads() {

		// Test for the Grab XML
		System.out.println(XMLData.GrabXML());

		// Test for Sort Ammo with the descending as default
		System.out.println(SortClass.sortAmmo(troops, "desc"));

		// Test for Sort Percentage with the descending as default
		System.out.println(SortClass.sortPerc(troops, "desc"));

	}

}
