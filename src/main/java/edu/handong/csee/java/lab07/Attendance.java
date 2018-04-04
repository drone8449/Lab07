package edu.handong.csee.java.lab07;    // package name
import java.util.*;   // import * class

public class Attendance {   // make public class 'Attendance'
	private String name = "";   // declare and initialize name
	private int year = 0;   // declare and initialize year
	private String student_id = "";   // declare and initialize student_id
	private int missed = 0;   // declare and initialize missed
	
	public Attendance() {   // make public method 'Attendance'
		this.name = "Null";   // initialize this.name
		this.year = 0;   // initialize this.year
		this.student_id = "Null";   // initialize this.student_id 
		this.missed = 0;   // initialize this.missed
	}
	
	public Attendance(String name, int year, String student_id, int missed) {   // make public method 'Attendance', and parameter is name, year, student_id, missed
		this.name = name;   // this.name is name
		this.year = year;   // this.year is year
		this.student_id = student_id;   // this.student_id is student_id 
		this.missed = missed;   // this.missed is missed
	}
    
	public String get_name() {   // make public method 'get_name'
		return name;   // return name value
	}
	
	public int get_year() {   // make public method 'get_year'
		return year;  // return year value
	}
	
	public String get_id() {   // make public method 'get_id'
		return student_id;   // return student_id value
	}
	
	public int get_missed() {   // make public method 'get_missed'
		return missed;   // return missed value
	}
	
	public void set_name(String name) {   // make public method 'set_name', and parameter is name
		this.name = name;    // this.name is name
	}
	
	public void set_year(int year) {    // make public method 'set_year', and parameter is year
		this.year = year;   // this.year is year
	}
	
	public void set_id(String student_id) {    // make public method 'set_id', and parameter is student_id
		this.student_id = student_id;    // this.student_id is student_id
	}
	
	public void set_missed(int missed) {    // make public method 'set_missed', and parameter is missed
		this.missed = missed;   // this.missed is missed
	}
	
	public static void main(String[] args) {   // main method 
		Attendance s_1 = new Attendance();   // declare object 's_1' to use Attendance Class 
		Attendance s_2 = new Attendance();   // declare object 's_2' to use Attendance Class 
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);   // declare object 's_3' to use Attendance Class 
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);   // declare object 's_4' to use Attendance Class 
		
		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);   // set the name, year, id, missed value to s_1
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);   // set the name, year, id, missed value to s_2
		
		Random randomGenerator = new Random();    // declare object 'randomGenerator' to use Random Class 
		
		s_1.set_missed(randomGenerator.nextInt(10));   // put random number(1~10) to s_1's missed
		s_2.set_missed(randomGenerator.nextInt(10));   // put random number(1~10) to s_2's missed
		s_3.set_missed(randomGenerator.nextInt(10));   // put random number(1~10) to s_3's missed
		s_4.set_missed(randomGenerator.nextInt(10));   // put random number(1~10) to s_4's missed
		
		if(s_1.get_missed() > 6) {   // if s_1's missed is over than 6
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");   // print fail message
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());  // print number of absence
		}
		else   // if s_1's missed is not over than 6
			System.out.println("We'll see about the grade, " + s_1.get_name());   // print not fail message
		
		if(s_2.get_missed() > 6) {   // if s_2's missed is over than 6
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");   // print fail message
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());   // print number of absence
		}
		else   // if s_2's missed is not over than 6
			System.out.println("We'll see about the grade, " + s_2.get_name());   // print not fail message
		
		if(s_3.get_missed() > 6) {    // if s_3's missed is over than 6
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");   // print fail message
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());    // print number of absence
		}
		else    // if s_3's missed is not over than 6
			System.out.println("We'll see about the grade, " + s_3.get_name());   // print not fail message
		
		if(s_4.get_missed() > 6) {   // if s_4's missed is over than 6
			System.out.println("I'm sorry " + s_4.get_name() + ". You fail this course");   // print fail message
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());    // print number of absence
		}
		else   // if s_4's missed is not over than 6
			System.out.println("We'll see about the grade, " + s_4.get_name());   // print not fail message
	}
}
