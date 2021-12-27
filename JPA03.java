package JPA03;

import java.util.*;

public class JPA03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input¡G");
		int a = sc.nextInt();
		int b = 0;
		for(int i = 1 ; i < a + 1 ; i++) {
			b = b + i;
		}
		System.out.println("1 + ... + " + a + " = " + b);
	}
}