import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;


public class UnitFraction {
	static int UPPER_BOUND = 8;
	
	static BigDecimal num = new BigDecimal(1);
	static BigDecimal dom = new BigDecimal(1);
	
	static int cDom;
	static String biggestCycle = "";
	static String cycle;
	
	public static void main(String[] args) {
		MathContext mc = new MathContext(100, RoundingMode.HALF_UP);
		
		/*
		for(int i = 7; i < UPPER_BOUND; i++) {
			dom = new BigDecimal(i);
			String result = num.divide(dom, mc).toPlainString();
			
			cycle = getCycle(result.toCharArray());
			
			if(cycle.length() > biggestCycle.length()) {
				biggestCycle = cycle;
				cDom = i;
			}
			
			System.out.println("CycleSize(" + i + ") = " + cycle);
		}
		*/
		
		//System.out.println(getCycle(numb));
		
		System.out.println(getCycle(toIntArray("0.166666")));
	}
	
	public static String getCycle(int[] num) {
		System.out.println("0." + getString(num));
		
		
		int[] chainA;
		for(int i = 1; i < num.length / 2; i++) {
			chainA = new int[i];
			for(int l = 0; l < i; l++) {
				chainA[l] = num[l];
			}
			
			boolean match = false;
			int[] chainB = new int[chainA.length];
			for(int j = 0; j < num.length - (num.length % chainA.length); j++) {
				for(int z = 0; z < chainA.length; z++) {
					chainB[z] = num[j+z];
				}
				
				if(getString(chainA).contains(getString(chainB))) {
					match = true;
				} else if(match) {
					match = false;
					break;
				}
			}
		}

		return "";
	}
	
	public static int[] toIntArray(String s) {
		int[] array;
		int offset = 0;
		if(s.contains(Character.toString('.'))) {
			array = new int[s.length()-2];
			offset=2;
		} else {
			array = new int[s.length()];
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (char)s.charAt(i+offset) - '0';
		}
			
		return array;
	}
	
	public static String getString(int[] arr) {
		String s = "";
		
		for(int i = 0; i < arr.length; i++) {
			s+= Integer.toString(arr[i]);
		}
		
		return s;
	}
}
