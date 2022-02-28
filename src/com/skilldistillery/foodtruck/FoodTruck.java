package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	private static int nextID = 0;
	
	private int idNumber;
	private String  name;
	private String type;
	private double rating;
	
	public FoodTruck(String name, String type, double rating) {
		super();
		this.idNumber = nextID++;
		this.name = name;
		this.type = type;
		this.rating = rating;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [ ID Number = ");
		builder.append(idNumber);
		builder.append(", name = ");
		builder.append(name);
		builder.append(", type = ");
		builder.append(type);
		builder.append(", rating = ");
		builder.append(rating);
		builder.append(" ]");
		return builder.toString();
	}

	
	

	
}
