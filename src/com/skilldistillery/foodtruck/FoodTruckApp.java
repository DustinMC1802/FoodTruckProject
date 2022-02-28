package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruck spokaneTrucks[] = new FoodTruck[5];

//Get inputs from the user to fill the spokaneTrucks array

		// for loop to fill ea
		for (int i = 0; i < 5; i++) {

			System.out.println("Please enter the name of the food truck, or if you want to quit, type \"quit\" :");
			String name = sc.nextLine();

			if (name.equals("quit")) {

				break;
			}

			System.out.println("Please enter the type of food served:");
			String type = sc.nextLine();

			System.out.println("On a scale of 1 to 5, with 5 being the highest, please rate the food truck");
			double rating = sc.nextDouble();
			sc.nextLine();

			spokaneTrucks[i] = new FoodTruck(name, type, rating);
		}

		System.out.println("");
		
		System.out.println("Please choose from the following:");
		System.out.println("Press 1 to list all existing food trucks");
		System.out.println("Press 2 to see the average rating of the food trucks");
		System.out.println("Press 3 to display the highest rated food truck");
		System.out.println("Press 4 to quit");
		
		

		sc.close();
	}

}
