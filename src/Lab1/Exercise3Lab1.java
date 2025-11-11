package Lab1;

import java.util.Scanner;

public class ExerciseLab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cạnh của hình lập phương: ");
		double canh = scanner.nextDouble();
		
		System.out.println("Thể tích của hình lập phương: " + (Math.pow(canh, 3)));
		scanner.close();
	}
}
