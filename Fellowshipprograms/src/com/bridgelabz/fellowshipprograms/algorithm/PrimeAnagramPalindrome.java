package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class PrimeAnagramPalindrome {
	public static void main(String args[])
	{
		int i;
		int []a=new int[168];
		String []str=new String[168];
		String []pa=new String[50];
		a=Utility.primeSeries(1000);
		for(i=0;i<168;i++)
		{
		System.out.println(a[i]);
		}
		str=Utility.primeAnagram(a);
		for(i=0;i<80;i++)
		{
			System.out.println(str[i]);
		}
		pa=Utility.primePalindrome(a);
		for(i=0;i<21;i++)
		{
			System.out.println(pa[i]);
		}
		
}
}