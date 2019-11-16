package com.bridgelabz.fellowshipprograms.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	public static Scanner sc= new Scanner(System.in);
	
	/**
	 * purpose-Count the number of heads and tails.
	 * @param n-number of times coin tossed.
	 * @return -count.
	 */
	public static int[] flipCoin(int n)
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
	

//-----------------------------------------------------------------------------------

	/**
	 * purpose-To check the year is leap year or not.
	 * @param n-year.
	 * @return-boolean.
	 */
	public static boolean leapYear(int n)
	{
		if(n%4==0 || n%100!=0 && n%400==0)
		{
		return true;		
		}else 
		return false;
	}


//-----------------------------------------------------------------------------------
	
	/**
	 * purpose- prints a table of the powers of 2 that are less than or equal to 2^N.
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
	

//-----------------------------------------------------------------------------------

	
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


//-----------------------------------------------------------------------------------
	
	/**
	 * purpose-prime factor of number.
	 * @param n-decimal number.
	 * @return -prime factors
	 */
	public static int primeFactor(int n)
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


/*----------------------------------functional-----------------------------------------*/

	
	/**
	 * purpose-2d array
	 * @param i-rows
	 * @param j-columns
	 */
	public static void array2D(int i,int j)
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
	
	

//-----------------------------------------------------------------------------------

	/**
	 * purpose-calculate euclidean distance from the point (x, y) to the origin (0, 0). 
	 * @param a-distance from x-coordinate.
	 * @param b-distance from y-coordinate.
	 * @return-distance
	 */
	public static double euclideDistance(double a,double b)
	{
		double temp=a*a+b*b;
		System.out.println("euclidean distance");
		double d= Math.sqrt(temp);
		return d;
	}


//-----------------------------------------------------------------------------------

	/**
	 * purpose- calculate effective temperature.
	 * @param t-temperature.
	 * @param v-wind speed.
	 * @return
	 */
	public static double windChill(double t,double v)
	{
			double temp1 = 0.6215*t;
			double temp2 = 0.4275*t;
			double temp3 = temp2+35.75;
			double temp4 = Math.pow(v, 0.16);
			double w= 35.74+temp1+temp3*temp4;
			return w;	
	}
	

 /*----------------------------Algoritham-----------------------------------------------*/
	
	
	/**
	 * purpose
	 * @param initial
	 * @param remaining
	 */
	public static void permutatioRecursive(String initial,String remaining)
	{
		if(remaining.length()==0)
		{
			System.out.println(initial);
		}
		else
		{
			for(int i=0;i<remaining.length();i++)
			{
				String str1= initial+remaining.charAt(i);
				String str2= remaining.substring(0, i)+remaining.substring(i+1);
				permutatioRecursive(str1,str2);
			}
			
		}
	}
	

//-----------------------------------------------------------------------------------

	/**
	 * purpose-insertion sort.
	 * @param a-array of elements.
	 * @return-sorted array.
	 */
	public static int[] insertionSort(int[] a)
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


//-----------------------------------------------------------------------------------

	/**
	 * purpose-binarySearch
	 * @param a-array
	 * @param search-element to search
	 * @return
	 */
	public static int binarySearch(int [] a,int search)
	{
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==search)
			{
				return 0;
			}
			else if(a[mid]<search)
			{
				l=mid+1;	
			}
			else {
				h=mid-1;
			}
			//mid=(l+h)/2;
		}
		return 1;
	}

/**
 * @purpose-bubblesort.
 * @param a-array.
 * @return-sorted array.
 */
public static int[] bubbleSort (int[] a)
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


//-----------------------------------------------------------------------------------
/**
 * purpose-prime number checks
 * @param n-number
 * @return
 */
public static boolean primeCheck(int n)
{
	boolean check=true;
	if(n<2)
	{
		check=false;
	}
	else
	{
		int i=2;
		while(i<=Math.sqrt(n))
		{
			if(n%i==0)
			{
				check=false;
				break;
			}
			i++;
		}
	}
	return check;
}


//-----------------------------------------------------------------------------------


/**
 * purpose-anagram check
 * @param str1
 * @param str2
 * @return
 */
public static boolean anagram(String str1,String str2)
{
	  if (str1.length() != str2.length())  
	    {  
	        return false;  
	    }   
	    int value = 0;  
	    for (int i = 0; i < str1.length(); i++)  
	    {  
	        value = value ^ (int) str1.charAt(i);  
	        value = value ^ (int) str2.charAt(i);  
	    }  
	    return value == 0;  	
}


//-----------------------------------------------------------------------------------


/**
 * purpose-generate 1-1000 between prime number
 * @param n
 * @return
 */
public static int[] primeSeries(int n)
{
	int i,j,k;
	int []a=new int[168];
	int m=0;
	for(i=1;i<=n;i++)
	{
		k=0;
		for(j=i;j>=1;j--)
		{
			if(i%j==0)
			{
				k++;
			}
		}
		if(k==2)
		{
			a[m]=i;
			m++;
		}
	}
	return a;
}



//-----------------------------------------------------------------------------------

/**
 * purpose-find the anagram from prime numbers range 1-1000
 * @param a
 * @return
 */
public static String[] primeAnagram(int[] a)
{
	int i,j,k=0;
	String s[]=new String[168];
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			String str1=Integer.toString(a[i]);
			String str2=Integer.toString(a[j]);
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			String x =new String(s1);
			String y=new String(s2);
			 
			if(x.compareTo(y)==0)
			{
				 s[k]= a[i]+"  anagram   "+a[j];
				 k++;
			}
			
		}
	
	}
return s;
}

public static String[] palindromeAnagram(int a[])
{
	String str[]=new String[168];
	int i,temp,sum=0;
	int k=0;
	for(i=0;i<a.length;i++)
	{
	int check=a[i];
	sum=0;
	while(check>0)
	{
		temp=check%10;
		sum=sum*10+temp;
		check=check/10;
		}
	if(a[i]==sum)
		{
		str[k++]=a[i]+ "  palindrome ";
		}
	}
 return str;
}
}