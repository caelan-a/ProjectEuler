package Completed;

public class QuadraticPrimes {
	private static int LIMIT = 1000;
	private static int PRIME_LIMIT = 100;
	
	public static void main(String[] args) {
		getHighestProduct();
	}
	
	public static void test() {
		for(int n = 0; n < 100; n++) {
			System.out.println(n + ": " + isPrime(getQuadratic(n, -999, -999)));
		}
	}
	
	public static void getHighestProduct() {
		int HighestCount = 0;
		int product = 1;
		int ast = 0, bst = 0;
		for(int a = -LIMIT + 1; a < LIMIT; a++) {
			for(int b = -LIMIT + 1; b < LIMIT; b++) {
				int count = 0;
				for(int n = 0; n < 100; n++) {
					if(isPrime(getQuadratic(n, a, b))) {
						count++;
					}
				}
				
				if(count > HighestCount) {
					System.out.println(a + ", " + b + " " + count + " HIGHEST! " + count + ">" + HighestCount);
					HighestCount = count;
					product = a * b;
					ast = a;
					bst = b;
				} else {
					System.out.println(a + ", " + b + " " + count);
				}
			}
		}	
		System.out.println("Highest Count: " + HighestCount + ", Product: " + product + ", a: " + ast + ", b: " + bst);
	}
	
	public static int getQuadratic(int n, int a, int b) {
		return (int)Math.pow(n, 2) + a * n + b;
	}
	
	public static boolean isPrime(int n) {
		if(n < 0)
			return false;
		
		for(int i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
