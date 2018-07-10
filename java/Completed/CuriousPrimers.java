package Completed;
import java.util.LinkedList;

public class CuriousPrimers {

	private static int LIMIT = 1000000;
	
	public static void main(String[] args) {
		int count = 1;
		for(int i = 3; i < LIMIT; i++) { // Assume 2 is circular to facilitate sqrt optimisation for prime checker
			if(isCircular(i)) {
				System.out.println(i + " is Circular!");
				count++;
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("Count: " + count);
	}
	
	public static boolean isCircular(int n) {
		LinkedList<Integer> digits = getDigits(n);
		for(int i = 0; i < digits.size(); i++) {
			String s = "";
			for(int j = 0; j < digits.size(); j++) {
				s+=digits.get(j);
			}

			if(!isPrime(Integer.parseInt(s)))
				return false;
			digits.push(digits.removeLast());
		}
		
		return true;
	}
	
	public static LinkedList<Integer> getDigits(int n) {
		LinkedList<Integer> digits = new LinkedList<Integer>();
		int num = n;
		while(num > 0) {
			digits.push(num % 10);
			num /= 10;
		}
		
		return digits;
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
