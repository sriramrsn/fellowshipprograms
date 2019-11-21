package com.bridgelabz.fellowshipprograms.logical;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack: ");
        double stake  = sc.nextInt();    
        System.out.println("Enter goal: ");
        double goal   = sc.nextInt();    
        System.out.println("Enter how many trials: ");
        double trials = sc.nextInt();   
        double bets=0;       
        int wins = 0;
        int loss=0;
        for (int t = 0; t < trials; t++) 
        {
            double cash = stake;
            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) 
                	{
                	cash--;     
                	}
                else                    
                	{
                	cash++;     
                	}
            }
            if (cash == goal)
            	{
            	wins++;                
            	}else
            	{
            		loss++;
            	}
        }

        double pw=100*wins/trials;
        double pl=100*loss/trials;
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " +pw);
        System.out.println("Percent of games loss = " +pl);
       sc.close();
    }

}
