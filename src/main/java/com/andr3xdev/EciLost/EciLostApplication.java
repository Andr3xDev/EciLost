package com.andr3xdev.EciLost;

import com.andr3xdev.EciLost.entities.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EciLostApplication {

	public static void main(String[] args) {
		String name = "asdsadss";
		String description = "arroz";

		Item a = new Item(name, description);
		a.setName("a");
		System.out.println(a.getName());
		System.out.println(a.toString());
	}
}
