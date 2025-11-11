package Lab2;

import java.util.Scanner;

public class Exercise1Lab2 {
	public static void main(String[] args) {
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
}
