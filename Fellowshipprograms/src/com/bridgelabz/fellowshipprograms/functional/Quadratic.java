package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a,b,c values?");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c= sc.nextDouble();
	double delta =b*b-4*a*c;
	System.out.println("delta: "+delta);
	double srt= Math.sqrt(delta);
	double root1= (-b+srt)/2*a;
	System.out.println("Root1: "+root1);
	double root2= (-b+srt)/2*a;
	System.out.println("Root2: "+root2);
	sc.close();
	}

}
