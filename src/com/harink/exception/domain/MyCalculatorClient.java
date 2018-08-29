package com.harink.exception.domain;


import java.util.Scanner;


public class MyCalculatorClient {
    public static void main(String args[]) throws Exception { 
    	int n;
    	int p;
    	MyCalculator calculator=new MyCalculator();
    	try(Scanner scanner=new Scanner(System.in)){
    			System.out.println("Enter n and p");
    			n = scanner.nextInt();
    			p = scanner.nextInt();
    			System.out.println(calculator.power(n, p));
    		}
    		catch(Exception e) {
    			if(e instanceof Exception) 
    				System.out.println(e.getMessage());
    			
    			if(e instanceof Exception)
    				System.out.println(e.getMessage());
    		}
    		
    	}
    }


