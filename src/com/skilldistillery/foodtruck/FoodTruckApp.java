package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruck spokaneTrucks[] = new FoodTruck[5];
		
//Food truck arrays initialized to return values instead of null
		spokaneTrucks[0] = new FoodTruck("", "", 0);
		spokaneTrucks[1] = new FoodTruck("", "", 0);
		spokaneTrucks[2] = new FoodTruck("", "", 0);
		spokaneTrucks[3] = new FoodTruck("", "", 0);
		spokaneTrucks[4] = new FoodTruck("", "", 0);
		

//Get inputs from the user to fill the spokaneTrucks array

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

//Print the menu options
		double ratingSum = 0;
		double ratingAverage = 0;
		double highestRating = 0;

		System.out.println("Please choose from the following:");
		System.out.println("Press 1 to list all existing food trucks");
		System.out.println("Press 2 to see the average rating of the food trucks");
		System.out.println("Press 3 to display the highest rated food truck");
		System.out.println("Press 4 to quit");
		int menuChoice = sc.nextInt();

		while (menuChoice != 4) {

			if (menuChoice == 1) {
				for (int j = 0; j < spokaneTrucks.length; j++) {
					// Need a technique to exclude the nulls
					if (spokaneTrucks[j].getRating() != 0) {
						System.out.println(spokaneTrucks[j]);
					}
				}
				System.out.println("Please choose from the following:");
				System.out.println("Press 1 to list all existing food trucks");
				System.out.println("Press 2 to see the average rating of the food trucks");
				System.out.println("Press 3 to display the highest rated food truck");
				System.out.println("Press 4 to quit");
				menuChoice = sc.nextInt();

			} 
			else if (menuChoice == 2) {
				for (int k = 0; k < spokaneTrucks.length; k++) {
					// Need a technique to exclude the nulls
					if (spokaneTrucks[k].getRating() > 0) {
						double ratingSummer = spokaneTrucks[k].getRating();
						ratingSum = ratingSum + ratingSummer;
						// .length will not work if not all five slots are filled
						ratingAverage = ratingSum / spokaneTrucks.length;

					}
				}
				System.out.println("The average rating is " + ratingAverage);
				System.out.println("Please choose from the following:");
				System.out.println("Press 1 to list all existing food trucks");
				System.out.println("Press 2 to see the average rating of the food trucks");
				System.out.println("Press 3 to display the highest rated food truck");
				System.out.println("Press 4 to quit");
				menuChoice = sc.nextInt();


			} 
			else if (menuChoice == 3) {
				for (int l = 0; l < spokaneTrucks.length; l++) {
//					// Need a technique to exlude the nulls
					if (spokaneTrucks[l].getRating() < spokaneTrucks[l+1].getRating()) {
						System.out.println(spokaneTrucks[l+1].getName());
						
					}
					else {
						System.out.println(spokaneTrucks[l].getName());
					}
					
				}
				
				System.out.println("The highest rated restaurant is " + highestRating);
				System.out.println("Please choose from the following:");
				System.out.println("Press 1 to list all existing food trucks");
				System.out.println("Press 2 to see the average rating of the food trucks");
				System.out.println("Press 3 to display the highest rated food truck");
				System.out.println("Press 4 to quit");
				menuChoice = sc.nextInt();

			} 
			else {
				System.out.println("Please type a number between 1 and 4");
				System.out.println("Please choose from the following:");
				System.out.println("Press 1 to list all existing food trucks");
				System.out.println("Press 2 to see the average rating of the food trucks");
				System.out.println("Press 3 to display the highest rated food truck");
				System.out.println("Press 4 to quit");
				menuChoice = sc.nextInt();

			}
		}
		menuChoice = 4;
		sc.close();
	}

}
