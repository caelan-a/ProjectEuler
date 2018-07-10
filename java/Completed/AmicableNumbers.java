package Completed;

public class AmicableNumbers {

	private static int UPPER_BOUND = 10000;

	private static int[] set = new int[UPPER_BOUND];
	
	private static int sum = 0;

	public static void main(String[] args) {
		findSumBelowInt();
		
	}
	
	public static void findSumBelowInt() {
		
		for(Integer i : set)
			i = 0;
		
		for(int i = 1; i < set.length; i++) {
			if(i == factorSum(factorSum(i)) && i != factorSum(i)) {
				set[i] = 1;
				
				if(factorSum(i) < set.length) {
					set[factorSum(i)] = 1;
				}
				
				System.out.println(i + " is a amicable number with " + factorSum(i));
			}
		}
		
		for(int i = 0; i < set.length; i++) {
			if(set[i] == 1) {
				sum+=i;
				System.out.println(i + " is an amicable number");
			}
		}
		
		System.out.println("Sum of amicable numbers below " + UPPER_BOUND + " is " + sum);
	
	}
	
	public static int factorSum(int num) {
		int sum = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				//System.out.println(num + " is divisible by " + i);
				sum += i;
			}
		}

		return sum;
	}
}
