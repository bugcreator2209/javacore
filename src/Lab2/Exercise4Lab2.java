package Lab2;

import java.util.Scanner;

public class Exercise4Lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất|");
		System.out.println("| 2. Giải phương trình bậc hai|");
		System.out.println("| 3. Tính số tiền điện|");
		System.out.println("| 4. Kết thúc|");
		System.out.println("++ ------------------ ++");
		
		int mode = scanner.nextInt();
		switch(mode) {
			case 1:
				exec1();
				break;
			case 2:
				exec2();
				break;
			case 3:
				exec3();
				break;
			default:
				System.out.println("Bạn đã thoát chương trình!");
				System.exit(0);
				break;
		}
		scanner.close();
	}
	
	public static void exec1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- Cho phương trình ax + b = 0: ---");
		System.out.println("Nhập vào số nguyên a: ");
		byte soNguyenA = scanner.nextByte();
		System.out.println("Nhập vào số nguyên b: ");
		byte soNguyenB = scanner.nextByte();
		
		if (soNguyenA == 0 && soNguyenB == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if(soNguyenA == 0 && soNguyenB != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = -soNguyenB / soNguyenA;
			System.out.println("Phương trình có x = :" + x);
		}
		scanner.close();
	}
	
	public static void exec2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- Cho phương trình ax^2 + bx + c = 0: ---");
		System.out.println(" Nhập số nguyên a: ");
		byte valueA = scanner.nextByte();
		System.out.println(" Nhập số nguyên b: ");
		byte valueB = scanner.nextByte();
		System.out.println(" Nhập số nguyên c: ");
		byte valueC = scanner.nextByte();
		
		if (valueA == 0) {
			if (valueB == 0 && valueC == 0) {
				System.out.println(" Phương trình vô số nghiệm ");
			} else if(valueB == 0 && valueC != 0) {
				System.out.println(" Phương trình vô nghiệm ");
			} else {
				float x = -valueC / valueB;
				System.out.println("Phương trình có x = :" + x);
			}
		} else {
			double delta = Math.pow(valueB, 2) - 4 * valueA * valueC;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				int x = -valueB / (2 * valueA);
				System.out.println("Phương trình có nghiệm kép x = :" + x);
			} else {
				double x1 = (-valueB + Math.sqrt(delta))/(2*valueA);
				double x2 = (-valueB - Math.sqrt(delta))/(2*valueA);
				System.out.printf("Phương trình có 2 nghiệm riêng biệt %f và %f", x1, x2);
			}
		}
		scanner.close();
	}
	
	public static void exec3() {
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
