package com.bridgelabz.fellowshipprograms.basiccore;
import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.*;
public class Flipcoin {
	public static void main(String args[])
	{
		int[ ] arr =new int [2];
		Scanner sc= new Scanner(System.in);
		System.out.println("number of flips of coinns");
		int n =sc.nextInt();
		arr=Utility.flipcoin(n);
	System.out.println("percentage of head"+100*arr[0]/n );
	System.out.println("percentage of tail"+100*arr[1]/n );
	}

}
