package com.bridgelabz.fellowshipprograms.junit;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class DecimaltoBinary {

	public static void main(String args[])
	{
		System.out.println("Enter the decimal number");
		int x=Utility.readInt();
		
		System.out.println(x+" - "+Utility.binary(x));
	
	String binary_string = Utility.binary(Utility.toSwapNibbles(x));
	System.out.println("Swap nibbles:  "+binary_string);
	
	int decimal_value = Utility.decimal(binary_string);
	System.out.println("after swaping nibbles decimal:  "+decimal_value);
                                                               	
	System.out.println("check above number is power of 2 or not\n");
	
	if(Utility.power(decimal_value))
	{
		System.out.println(decimal_value+": is power of 2");
	}else 
	{
		System.out.println(decimal_value+": is not power of 2");
	}
	}
}

