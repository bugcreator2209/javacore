package Lab2;

import java.util.Scanner;

public class Exercise2Lab2 {
	public static void main(String[] args) {
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
	}
}
