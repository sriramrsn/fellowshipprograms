package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Mergesort {

	public static void main(String args[])
	{
		int[]a= {9,3,4,5,1,6,10,8};
		Utility.mergeSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
