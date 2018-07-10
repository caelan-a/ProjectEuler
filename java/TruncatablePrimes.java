import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TruncatablePrimes {
	public static void main(String[] args) throws IOException {
		InputStreamReader file = new InputStreamReader(new File("C:\\Users\\Caelan\\Desktop\\primes.txt"));
		BufferedReader bf = new BufferedReader(file);
		
		int c;
		while((c = fr.read()) != -1) {
			System.out.println((char)c);
		}
	}
}
