package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class FindyourNumber {
	public static void main(String args[]) {

		try {
		System.out.println("Enter the number: ");
		int n = Utility.readInt();
		int arr[] = new int[n];

		int pow = 1;

		for (int i = 0; i < n; i++) {
			pow = pow * 2;
			arr[i] = pow;
			System.out.println(pow + " ");
		}

		System.out.println("Enter the number want to be find :");
		int x = Utility.readInt();

		int result = Utility.binarySearchInteger(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + (result + 1));
		}catch (Exception e) {
			System.out.println("Enter only Integer values");
		}
	}
	
}
