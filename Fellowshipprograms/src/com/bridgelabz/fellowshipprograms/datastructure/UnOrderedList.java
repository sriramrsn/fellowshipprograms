package com.bridgelabz.fellowshipprograms.datastructure;
import com.bridgelabz.fellowshipprograms.utility.Utility;


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
		boolean f=Utility.isEmpty();
		if(f==true)
		{
			System.out.println("list is not empty");
		}
		boolean b=Utility.search("back");
		if(b==true)
		{
			System.out.println("found");
		}
	}
}