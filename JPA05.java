package JPA05;

import java.util.*;

public class JPA05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�п�J10�Ӿ�ơG");
		int[] a = new int[10];
		double b = 0;
		double c = 0;
		double d = 0;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("��" + (i+1) +"�Ӿ�ơG");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < 10 ; i++) {
			if(a[i] > 60) {
				b = b + 1;
				c = c + a[i];
			}
		}
		d = c / b;
		System.out.println("�}�C���j��60����" + (int)b + "��");
		System.out.println("�`�X��" + (int)c);
		System.out.println("�����Ȭ�" + d);
	}
}