package Lab1;

import java.util.Scanner;

public class ExerciseLab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Length of rectangle: ");
		int lengthRectangle = scanner.nextInt();
		
		System.out.println("With of rectangle: ");
		int withRectangle = scanner.nextInt();
		
		System.out.println("Perimeter of a rectangle: " + (lengthRectangle + withRectangle) * 2);
		System.out.println("Area of ​​a rectangle: " + (lengthRectangle * withRectangle));
		System.out.println("Smallest side of a rectangle: " + Math.min(lengthRectangle, withRectangle));
		
		scanner.close();
	}
}
