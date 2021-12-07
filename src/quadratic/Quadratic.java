package quadratic;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of a ");
		double a = scanner.nextDouble();
		System.out.println("enter the value of b ");
		double b = scanner.nextDouble();
		System.out.println("enter the value of c");
		double c = scanner.nextDouble();
		System.out.println("the equatio is" + a + "x^2" + b + "x" + c);
		
		double delta = (b * b) - (4 * a * c); 
		double x1 = ((-1 * b) + Math.sqrt(delta))/(2 * a);
		double x2 = ((-1 * b) - Math.sqrt(delta))/(2 * a);
		System.out.println(delta);
		
		System.out.println("root 1 off x is " + x1);
		System.out.println("root 2 of x is " + x2);
		
		

	}

}
