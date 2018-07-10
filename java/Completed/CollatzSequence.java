package Completed;

public class CollatzSequence {

	static int lSize;
	static long lNumber;
	
	static long initNumber;
	static int size = 0;

	public static void main(String[] args) {
		for(long i = 13; i < 1000000; i++) {
			initNumber = i;
			while(initNumber != 1) {
				if(initNumber % 2 != 0) {
					initNumber = (3 * initNumber) + 1;
				} else {
					initNumber = initNumber / 2;
				}
				size++;
			}
			System.out.println(i + ", Size: " + size);
			if(size > lSize) {
				lSize = size;
				lNumber = i;
			}
			size = 0;
		}
		System.out.println("Largest Number! *** " + lNumber + ": " + lSize);
	}
}