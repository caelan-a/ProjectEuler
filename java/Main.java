
public class Main {

	private static int LIMIT = 10000000;
	
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 3; i < LIMIT; i++) {
			if(isCurious(i)) {
				sum += i;
				System.out.println(i + " TRUE");
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("Sum: " + sum);
	}
	
	public static boolean isCurious(int n)
	{
		int sum = 0, num = n;
		while(num > 0){
			int f_sum = 1;
			for(int i = (num % 10); i > 0; i--) {
				f_sum *= i;
			}
			sum += f_sum;
			num /= 10;
		}
		
		if(sum == n) {
			return true;
		} else {
			return false;
		}
	}
}
