package com.bridgelabz.fellowshipprograms.basiccore;
import com.bridgelabz.fellowshipprograms.utility.*;
public class Flipcoin {
	public static void main(String args[])
	{
		int[ ] arr =new int [2];
		System.out.println("number of flips of coinns");
		int n =Utility.readInt();
		arr=Utility.flipCoin(n);
	System.out.println("percentage of head"+100*arr[0]/n );
	System.out.println("percentage of tail"+100*arr[1]/n );
	}

}
