package java0515;

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
		// Input
		Scanner scanner_1 = new Scanner(System.in);
		Scanner scanner_2 = new Scanner(System.in);
		System.out.println("Nhập cạnh thứ nhất: ");
		double canh_1 = scanner_1.nextDouble();
		System.out.println("Nhập cạnh thứ hai: ");
		double canh_2 = scanner_2.nextDouble();
		
		// Output
		double ketQua = Math.sqrt(canh_1 * canh_1 + canh_2 * canh_2);
		System.out.println("Chiều dài cạnh huyền: " + ketQua);
	}
}
