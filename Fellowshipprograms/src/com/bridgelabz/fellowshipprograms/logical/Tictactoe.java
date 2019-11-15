package com.bridgelabz.fellowshipprograms.logical;

import java.util.Random;
import java.util.Scanner;

public class Tictactoe {

	static char board[][]= new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}}; 
	static int position; 
	static int count=0;
	static boolean win[]=new boolean[]{false,false};
	static Scanner scanner=new Scanner(System.in);
	public static void main(String arg[])
	 {
		System.out.println("The Tic Toc Toe Game:");
		displayBoard(); 
		do
		 {
			if(count==9)
			{
				break;
			}
			getValueFromUser();
			count++;
			displayBoard();
			if( (board[0][0]=='x'&& board[0][1]=='x'&& board[0][2]=='x')
					|| (board[1][0]=='x'&&board[1][1]=='x'&&board[1][2]=='x')
					|| (board[2][0]=='x'&&board[2][1]=='x'&&board[2][2]=='x') 
					|| (board[0][0]=='x'&&board[1][0]=='x'&&board[2][0]=='x') 
					|| (board[0][1]=='x'&&board[1][1]=='x'&&board[2][1]=='x') 
					|| (board[0][2]=='x'&&board[1][2]=='x'&&board[2][2]=='x') 
					|| (board[0][0]=='x'&&board[1][1]=='x'&&board[2][2]=='x') 						 
					|| (board[0][2]=='x'&&board[1][1]=='x'&&board[2][0]=='x') )
			{  
				win[1]=true;
				break;
			}
			if(count==9)
			{
				break;
			}
			getValueFromComputer();
			count++;
			displayBoard();
			if( (board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')
					|| (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O') 
					|| (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O') 
					|| (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O') 
					|| (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O') 
					|| (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O') 
					|| (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') 
					|| (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') )
			{
				win[0]=true;
				break;
			}
		 }
		while(win[0] !=true || win[1] !=true);
		if(win[0]==true)
		{
			System.out.println("The  computer win the match");
		} 
		else if(win[1]==true)
		{
			System.out.println("The user win the match");
		}
		else
		{
			System.out.println("The match draw");
		}
	 }
	public static void displayBoard()
	{
		System.out.println();
		for(int row=0; row<3 ;row++)
		{
			for(int col=0; col<3; col++)
			{
				System.out.print("|"+board[row][col]); 
			}	
			System.out.println("|");
		}
		System.out.println();
	}
	public static void getValueFromUser()
	{
		do
		{
			System.out.println("Enter your position:");
			position = scanner.nextInt();
			System.out.println(position);
			switch(position)
			{
			case 1:
				if(board[0][0]=='x' || board[0][0]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[0][0]='x';
				}
				break;
			case 2:
				if(board[0][1]=='x' || board[0][1]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[0][1]='x';
				}
				break;
			case 3:
				if(board[0][2]=='x' || board[0][2]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[0][2]='x';
				}
				break;
			case 4:
				if(board[1][0]=='x' || board[1][0]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[1][0]='x';
				}
				break;
			case 5:
				if(board[1][1]=='x' || board[1][1]=='O')
				{
				getValueFromUser(); 
				}
				else
				{
				board[1][1]='x';
				}
				break; 
			case 6:
				if(board[1][2]=='x' || board[1][2]=='O')
				{
				getValueFromUser(); 
				}
				else
				{
				board[1][2]='x';
				}
				break; 
			case 7:
				if(board[2][0]=='x' || board[2][0]=='O')
				{
			    	getValueFromUser(); 
				}
				else
				{
				board[2][0]='x';
				}
				break;
			case 8:
				if(board[2][1]=='x' || board[2][1]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[2][1]='x';
				}
				break;
			case 9:
				if(board[2][2]=='x' || board[2][2]=='O')
				{
					getValueFromUser(); 
				}
				else
				{
					board[2][2]='x';
				}
				break;
				default:
				System.out.println("Please Enter position in between 0-9:");
			}
		}
		while(position < 1 || position > 9);
	}
	public static void getValueFromComputer()
	{
		do
		{
			System.out.println("Computer Turns:");
			Random random=new Random();
			position = random.nextInt(10);
			System.out.println(position);
			switch(position)
			{
			case 1:
				if(board[0][0]=='x' || board[0][0]=='O' )
				{
					getValueFromComputer(); 
				}
				else
				{
					board[0][0]='O';
				}
				break;
			case 2:
				if(board[0][1]=='x' || board[0][1]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[0][1]='O';
				}
				break;
			case 3:
				if(board[0][2]=='x' || board[0][2]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{	
					board[0][2]='O';
				}
				break;
			case 4:	
				if(board[1][0]=='x' || board[1][0]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[1][0]='O';
				}
				break;
			case 5:
				if(board[1][1]=='x' || board[1][1]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[1][1]='O';
				}
				break; 
			case 6:
				if(board[1][2]=='x' || board[1][2]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[1][2]='O';
				}
				break; 
			case 7:
				if(board[2][0]=='x' || board[2][0]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[2][0]='O';
				}
				break;
			case 8:	
				if(board[2][1]=='x' || board[2][1]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[2][1]='O';
				}
				break;
			case 9:
				if(board[2][2]=='x' || board[2][2]=='O')
				{
					getValueFromComputer(); 
				}
				else
				{
					board[2][2]='O';
				}
				break;
			default:
				System.out.println("Please Enter position in between 0-9:");	
				}
			}
		while(position < 1 || position > 9);				
	}

}
