package distance;

public class Distance {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		double euclideanDistance = Math.sqrt((Math.pow(x, x)+Math.pow(y, y)));
		System.out.println("eculidean distance from the point (" + x + "," + y + " to zero is" + euclideanDistance);
	}

}
