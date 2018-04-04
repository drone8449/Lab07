package edu.handong.csee.java.lab07;   // package name

import java.util.Scanner;   // import Scanner class

/**
 * This class implements a calculator that computes century from year.
 * @author 21700184
 */
public class YearToCentury {   // make public class 'YearToCentury'
	int year;   // declare integer year
    
	/**
	 * This is a method for storing 0 to year
	 */
	public YearToCentury() {   // make public method 'YearToCentury'
		year = 0;   // year is 0
	}
	
	/**
	 * This is a method for storing year value
	 */
	public YearToCentury(int year) {   // make public method 'YearToCentury', and parameter is year
		this.year = year;   // this.year is year 
	}
	
	/**
	 * This is a method for calculating century
	 */
	public int calc_century() {   // make public method 'calc_century'
		if(year % 100 == 0)    // if year is divided off 
			year = year / 100;    // year is 'year / 100'
		else {   // if year is not divided off
			year = (year / 100) + 1;   // year is '(year / 100) + 1'
		}
		return year;   // return year value
	}
public static void main(String [] args)   // main method 
  {
	int yr = 0;   // declare integer yr
	Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
	
	System.out.println("Input year: ");   // print message Input year: "
	yr = keyboard.nextInt();   // input value is 'yr'
	
	YearToCentury year = new YearToCentury(yr);   // declare object 'year' to use YearToCentury Class
	System.out.println(yr + " is " + year.calc_century() + "th century.");	// print year and century
  }
}
