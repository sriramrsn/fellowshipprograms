package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Anagramdetection {
	public static void main(String args[])
	{
		String str1=Utility.sc.nextLine();
		String str2=Utility.sc.nextLine();
		
		if(Utility.anagram(str1,str2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
