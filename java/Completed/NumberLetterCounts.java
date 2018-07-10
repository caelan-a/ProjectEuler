package Completed;

public class NumberLetterCounts {
	private static final int AND = 3;

	private static int[] units 	= {0, 3, 3, 5, 4, 4, 3, 5, 5, 4}; 	// 0 - 9
	private static int[] teens 	= {3, 6, 6, 8, 8, 7, 7, 9, 8, 8}; 	// 10 - 19
	private static int[] tens  	= {0, 0, 6, 6, 5, 5, 5, 7, 6, 6};			// 20, 30 .. 90
	private static int[] orders = {7, 8}; 							// 100 & 1000

	private static int MAX = 1000;
	private static int sum = 0;
	public static void main(String[] args) {
		
		for(int i = 1; i <= MAX; i++ ) {
			sum+=letterCount(i);
		}
		System.out.println("Sum up to " + MAX + ": " + sum);
	}

	public static int letterCount(int number) {
		System.out.println("--------" + "Number: " + number + "--------" );
		
		int sum = 0;
		String wordNumber = "";

		//	Int to digit array
		String temp = Integer.toString(number);
		int[] num = new int[temp.length()];
		for(int i = 0; i < temp.length(); i++) {
			num[i] = temp.charAt(temp.length() - 1 - i) - '0';
		}

		//	Units, Teens, Tens
		if(num.length == 1) {
			sum += units[num[0]];
			System.out.println(" + unit: " +num[0]);
		} else if(num.length > 1){
			if(num[1] == 0) { 
				sum += units[num[0]];
				System.out.println(" + unit: " + num[0]);
			} else if(num[1] == 1) {
				sum += teens[num[0]];
				System.out.println(" + teen: 1" + num[0]);
			} else if(num[1] > 1) {
				sum+= tens[num[1]];
				sum+= units[num[0]];
				System.out.println(" + ten: " + num[1] + num[0]);
			}
		}

		//	Hundreds
		if(num.length > 2 && num[2] != 0) {
			sum+=units[num[2]];
			sum+=orders[0];

			System.out.println(" + hundred: " + num[2] + "00");
			
			if(num[0] != 0 || num[1] != 0) {
				sum+=AND;
				System.out.println(" + AND ");
			}
		}

		//	Thousands
		if(num.length > 3) {
			sum+=units[num[3]];
			sum+=orders[1];
			System.out.println(" + hundred: " + num[3] + "000");
		}

		System.out.println("--------  " + "Sum: " + sum + "  --------\n*" );
		
		return sum;
	}
}
