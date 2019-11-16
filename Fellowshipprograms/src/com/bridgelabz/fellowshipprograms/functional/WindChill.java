package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class WindChill {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temperature: ");
		double t=sc.nextDouble();
		System.out.println("Enter speed of wind: ");
		double v= sc.nextDouble();
		if(t<50 &&  3<v || v<120)
		{
			System.out.println(""+Utility.windChill(t, v));	
		}
		else
		{
			System.out.println("Invalid temperature and wind speed");
		}
		sc.close();
	}

}
