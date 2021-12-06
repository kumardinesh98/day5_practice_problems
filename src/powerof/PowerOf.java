package powerof;

public class PowerOf {

	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		int result = 1;
		for (int i = 1; i <= count; i++) {
			result = result * 2; 
		}
		System.out.println(result);
		
	}

}
