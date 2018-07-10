package Completed;

public class NumberSpiralDiagonals {

	private static int LENGTH = 1001;
	
	public static void main(String[] args) {
		double LIMIT = Math.pow(LENGTH, 2);
		int sum = 1;
		
		int n = 1;
		int add = 2;
		int diagonals = 0;
		
		while(n < LIMIT) {
			System.out.println(n);
			n += add;
			sum += n;
			diagonals++;
			if(diagonals == 4) {
				diagonals=0;
				add += 2;
			}
		}
		
		System.out.println("Sum: " + sum);
		
	}
	
}
