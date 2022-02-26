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
		return type;
	}
	
	private int rating () {
		int rating = 0;
		return rating;
	}
}
