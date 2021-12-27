package JPA04;

import java.util.*;

public class JPA04 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Input n (0 <= n <= 16)¡G");
			int a =sc.nextInt();
			int b = 1;
			if(a == 999) {
				System.exit(0);
			}
			else {
				for(int i = 1 ; i < a + 1 ; i++) {
					b = b * i;
				}
			}
			System.out.println(a + " ªº¶¥­¼ = " + b);
		}
	}
}