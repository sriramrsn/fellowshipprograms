package com.bridgelabz.fellowshipprograms.algorithm;



import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Binarysearch {
	
public static void main(String ar[])
{
	String filename = "file.txt";
	
	String data = "pick,back,rose,buddy,hello";
	
	String words[]=null;
	
	words=Utility.createFile(filename,data);
	words=Utility.bubbleSortGenerics(words);
	
			
			System.out.println("Enter a string want you search");
			String word=Utility.sc.nextLine();
			int val = Utility.binarySearchGenerics(words, 0, words.length, word);
			if(val>0)
			{
				System.out.println("Found");
			}else {
				System.out.println("Not found");
			}
	}
}

