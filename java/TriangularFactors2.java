
public class TriangularFactors2 {
	private static int MAX_FACTORS = 500;
	
	private static int factors = 1;
	private static int mFactors = 0;

	private static int[] primeList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	private static int[] primeCounts = new int[primeList.length];
	
	private static int index = 1; 
	private static int sum = 0; //	Value of triangular number
	
	private static int num = 0;	//	Number to use in quotients
	
	public static void main(String[] args){ 
		
		while(mFactors < MAX_FACTORS) {
			sum+=index;
			num = sum;
			
			for(int i = 0; i < primeList.length; i++){
				primeCounts[i] = 0;
				while(num % primeList[i] == 0) {
					num /= primeList[i];
					primeCounts[i]++;
				}
			}
			
			for(int i = 0; i < primeCounts.length; i++){
				factors *= primeCounts[i] + 1;
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
