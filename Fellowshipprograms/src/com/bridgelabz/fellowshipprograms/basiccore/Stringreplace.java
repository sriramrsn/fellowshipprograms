package com.bridgelabz.fellowshipprograms.basiccore;

import java.util.Scanner;

public class Stringreplace {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		 String Str = new String("Hello <<UserName>>, How are you?");
	      System.out.println(Str); 
	      String str1= sc.nextLine(); 
	      System.out.println( Str.replace("<<UserName>>", str1)); 
	      sc.close();
	}

}
