package com.andr3xdev.items;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EciLostApplication {

	public static void main(String[] args) {
		String name = "asdsadss";
		String description = "arroz";

		Item a = new Item(name, description, 1);
		System.out.println(a);
	}
}