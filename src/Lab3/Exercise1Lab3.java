package Lab3;

import java.util.Scanner;

public class Exercise1Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" >>> CHƯƠNG TRÌNH KIỂM TRA SỐ NGUYÊN TỐ <<< ");
		System.out.print(" Điền vào số để kiểm tra: ");
		
		int x = scanner.nextInt();
		boolean isNumber = true;
		if (x < 2) {
			isNumber = false;
		} else {
			for (int i = 2; i < x; i++) {
				System.out.println(i);
				if(x % i == 0) {
					isNumber = false;
					break;
				}
			}
		}
		if (isNumber == true) {
			System.out.println("Đây là số nguyên tố");
		} else {
			System.out.println("Đây không phải là số nguyên tố");
		}
		scanner.close();
	}
}
