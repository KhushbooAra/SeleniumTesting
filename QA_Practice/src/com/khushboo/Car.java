package com.khushboo;

public class Car {

	private int doors;
	private int gears;
	private String ModelName;
	private String color;

	public Car(int doors, int gears, String ModelName, String Color) {
		this.doors = doors;
		this.gears = gears;
		this.ModelName = ModelName;
		this.color = Color;

	}

	public String getModelName() {
		return this.ModelName;
	}

	public int getDoors() {
		return this.doors;
	}

	public int getGears() {
		return gears;
	}

	public String getColor() {
		return color;
	}

}
