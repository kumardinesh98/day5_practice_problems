package harmonic;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		double ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int count = sc.nextInt();
		sc.close();
		if (count > 0) {
			HarmonicSeries Harmonic = new HarmonicSeries();
			ans = Harmonic.findHarmonic(count);
			System.out.println(ans);
		}
		else {
			System.out.println("invalid data");
		}

	}
	public double findHarmonic(int count) {
		double result = 0;
		for (double i = 1;i < count; i++) {
			result += 1/i;	
		}
		return result;
	}

}
