package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Quadratic {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a,b,c values?");
	
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c= sc.nextDouble();
	
	System.out.println("delta: "+Utility.delta(a, b, c));
	
	double srt= Math.sqrt(Utility.delta(a, b, c));
	
	
	System.out.println("Root1: "+Utility.root1(a,b,srt));
	
	System.out.println("Root2: "+Utility.root2(a,b,srt));
	sc.close();
	}

}
