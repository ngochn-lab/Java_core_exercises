package java0515;

import java.util.Scanner;

public class exercise5 {
	public static void main(String[] args) {
		/**
		 * Chuyen do C sang do F
		 */
		
		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do C: ");
		double doC = scanner.nextDouble();
		
		// Output
		double doF = doC * 1.8 + 32;
		System.out.println("Do F: " + doF);
	}
}
