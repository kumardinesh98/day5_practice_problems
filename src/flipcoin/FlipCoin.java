package flipcoin;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no of times");
		int counter=sc.nextInt();
		
		if ( counter > 0) {
			System.out.println("number of times "+counter);
			FlipCoin fc = new FlipCoin();
			fc.flipCoin(counter);
		}
		sc.close();
		
		

	}
	public void flipCoin(int count) {
		double headCounter = 0;
		double tailCounter = 0;
		double headPercent = 0;
		double tailPercent = 0;
		for (int i=0;i<count;i++) {
			double random = Math.random();
			if (random > 0.5) {
				headCounter++;
			}
			else {
				tailCounter++;
			}
		}
		
		headPercent = (headCounter/count)*100;
		tailPercent = (tailCounter/count)*100;
		System.out.println("head count = "+headCounter);
		System.out.println("tail count = "+tailCounter);
		System.out.println("head percent = "+headPercent);
		System.out.println("tail percent = "+tailPercent);
		
			
		}
}
