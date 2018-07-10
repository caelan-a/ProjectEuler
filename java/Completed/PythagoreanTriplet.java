package Completed;

public class PythagoreanTriplet {

	private static long a, b;
	private static long c;

	public static void main(String[] args) {
		for(b = 0L; b < 1000; b++) {
			for(a = 0L; a < b; a++) {
				if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == (int)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
					c = (long)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

					if(c > b && a + b + c == 1000) {
						System.out.println(a + ", " + b + ", " + c + ": " + (a * b * c));
					}
				}
			}
		}
	}
}
