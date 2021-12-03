package addoreven;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		sc.close();
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}	
		}

}
