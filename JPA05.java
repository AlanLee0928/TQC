package JPA05;

import java.util.*;

public class JPA05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入10個整數：");
		int[] a = new int[10];
		double b = 0;
		double c = 0;
		double d = 0;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("第" + (i+1) +"個整數：");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 10 ; i++) {
			if(a[i] > 60) {
				b = b + 1;
				c = c + a[i];
			}
		}
		d = c / b;
		System.out.println("陣列中大於60的有" + (int)b + "個");
		System.out.println("總合為" + (int)c);
		System.out.println("平均值為" + d);
	}
}