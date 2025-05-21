package java0515;

import java.util.Scanner;

public class exercise3 {
	public static void main(String[] args) {
		/**
		 * Nhập số nguyên dương có 2 ký số và tính tổng 2 ký số
		 */
		
		// Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong co 2 ky so: ");
		int soNguyenDuong = scanner.nextInt();
		
		// Check case số nguyên dương có 2 ký số là từ 10 đến 99
		while (soNguyenDuong < 10 || soNguyenDuong > 99) {
			System.out.println("Mời nhập lại: ");
			soNguyenDuong = scanner.nextInt();
		};
		
		// Output
		int chuSoThuNhat = soNguyenDuong / 10;
		int chuSoThuHai = soNguyenDuong % 10;
		int ketQua = chuSoThuNhat + chuSoThuHai;
		System.out.println("Chu so thu nhat: " + chuSoThuNhat);
		System.out.println("Chu so thu hai: " + chuSoThuHai);
		System.out.println("Ket qua: " + ketQua);
	}
}
