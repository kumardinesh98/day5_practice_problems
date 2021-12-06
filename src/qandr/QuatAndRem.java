package qandr;

import java.util.Scanner;

public class QuatAndRem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the divident");
		int divident = sc.nextInt();
		System.out.println("enter the divisor");
		int divisor = sc.nextInt();
		sc.close();
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		
		System.out.println("quotient = " + quotient);
		System.out.println("remainder = " + remainder);
		

	}

}
