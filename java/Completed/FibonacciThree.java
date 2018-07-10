package Completed;
import java.math.BigInteger;


public class FibonacciThree {

	private static BigInteger firstNum = BigInteger.valueOf(1);
	private static BigInteger secondNum = BigInteger.valueOf(1);
	private static BigInteger sum;
	
	private static int index = 3;
	public static void main(String[] args) {
		System.out.println("F" + 1 + " = " + firstNum);
		System.out.println("F" + 2 + " = " + secondNum);
		
		while(secondNum.toString().length() < 1000) {
			sum = firstNum.add(secondNum);
			firstNum = secondNum;
			secondNum = sum;
			System.out.println("F" + index + " = " + secondNum);
			index++;
		}
	}
}
