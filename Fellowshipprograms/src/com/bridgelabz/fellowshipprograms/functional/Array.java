package com.bridgelabz.fellowshipprograms.functional;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Array {
	public static void main(String args[])
	{
		int i,j;
	System.out.print("enter a row and column");
	int m= Utility.readInt();
	int n=Utility.readInt();
	Integer a[][] = new Integer[m][n];
	Integer b[][] = new Integer[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=Utility.readInt();
			b[i][j]=a[i][j];
		}
	}
	Utility.multiplexInteger(a, b, m, n);
	Utility.multiplexDouble(a, b, m, n);

}
}
