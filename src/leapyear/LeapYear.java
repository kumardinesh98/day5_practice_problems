package leapyear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scyear = new Scanner(System.in);
		System.out.println("enter the year");
		int year = scyear.nextInt();
		scyear.close();
		if (year > 999 && year < 10000) {
			if ((year % 4 ==0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("leap year");
			}
			else {
				System.out.println(" not an leap year");
			}
		}
		else {
			System.out.println("invalid data");
		}
	}
	
	

}
