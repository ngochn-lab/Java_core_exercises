package java0515;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		/**
		 * 	P(x) = ax^n khi x = 8
		 *
		 * 	a: số thực
		 * 	n: số nguyên không âm
		 */
		
		// Input
		int x = 8;
		Scanner scannerA = new Scanner(System.in);
		Scanner scannerB = new Scanner(System.in);
		System.out.println("Vui lòng nhập số thực a: ");
		double a = scannerA.nextDouble();
		System.out.println("Vui lòng nhập số nguyên không âm n: ");
		int n = scannerB.nextInt();
		
		// Case check khi nhap n < 0 vao thi se bat user nhap lai
		while (n < 0) {
			System.out.println("n la so nguyen khong am. Vui long nhap lai!");
			n = scannerB.nextInt();
		}
		// Output
		double p = a * Math.pow(x, n);
		System.out.println("Kết quả : P(x) = " + p + " khi x = 8");
	}
}
