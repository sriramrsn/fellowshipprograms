package com.bridgelabz.fellowshipprograms.algorithm;

import java.util.Arrays;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class GenericsforSearchSort {
	public static void main(String ar[])
	{

		Integer integer_array[] = {5,8,36,7,1,2};
		String string_array[] = {"asdjfl","khsd","owien","asdljf","wen"};
		
		integer_array=Utility.bubbleSortGenerics(integer_array);
		
		System.out.println(Arrays.toString(integer_array));
		
		string_array=Utility.bubbleSortGenerics(string_array);
		
		System.out.println(Arrays.toString(string_array));
		
		try {
		System.out.println("Enter integer value you want found");
		int key = Utility.readInt();
		int val = Utility.binarySearchGenerics(integer_array, 0, integer_array.length-1, key);
		if(val >0)
		{
			System.out.println("Found at index "+(val+1));
		}else {
			System.out.println("Not found");
		}
		}catch (Exception e) {
			
			System.out.println("Enter only integer values");
		}
	}

}
