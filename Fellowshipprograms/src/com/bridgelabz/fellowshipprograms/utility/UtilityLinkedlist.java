/*package com.bridgelabz.fellowshipprograms.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UtilityLinkedlist {
	public static node head;
	public static String[] createFile(String filename,String data)
	{
		File myfile = new File(filename);
		String words[]=null;
		try {
			
				boolean createFile = myfile.createNewFile();
				if(createFile)
				{
					System.out.println("New File Successfully created");
				}else {
				
					
					FileWriter fw = new FileWriter("ulist.txt");
					fw.write(data);
					
					fw.close();
					
		
					FileReader fr = new FileReader(filename);
				
					BufferedReader br =  new BufferedReader(fr);
					
				
					String s;
				
				
					while((s=br.readLine())!=null)
					{
						words=s.split(",");
					}
					br.close();
				}
		}catch (Exception e)
		{
		
		}
		return words;
	}
	
	public static class node<N>{
		N data;
		node next;
		public node(N x)
		{
			data=x;
			next=null;
		}
	}
	
	
	public static boolean isEmpty()
	{
		if(head==null)
			return true;
			return false;
	}
	
	public static <T> void add(T data)
	{
		node n1=new node(data);
		if(head==null)
		{
			head=n1;
		}else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n1;
		}
			
	}
	public static <A> void add(A data)
	{
		node new_node=new node(data);
		new_node.next=null;
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			node n1=head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=new_node;
		}		
	}
	public static <T> boolean search(T x)
	{
		node temp=head;
		while(temp!=null)
		{
			if(temp.data.equals(x))
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public static int size()
	{
		int count=0;
		node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static <T> void append(T data)
	{
		node temp=head;
		if(search(data))
		{
			System.out.println("element already present");
		}
		else
		{
			node new_node =new node(data);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	public static <R> void remove(R index)
	{
		node temp=head,prev=null;
		if(temp!=null && temp.data==index)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=index)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			return;
		}
		prev.next=temp.next;
	
	}
	public static <T> void index(T data)
	{
		node temp=head;
		
	}
	public static <E> void show()
	{
		node node=head;
		while(node.next!=null)
		{
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.print(node.data);
	}
}
*/