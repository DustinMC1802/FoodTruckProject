package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruck {
	
	Scanner input = new Scanner(System.in);

	
//	Create methods to assign fields to id number, Name, food type, and rating
	
	private int idNumber() {
		int idNum = 0;
		return idNum;
	}
	private String truckName() {
		String name = "";
		System.out.println("Please enter the Food Truck's name:");
		name = input.next();
		return name;
	}
	private String foodType() {
		String type = "";
		System.out.println("Please enter the Food Truck's food type:");
		type = input.next();
		return type;
	}
	private int rating () {
		int rating = 0;
		System.out.println("Please enter your rating for the Food Truck:");
		rating = input.nextInt();
		return rating;
	}
}
