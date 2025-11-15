package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" >>> CHƯƠNG TRÌNH NHẬP VÀO 1 MẢNG BẤT KỲ, SẮP XẾP VÀ LẤY SỐ LỚN NHỎ <<< ");
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		
		int[] arrayNumbers = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println("Nhập giá trị đầu tiên: ");
			} else {
				System.out.println("Nhập giá trị thứ " + i + " : ");
			}
			arrayNumbers[i] = scanner.nextInt();
		}
		
		System.out.println("Mảng bạn vừa nhập là: " + Arrays.toString(arrayNumbers));
		Arrays.sort(arrayNumbers);
		System.out.println("Sắp xếp mảng bạn vừa nhập: " + Arrays.toString(arrayNumbers));
		System.out.println("Số lớn nhất trong mảng là: " + getMaxNumber(arrayNumbers));
		System.out.println("Số nhỏ nhất trong mảng là: " + getMinNumber(arrayNumbers));
		scanner.close();
	}
	
	public static int getMaxNumber(int[] arrayNumbers) {
		int numberMax = arrayNumbers[0];
		for (int i = 1; i < arrayNumbers.length; i++) {
	        if (arrayNumbers[i] > numberMax) {
	        	numberMax = arrayNumbers[i];
	        }
	    }
		return numberMax;
	}
	
	public static int getMinNumber(int[] arrayNumbers) {
		int numberMin = arrayNumbers[0];
		
		for (int i = 1; i < arrayNumbers.length; i++) {
	        if (arrayNumbers[i] < numberMin) {
	            numberMin = arrayNumbers[i];
	        }
	    }
		return numberMin;
	}
}
