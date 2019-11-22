package com.bridgelabz.fellowshipprograms.logical;

import java.util.Scanner;


public class StopWatch {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start to start the stopwatch: ");
		String start= sc.next();
		long starttime= System.currentTimeMillis();
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter end to end the stopwatch: ");
		String end= sc1.next();
		long endtime= System.currentTimeMillis();
		double  time=(endtime-starttime)/1000.0;
		System.out.println("Eclapsed Time: "+time);
		sc.close();
	}

	} 

