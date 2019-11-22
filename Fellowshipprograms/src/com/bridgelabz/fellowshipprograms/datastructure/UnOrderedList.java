package com.bridgelabz.fellowshipprograms.datastructure;
import java.io.FileWriter;

import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.node;


public class UnOrderedList {
	public static void main(String[] args) {
		
		String filename= "ulist.txt";
		String data="pick,pack,back,book,tap,hat";
		String words[]=null;
		words=Utility.createFiles(filename, data);
		
		for(int i=0;i<words.length;i++)
		{
			Utility.add(words[i]);
		}
		Utility.display();
	
		System.out.println("The enter element is present in list or not");
		System.out.println("Enter a data:");
		String str=Utility.readLine();
		String[] s=null;
		Utility.pop();
		boolean b=Utility.search(str);
		if(b==true)
		{
			System.out.println("Element is found");
			System.out.println("Remove the element");
			Utility.remove(str);
		}
		else
		{
			System.out.println("Element is not found");
			Utility.add(str);
		}
		Utility.display();
		System.out.println("pop the last element");
		
		Utility.display();
	}
}
