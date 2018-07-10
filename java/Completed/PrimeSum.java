package Completed;

public class PrimeSum {

	/*// Bruteforce method
	private static int limit = 2000000;
	private static long sum;

	private static boolean isPrime = false;

	public static void main(String[] args) {
		for(int i = 2; i < limit; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {   
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("*******   S(" + limit + ") = " + sum + "   *********");
	}*/

	//	Sieve of Eratosthenes
	private static int index = 2;
	private static int SIEVE_SIZE = 2000000; 
	private static int sum = 0;
	private static boolean[] sieve = new boolean[SIEVE_SIZE];

	public static void main(String[] args) {
		sieve[0] = false; // Exclude 1
		for(int i = 1; i < SIEVE_SIZE; i++) {
			sieve[i] = true;
		}
		System.out.println("Sieve Filled");

		while(index < SIEVE_SIZE) {
			for(int j = index * index; j < SIEVE_SIZE; j+=index) {
				if(sieve[j] != false)
					sieve[j] = false;
				System.out.println((j+1) + " is not a prime");
			}
			for(int x = 0; x < SIEVE_SIZE; x++) {
				if(sieve[x]) {
					index = x;
					break;
				} 
			}
		}
		System.out.println("Summing.");
		for(int i = 0; i < SIEVE_SIZE; i++) {
			if(sieve[i]) {
				sum += i;
			}
			System.out.println("Sum: " + sum);
		}
	}
}
