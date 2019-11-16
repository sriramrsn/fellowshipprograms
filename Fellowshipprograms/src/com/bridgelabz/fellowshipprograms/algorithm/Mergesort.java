package com.bridgelabz.fellowshipprograms.algorithm;

public class Mergesort {
	public static void mergeSort(int[] a,int lo,int hi)
	{
		if(lo<hi)
		{
			int m= (lo+hi)/2;
			mergeSort(a,lo,m);
			mergeSort(a,m+1 ,hi);
			merge(a,lo,m,hi);
		}
	}
	public static void merge(int[]a,int lo,int m,int hi)
	{
		int a1=m-lo+1;
		int a2=hi-m;
		int x[] =new int[a1];
		int y[]=new int[a2];
		for(int i=0;i<a1;i++)
		{
			x[i]=a[lo+i];
		}
		for(int j=0;j<a2;j++)
		{
			y[j]=a[m+1+j];
		}
		int i=0,j=0,k=lo;
		while(i<a1 && j<a2)
		{
			if(x[i]<=y[j])
			{
				a[k]=x[i];
				i++;
			}else
			{
				a[k]=y[j];
				j++;
			}
			k++;
		}
		while(i<a1)
		{
			a[k]= x[i];
			i++;
			k++;
		}
		while(j<a2)
		{
			a[k]=y[j];
			j++;
			k++;
		}
		
	}
	public static void main(String args[])
	{
		int[]a= {9,3,4,5,1,6,10,8};
		mergeSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
