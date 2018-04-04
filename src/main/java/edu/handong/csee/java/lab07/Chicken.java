package edu.handong.csee.java.lab07;   // package name

/**
 * This class prints menu's rating
 * @author 21700184
 */
public class Chicken {   // make public class 'Chicken'
private String name;   // declare Stirng name
private double price;   // declare double price
private int stars;   // declare integer stars

/**
 * This is a method for initialization
 */
public Chicken()   // make public method 'Chicken'
{
	this.name = "";  // this.name is null
	this.price = 0.0;  // this.price is 0.0
	this.stars = 0;   // this.stars is 0
}

/**
 * This is a method for storing name, price, stars values
 */
public Chicken(String name, double price, int stars) {   // make public method 'Chicken', and parameter is name, price, stars
	this.name = name;   // this.name is name
	this.price = price;   // this.price is price
	this.stars = stars;   // this.stars is stars
}

/**
 * This is a method for returning this.name
 */
public String get_name() {   // make public method 'get_name'
	return this.name;   // return this.name value
}

/**
 * This is a method for returning this.price
 */
public double get_price() {   // make public method 'get_price'
	return this.price;   // return this.price value
}

/**
 * This is a method for returning this.stars
 */
public int get_stars() {   // make public method 'get_stars'
	return this.stars;   // return this.stars value
}

/**
 * This is a method for setting this.name
 */
public void set_name(String name) {  // make public method 'set_name', and parameter is name
	this.name = name;   // this.name is name 
}

/**
 * This is a method for setting this.price
 */
public void set_price(double price) {  // make public method 'set_price', and parameter is price
	this.price = price;   // this.price is price
}

/**
 * This is a method for setting this.stars
 */
public void set_stars(int stars) {   // make public method 'set_stars', and parameter is stars
	this.stars = stars;   // this.stars is stars
}

public static void main(String[] args) {   // main method
	Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);   // declare object 'menu1' to use Chicken Class 
	Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);   // declare object 'menu2' to use Chicken Class 
	Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);   // declare object 'menu3' to use Chicken Class 
	
	menu1.set_stars(3);   // put 3 to menu1's this.stars
	menu2.set_stars(4);   // put 4 to menu2's this.stars
	menu3.set_stars(1);   // put 1 to menu2's this.stars
	
	System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());   // print menu1's rating
	System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());   // print menu2's rating
	System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());   // print menu3's rating
}
}
