package Completed;

public class FifthPowers {
	static int UPPER_LIMIT = 1000000;
	static int POWER = 5;
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 2; i < UPPER_LIMIT; i++) {
			if(isPowerSum(i))
				sum += i;
		}
		
		System.out.println("Sum of power sums: " + sum);
	}
	
	static char[] digits;
	private static boolean isPowerSum(int num) {
		int sum = 0;
		
		digits = Integer.toString(num).toCharArray();
		
		for(int j = 0; j < digits.length; j++) {
			sum += Math.pow(digits[j] - '0', POWER); 
		}
		
		if(sum == num) {
			System.out.println(num + " is a power sum!");
			return true;
		} else {
			System.out.println(num + " is not...");
			return false;
		}
	}
}
