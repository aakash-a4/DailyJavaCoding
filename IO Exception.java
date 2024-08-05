package Day4;
import java.util.*;
public class InputScanner {
	static void IOFunction(){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			float b = sc.nextFloat();
			long c = sc.nextLong();
			byte d = sc.nextByte();
			sc.nextLine();
			String s = sc.nextLine();
			
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(s);
			
			
		}
		sc.close();
	}
	public static void main (String[]args) {
		InputScanner g = new InputScanner();
		
		g.IOFunction();
	}
}
