package Lab3;

import java.util.Scanner;

public class Exercise2Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" >>> CHƯƠNG TRÌNH BẢNG CỬU CHƯƠNG MUỐN TÍNH <<< ");
		System.out.print(" Nhập vào số bảng cửu chương từ 1 đến 9: ");
		int value = scanner.nextInt();
		System.out.printf("Bảng cửu chương của %d \n", value);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d \n", value , i, value*i);
		}
	}
}
