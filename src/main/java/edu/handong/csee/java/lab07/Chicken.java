package edu.handong.csee.java.lab07;

public class Chicken {
private String name;
private double price;
private int stars;

public Chicken()
{
	this.name = "";
	this.price = 0.0;
	this.stars = 0;
}

public Chicken(String name, double price, int stars) {
	this.name = name;
	this.price = price;
	this.stars= stars;
}

public String get_name() {
	return this.name;
}

public double get_price() {
	return this.price;
}

public int get_stars() {
	return this.stars;
}

public void set_name(String name) {
	this.name = name;
}

public void set_price(double price) {
	this.price = price;
}

public void set_stars(int stars) {
	this.stars = stars;
}

public static void main(String[] args) {
	Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);
	Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);
	Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);
	
	menu1.set_stars(3);
	menu2.set_stars(4);
	menu3.set_stars(1);
	
	System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
	System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());
	System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());
}
}
