package java0515;

import java.util.Scanner;

public class exercise6 {
	public static void main(String[] args) {
		/**
		 * Nhap USD tinh ra VND
		 */
		
		// Input
		double tiGia = 23500;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so USD: ");
		double usd = scanner.nextDouble();
		
		// Output
		double vnd = usd * tiGia;
		System.out.println("Ket qua so VND: " + vnd + "đ");
	}
}
