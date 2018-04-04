package edu.handong.csee.java.lab07;

import java.util.Scanner;

public class YearToCentury {
	int year;

	public YearToCentury() {
		year = 0;
	}
	public YearToCentury(int year) {
		this.year = year;
	}
	public int calc_century() {
		if(year % 100 == 0)
			year = year / 100;
		else {
			year = (year / 100) + 1;
		}
		return year;
	}
public static void main(String [] args)
  {
	int yr = 0;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Input year: ");
	yr = keyboard.nextInt();
	
	YearToCentury year = new YearToCentury(yr);
	System.out.println(yr + " is " + year.calc_century() + "th century.");	
  }
}
