
public class TrianglularFactors {
	private static int MAX_FACTORS = 500;
	
	private static int factors = 0;
	private static int mFactors = 0;
	
	private static int index = 9397;
	
	private static int sum = 0;
	public static void main(String[] args){ 
		
		while(mFactors < 500) {
			sum+=index;
			
			for(int i = 1; i < sum; i++) {
				if(sum % i == 0) {
					factors++;
				}
			}
			
			System.out.println("#" + index + ", sum: " + sum + ", factors: " + factors);
			
			if(factors > mFactors) {
				mFactors = factors;
			}
			
			factors = 1;
			index++;
		}
	}
}
