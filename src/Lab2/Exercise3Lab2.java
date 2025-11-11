package Lab2;

import java.util.Scanner;

public class Exercise3Lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số điện: ");
		int soDien = scanner.nextInt();
		int tongSoTienDien;
		if (soDien <= 100) {
			tongSoTienDien = soDien * 1000;
			System.out.println("Tổng số tiền điện là:" + tongSoTienDien);
		} else {
			tongSoTienDien = soDien * 1500;
			System.out.println("Tổng số tiền điện là:" + tongSoTienDien);
		}
		scanner.close();
	}
}
