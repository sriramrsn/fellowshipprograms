package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Insertionsort {
	public static void main(String args[])
	{
		int a[]= {21,1,12,16,17,18};
		String str[]= {"hi","pick","book","deck"};
		Utility.insertionSortInteger(a);
		
		Utility.insertionSortString(str);
	for(int i=0;i<a.length;i++) {
			System.out.println(""+str[i]);
			}
	}

}
