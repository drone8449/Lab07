package edu.handong.csee.java.lab07;    // package name
import java.util.*;   // import * class

public class Attendance {   // make public class 'Attendance'
	private String name = "";
	private int year = 0;
	private String student_id = "";
	private int missed = 0;
	
	public Attendance() {
		this.name = "Null";
		this.year = 0;
		this.student_id = "Null";
		this.missed = 0;
	}
	
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
	}
    
	public String get_name() {
		return name;
	}
	
	public int get_year() {
		return year;
	}
	
	public String get_id() {
		return student_id;
	}
	
	public int get_missed() {
		return missed;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public void set_year(int year) {
		this.year = year;
	}
	
	public void set_id(String sudent_id) {
		this.student_id = student_id;
	}
	
	public void set_missed(int missed) {
		this.missed = missed;
	}
	
	public static void main(String[] args) {
		Attendance s_1 = new Attendance();
		Attendance s_2 = new Attendance();
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);
		
		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);
		
		Random randomGenerator = new Random();
		
		s_1.set_missed(randomGenerator.nextInt(10));
		s_2.set_missed(randomGenerator.nextInt(10));
		s_3.set_missed(randomGenerator.nextInt(10));
		s_4.set_missed(randomGenerator.nextInt(10));
		
		if(s_1.get_missed() > 6) {
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());
		}
		else
			System.out.println("We'll see about the grade, " + s_1.get_name());
		
		if(s_2.get_missed() > 6) {
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());
		}
		else
			System.out.println("We'll see about the grade, " + s_2.get_name());
		
		if(s_3.get_missed() > 6) {
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());
		}
		else
			System.out.println("We'll see about the grade, " + s_3.get_name());
		
		if(s_4.get_missed() > 6) {
			System.out.println("I'm sorry " + s_4.get_name() + ". You fail this course");
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());
		}
		else
			System.out.println("We'll see about the grade, " + s_4.get_name());
	}
}
