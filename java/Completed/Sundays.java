package Completed;

public class Sundays {

	static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	static int sundays = 0;
	
	static int day = 1; // day = starting day - 1 
	
	public static void main(String[] args) {
		for(int i = 1901; i <= 2000; i++) {
			if(isLeapYear(i)) 
				System.out.println(i + " is a leap year!");
			for(int j = 1; j <= 12; j++) {
				if(j == 2 && isLeapYear(i)) {
					for(int k = 1; k <= month[j-1] + 1; k++) {
						
						day++;
						if(day == 7 && k == 1) {
							sundays++;
						} else if (day == 8) {
							day = 1;
						}
						
						System.out.println(k + "-" + j + "-" + i + " " + day(day));
					
					} 
				} else {
					for(int k = 1; k <= month[j-1]; k++) {
						day++;
						if(day == 7 && k == 1) {
							sundays++;
						} else if (day == 8) {
							day = 1;
						}
						System.out.println(k + "-" + j + "-" + i + " " + day(day));
					}
				}
			}
			//System.out.println("Sundays in " + i + ": " + sundays);
		}
		System.out.println("Total Sundays: " + sundays);
	}
	
	public static boolean isLeapYear(int year) {
		if(year % 4 != 0) {
			return false;
		} else if(year % 100 != 0){
			return true;
		} else if (year % 400 != 0) {
			return false;
		} else {
		return true;
		}
	}
	
	public static String day(int day) {
		switch (day) {
		case 1 : return "Monday";
		case 2 : return "Tuesday";
		case 3 : return "Wednesday";
		case 4 : return "Thursday";
		case 5 : return "Friday";
		case 6 : return "Saturday";
		case 7 : return "Sunday";
		}
		return null;
	}
}
