import java.math.BigInteger;


public class LargestPath {
	private static int TRIANGLE_ROWS = 15;	

	private static int[] triangle = {
		75,
		95, 64,
		17, 47, 82,
		18, 35, 87, 10,
		20, 04, 82, 47, 65,
		19, 01, 23, 75, 03, 34,
		88, 02, 77, 73, 07, 63, 67,
		99, 65, 04, 28, 06, 16, 70, 92,
		41, 41, 26, 56, 83, 40, 80, 70, 33,
		41, 48, 72, 33, 47, 32, 37, 16, 94, 29,
		53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14,
		70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
		91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48,
		63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31,
		04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23};

	private static int interval = 1; // To descend rows

	public static void main(String[] args) {

		BigInteger[] currentArray = {BigInteger.valueOf(triangle[0])};

		for(int i = 1; i < ((TRIANGLE_ROWS * (TRIANGLE_ROWS + 1) ) / 2) - 1; i+=interval) {
			
			BigInteger[] temp = new BigInteger[2*currentArray.length];
			
			System.out.println("Starting at: " + i + ", final iterated on: " + (currentArray.length - 1 + 1+i));
			
			System.out.println("temp.length=" + temp.length);
			for(int j = 0; j < temp.length; j+=2) {
				temp[j] = currentArray[j/2].multiply(BigInteger.valueOf(triangle[i+(int)(j/2)]));
				temp[j+1] = currentArray[j/2].multiply(BigInteger.valueOf(triangle[i+(int)(j/2)+1]));
				
				System.out.println(temp[j] + " (temp[" +j+"]) = " + currentArray[j/2] + "*" + triangle[i+(j/2)]);
				System.out.println(temp[j+1] + " (temp[" +(j+1)+"]) = " + currentArray[j/2] + "*" + triangle[i+(j/2)+1]);
				System.out.println("triangle[" + (i+j+1)+ "]");
			}

			currentArray = temp;

			for(int n = 0; n < currentArray.length; n++) {
				System.out.println(temp[n] +", ");
			}

			interval++;
		}
	}
}
