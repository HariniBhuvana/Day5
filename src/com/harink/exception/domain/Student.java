package com.harink.exception.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.harink.exception.domain.exception.AgeNotWithinRangeException;
import com.harink.exception.domain.exception.NameNotValidException;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private String course;
	public Student() {
		
	}
	
	public Student(int rollno, String name, int age, String course) throws Exception  {
		if(age<15 || age>21)
		{throw new AgeNotWithinRangeException("AgeNotWithinRangeException");}
	
		Pattern pattern = Pattern.compile("[a-zA-Z]*");
		   Matcher matcher = pattern.matcher(name);
	       if (!matcher.matches()) {
	           throw new NameNotValidException("NameNotValidException");
	      } 
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	/*public static String Student(String name,int age) throws Exception {
		if(age<15 || age>21)
		{throw new AgeNotWithinRangeException("AgeNotWithinRangeException");}
	
		Pattern pattern = Pattern.compile("[a-zA-Z]*");
		   Matcher matcher = pattern.matcher(name);
	       if (!matcher.matches()) {
	           throw new NameNotValidException("NameNotValidException");
	      } else {
            return name;	  }*/
		
	}
	

