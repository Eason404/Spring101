package com.love2code.springdemo;

public class App {

	public static void main(String[] args) {
		
		// create a new object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
