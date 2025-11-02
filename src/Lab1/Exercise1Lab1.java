package Lab1;

import java.util.Scanner;

public class ExerciseLab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name of student: ");
		String studentName = scanner.nextLine();
		
		System.out.println("Average Score: ");
		int averageScore = scanner.nextInt();
		
		System.out.printf(""+studentName+" có điểm = " + averageScore);
		
		scanner.close();
	}
}
