package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Primenumber {
	public static void main(String args[])
	{
		int count=0;
		for(int i=2;i<1000;i++)
		{
		boolean check=Utility.primeCheck(i);
			if(check==true)
			{
				System.out.println(i);
				count++;
			}
	}
		System.out.println(count);
	}
}
