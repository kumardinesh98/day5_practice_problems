package factors;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		sc.close();
		for (int i = 2; i <= (number); i++) {
			while((number % i) == 0) {
				System.out.print(i+"\t");
				number = number / i;
			}
		}
		if (number > 2) {
			System.out.print("\t" + number);
		}
		

	}

}
