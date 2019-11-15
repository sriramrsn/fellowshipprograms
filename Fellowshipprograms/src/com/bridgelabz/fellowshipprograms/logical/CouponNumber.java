package com.bridgelabz.fellowshipprograms.logical;

import java.util.Scanner;

public class CouponNumber {
	public static String randome(int n)
	{
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"123456789";
	
		StringBuilder sb= new StringBuilder(n);
		for(int i=0;i<n;i++)
		{
			int random=(int)(str.length()*Math.random());
			sb.append(str.charAt(random));	
	}
		return sb.toString();
	}
	public static void main(String args[])
	{
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("how much length of coupon: ");
		int n= sc.nextInt();
		System.out.println("how many random numbers to be generated: ");
		int r=sc.nextInt();
		for(int i=0;i<r;i++)
		{
		System.out.println(CouponNumber.randome(n));
		sc.close();
		}
		}
	}


}
