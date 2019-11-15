package com.bridgelabz.fellowshipprograms.utility;

import java.util.Scanner;

public class Utility {
	public static Scanner sc= new Scanner(System.in);
	
	/**
	 * @purpose-Count the number of heads and tails.
	 * @param n-number of times coin tossed.
	 * @return -count.
	 */
	public static int[] flipcoin(int n)
	{
		int[] count = new int[2];
		for(int i=0;i<n;i++)
		{
			double d=Math.random();
			if(d<0.5)
			{
				count[0]++;
			}
			else
			{
				count[1]++;
			}
		}
		return count;
	}
	
	/**
	 * @purpose-To check the year is leap year or not.
	 * @param n-year.
	 * @return-boolean.
	 */
	public static boolean leapyear(int n)
	{
		if(n%4==0 || n%100!=0 && n%400==0)
		{
		return true;		
		}else 
		return false;
	}
	
	/**
	 * @purpose- prints a table of the powers of 2 that are less than or equal to 2^N.
	 * @param n-power.
	 */
	public static void power2(int n)
	{
		if(n>=0 && n <31)
		{
			double temp= Math.pow(2, n);
		System.out.println("power "+temp);
		for(int i=1;i<=n;i++)
		{
			double temp1 = 2*i;
			if(temp1>temp)
			{
				System.out.println(""+temp1);
				break;
			}
			else 
			{ 
				System.out.println(""+temp1);
				continue;
			}
		}
		}	
	}
	
	
	/**
	 * purpose-Calculate harmonic number.
	 * @param n-upto Nth harmonic
	 * @return- sum
	 */
	public static double harmonic(int n)
	{
		double temp,sum=0;
		for(int i=1;i<=n;i++)
		{
			temp=1/i;
			sum=sum+temp;
		}
		return sum;
	}
	
	/**
	 * @purpose-prime factor of number.
	 * @param n-decimal number.
	 * @return -prime factors
	 */
	public static int prime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			while(n>0)
			{
				if(n%i==0)
				{	
					n=n/i;
					break;		
				}
			}	
		}
	
		return n;
	}
	
	// functional
	
	/**
	 * @purpose-2d array
	 * @param i-rows
	 * @param j-columns
	 */
	public static void array(int i,int j)
	{
		int [][] a= new int[i][j];
		System.out.println("enter a array elements:");
		for(int r=0;r<i;r++)
		{
			for(int c=0;c<j;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		for(int r=0;r<i;r++)
		{
			for(int c=0;c<j;c++)
			{
				System.out.print("\t" +a[r][c]);			
				}
			System.out.println();
		}	
	}
	
	/**
	 * @purpose-calculate euclidean distance from the point (x, y) to the origin (0, 0). 
	 * @param a-distance from x-coordinate.
	 * @param b-distance from y-coordinate.
	 * @return-distance
	 */
	public static double euclidedistance(double a,double b)
	{
		double temp=a*a+b*b;
		System.out.println("euclidean distance");
		double d= Math.sqrt(temp);
		return d;
	}
	
	/**
	 * @purpose- calculate effective temperature.
	 * @param t-temperature.
	 * @param v-wind speed.
	 * @return
	 */
	public static double Windchill(double t,double v)
	{
			double temp1 = 0.6215*t;
			double temp2 = 0.4275*t;
			double temp3 = temp2+35.75;
			double temp4 = Math.pow(v, 0.16);
			double w= 35.74+temp1+temp3*temp4;
			return w;	
	}
	 
  // Algorithams
	/**
	 * @purpose-insertion sort.
	 * @param a-array of elements.
	 * @return-sorted array.
	 */
	public static int[] insertionsort(int[] a)
	{
		int temp;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			int j= i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;		
		}
		
		return a;
	}

/**
 * @purpose-bubblesort.
 * @param a-array.
 * @return-sorted array.
 */
public static int[] bubblesort (int[] a)
{
	int temp;
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	return a;
}

public static int[] primecheck() {
	boolean flag = false;
	int[] array = new int[1000];
	int size = 0;

	for (int i = 2; i <= 1000; i++) {
		flag = true;
		for (int j = 2; j < i - 1; j++) {
			// System.out.println(i);
			if (i % j == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			array[size] = i;
			size++;
		}
	}
	return array;
}
} 

