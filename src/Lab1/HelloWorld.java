package Lab1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// #Lab 1
		// Variables
		int a = 6;
		int b = 9;
		int c = a + b;
		//System.out.println("Sum: " + c);

		// 1. Các hàm xuất ra màn hình
		//System.out.print("Hello 1"); // Không hỗ trợ xuống dòng
		//System.out.println("Hello 2"); // Hỗ trợ xuống dòng
		//System.out.printf("Hello 3");

		// 2. Các hàm xuất ra màn hình
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Your name is: ");
//		String name = scanner.nextLine();
//		System.out.println("Your age is: ");
//		int age = scanner.nextInt();
//		System.out.println("My name is " + name + ", age = " + age);
//		scanner.close();
		
		// 3. Các hàm toán tử.
		System.out.println("First Number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Second Number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Sum of total number " + (firstNumber + secondNumber));
		System.out.println("Max of numberL: " + Math.max(firstNumber, secondNumber));
		scanner.close();
	}
}
