package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Distance {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter x & y co-ordinates?");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println(Utility.euclideDistance(a, b));
		sc.close();
	}

}
