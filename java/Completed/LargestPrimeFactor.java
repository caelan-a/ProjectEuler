package Completed;

public class LargestPrimeFactor {

	static long number = 600851475143L;
	static long lFactor = 1;
	
	static boolean biggest = true;
	
	public static void main(String[] args) {
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) {
				biggest = true;
				for(int j = 2; j < i-1; j++) {
					if(i % j == 0) {
						biggest = false;
						break;
					}
				}
				if(biggest)
					if(i > lFactor) {
						lFactor = i;
						System.out.println(lFactor);	
					}
			}
		}
	}
}
