package com.main;

public class Square {

	public Square() {// default constructor
	}

	public Square(double len,String ss) {// used in initializing object member
		this.length = len;
	}

	private double length;

	public double getLength() {// to get value of object member
		return length;
	}

	public void setLength(double length) {/*
											 * to set a certain value to object
											 * member and encapsulate it
											 */
		if (length < 20 && length != 0)
			this.length = length;
	}
	//so getter is just a method getting a private field and setter is setting a new field
	//actually the setter take a value and fill the private value in built class
	//and getter get this value any time that need to call any where outside class

	public double surface() {
		// body of method
		return length * length;
	}

	public double area() {
		return 4 * length;
	}

	public void printInfo(boolean byDetail) {

		System.out.println("lenght is " + length);

		if (byDetail)
			System.out.println("by detail is true");
	}

}

//class Clock {  
//    String time;  
//
//    void setTime (String t) {  
//       time = t;  
//    }  
//
//    String getTime() {  
//       return time;  
//    }  
//}  
//
//
//class ClockTestDrive {  
//public static void main (String [] args) {  
//Clock c = new Clock;  
//
//c.setTime("12345")  
//String tod = c.getTime();  
//System.out.println(time: " + tod);  
//}
//}  

//When you run the program, program starts in mains,
//
//object c is created
//function setTime() is called by the object c
//the variable time is set to the value passed by
//function getTime() is called by object c
//the time is returned
//It will passe to tod and tod get printed out