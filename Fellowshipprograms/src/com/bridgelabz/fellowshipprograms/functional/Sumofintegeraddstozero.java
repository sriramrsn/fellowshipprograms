package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

public class Sumofintegeraddstozero {
	public static void find (int[]A, int n,int sum) 
	{  
	    for (int i=0; i<n-2; i++) 
	    { 
	        for (int j=i+1; j<n-1; j++) 
	        { 
	            for (int k=j+1; k<n; k++) 
	            { 
	                if (A[i]+A[j]+A[k] ==sum) 
	                { 
	                    System.out.print("\ntriplet is :"+A[i]+","+A[j]+","+A[k]); 
	                    
	                } 
	            } 
	        } 
	    }   
	}

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int n= sc.nextInt();
		int [] A = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0; i<n; i++ )
		{
	      A[i]  = sc.nextInt();
	     }
	 find(A, n, 0);
	   sc.close();
	} 
}
