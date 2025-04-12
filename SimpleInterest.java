package com.bglab.methodsLevelOne;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal, rate, time");
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		calculateSimpleInterest(principle, rate, time);
	}
	public static void calculateSimpleInterest(double principle,double rate,double time)
	{
		System.out.println("welcome to pull process,....");
		double simpleInterest = (principle * rate * time)/100;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principle +", Rate of Interest "+rate+" and Time "+time);
	}
}
