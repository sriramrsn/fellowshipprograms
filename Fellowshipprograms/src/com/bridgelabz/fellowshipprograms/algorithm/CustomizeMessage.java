package com.bridgelabz.fellowshipprograms.algorithm;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class CustomizeMessage {
	public static void main(String ar[]) {
		String str = "Hello <<name>>, We have your fullname as <<fullname>> in our system."
				+ " your contact number is 91-xxxxxxxxxx.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";

		String str1 = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the your full name: ");
		String name = sc.next();
		String mid = sc.next();
		String last = sc.next();

		if (Utility.isString(name + mid + last)) {
			System.out.println("Enter the mobile no: ");
			String number = sc.next();
			if (Utility.isMobileNumber(number) && number.length() == 10) {
				Pattern pn = Pattern.compile("<<name>>");
				Pattern pf = Pattern.compile("<<fullname>>");
				Pattern no = Pattern.compile("xxxxxxxxxx");
				Pattern date = Pattern.compile("01/01/2016");

				Matcher mn = pn.matcher(str);
				str1 = Utility.replaceString(mn, name);
				mn = pf.matcher(str1);
				str1 = Utility.replaceString(mn, name + " " + mid + " " + last);
				mn = no.matcher(str1);
				str1 = Utility.replaceString(mn, number);
				mn = date.matcher(str1);
				str1 = Utility.replaceString(mn, "" + LocalDate.now());
				System.out.println(str1);

			} else {
				System.out.println("Please enter the valil mobile no...");
			}
		} else {
			System.out.println("Please Don't use any special symbol or numbers");
		}

		sc.close();
	}

}
