package Completed;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {
	static int UPPER_LIMIT = 100;
	
	static ArrayList<BigInteger> nums = new ArrayList<>();
	static Set<BigInteger> uniqueNums = new HashSet<>();
	
	public static void main(String[] args) {
		for(int i = 2; i <= UPPER_LIMIT; i++) {
			for(int j = 2; j <= UPPER_LIMIT; j++) {
				BigInteger n = BigInteger.valueOf(i).pow(j);
				nums.add(n);
				System.out.println(i + "^" + j + " = " + n);
			}
		}
		
		uniqueNums.addAll(nums);
		nums.clear();
		nums.addAll(uniqueNums);
		Collections.sort(nums);
		
		for(BigInteger i : nums)
			System.out.println(i);
		System.out.println("Size: " + nums.size());
	}
}
