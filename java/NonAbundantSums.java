import java.util.LinkedList;

public class NonAbundantSums {
	private static int LIMIT = 28123;
	
	public static void main(String[] args) {
		abundantSum();
	}
	
	public static void test() {
		int sum = 0;
		for(int i = 0; i < LIMIT; i++) {
			sum += i;
			System.out.println(i + ": " + sum);
		}	
	}
	
	public static void abundantSum() {
		LinkedList<Integer> ab = new LinkedList<Integer>();
		int sum = 0;
		int subtraction = 0;
		
		System.out.println("Building abundant list...");
		for(int i = 0; i <= LIMIT; i++) {
			if(isAbundant(i)) {
				ab.push(i);
				System.out.println(i + " is abundant");
			}
		}
		System.out.println("Built. Size: " + ab.size());
		
		System.out.println("Building subtraction...");
		for(int i = 0; i < ab.size() / 2; i++) {
			for(int j = i; j < ab.size(); j++) {
				int t = ab.get(i) + ab.get(j);
				if(t < LIMIT) {
					subtraction += ab.get(i) + ab.get(j);
					System.out.println("n: " + i + ", sub: " + subtraction);
				}
			}
		}
		System.out.println("Built");
		
		for(int i = 0; i <= LIMIT; i++) {
			sum+=i;
		}
		sum -= subtraction;
		
		System.out.println("Sum: " + sum);
	}
	
	public static boolean isAbundant(int n) {
		int sum = 0;
		for(int j = 1; j < n; j++){
			if(n % j == 0) {
				sum += j;
			}
		}
		if(sum > n) {
			return true;
		} else {
			return false;
		}
	}
}
