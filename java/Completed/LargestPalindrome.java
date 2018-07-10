package Completed;

public class LargestPalindrome {

	private static int lPalindrome;
	
	public static void main(String[] args) {
		for(int i = 100; i < 999; i++) {
			for(int j = 100; j < 999; j++) {
				if(new StringBuilder(Integer.toString(i*j)).reverse().toString().matches(Integer.toString(i*j))) {
					if(i*j > lPalindrome) {
						lPalindrome = i*j;
						System.out.println(lPalindrome);
					}
				}
			}
		}
	}
}
