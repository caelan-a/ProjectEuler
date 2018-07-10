package Completed;
import java.math.BigInteger;


public class Factorial_20 {

	static BigInteger product = BigInteger.valueOf(1);
	static int sum = 0;

	public static void main(String[] args) {
		for(int i = 100; i > 0; i--) {
			product = product.multiply(BigInteger.valueOf(i));
			System.out.println("Product * " + i + ": " + product);
		}
		
		System.out.println("Final Product: " + product);		

		char[] num = product.toString().toCharArray();
		
		for(int i = 0; i < num.length; i++) {
			sum+=Integer.valueOf(num[i]) - 48;
		}
		System.out.println("Sum of Digits: " + sum);
	}
}
