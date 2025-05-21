package java0515;

import java.util.Scanner;

public class exercise4 {
	public static void main(String[] args) {
		/**
		 * Tinh trung binh cong cua 5 so nhap vao tu ban phim
		 */
		
		// Input
		final int SOCHIA = 5;
		int i = 0;
		double tong = 0;
		while (i < SOCHIA) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap so thu " + (i + 1) + " :");
			tong += scanner.nextDouble();
			i++;
		}
		
		// Output
		System.out.println("Trung binh cong cua 5 so: " + (tong / 5));
	}
}
