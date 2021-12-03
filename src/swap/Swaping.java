package swap;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value 1=");
		int value1=sc.nextInt();
		System.out.println("enter the value 2=");
		int value2=sc.nextInt();
		sc.close();
		System.out.println("before swaping value 1=" + value1 + " value 2 =" + value2);
		int temp = value1;
		value1 = value2;
		value2 = temp;
		System.out.println("after swaping value 1=" + value1 + " value 2 =" + value2);
	}

}
