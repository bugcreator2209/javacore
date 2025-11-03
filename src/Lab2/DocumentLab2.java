package Lab2;

import java.util.Scanner;

public class DocumentLab2 {
	public static void main(String[] args) {
		//#1: Các kiểu dữ liệu
		byte a = 100; // Kiểu dữ liệu byte có thể lưu trữ dữ liệu từ -128 đến 127 - chiếm 1 byte dữ liệu
		short b = 1000; // Kiểu dữ liệu short có thể lưu trữ dữ liệu từ -32.768 đến 32.767- chiếm 2 byte dữ liệu
		int c = 10000; // Kiểu dữ liệu int có thể lưu trữ dữ liệu từ -2.147.483.648 to 2.147.483.647 - chiếm 4 byte dữ liệu
		long d = 10000000; // Kiểu dữ liệu long có thể lưu trữ dữ liệu từ 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - chiếm 8byte dữ liệu
		char firstString = 'A'; // Kiểu dữ liệu char chỉ có thể lưu trữ 1 dữ liệu - chiếm 2 byte
		String secondString = "Hello"; // Kiểu dữ liệu String không có byte cố định mà sẽ dựa theo dộ dài của string
		boolean isTrue = true; // Kiểu dữ liệu boolean chiếm 1 bit và sẽ chỉ có giá trị true/false
		float firstFloat = 10.5f; // Kiểu dữ liệu float chiếm 4 byte và có thể lấy từ 6 đến 7 chữ số thập phân
		double firstDouble = 3.1411d; // Kiểu dữ liệu double chiếm 8 byte và có thể lấy đến 15 chữ số thập phân
		// Nếu không có f/d ở cuối biến số => java sẽ coi đó là kiểu dữ liệu double
		
		//#2: Các toán tử: https://www.w3schools.com/java/java_operators.asp
		
		//#3: Câu điều kiện
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập số tiền đóng thuế: ");
//		int thue = scanner.nextInt();
		// Điều kiệu if/else
//		if(thue < 10) {
//			System.out.println("Không cần đóng thuế");
//		} else if (thue >= 10 && thue <= 15) {
//			System.out.println("Đóng thuế 10%");
//		} else if (thue > 15 && thue <= 30) {
//			System.out.println("Đóng thuế 20%");
//		} else {
//			System.out.println("Đóng thuế 50%");
//		}
//		scanner.close();
		
		// Điều kiện switch/case
//		int day = 4;
//		switch (day) {
//			case 1:
//				System.out.println("Monday");
//				break;
//			case 2:
//				System.out.println("Tuesday");
//				break;
//			case 3:
//				System.out.println("Wednesday");
//				break;
//			case 4:
//				System.out.println("Thursday");
//				break;
//			case 5:
//				System.out.println("Friday");
//				break;
//			case 6:
//				System.out.println("Saturday");
//				break;
//			case 7:
//				System.out.println("Sunday");
//				break;
//			default:
//				System.out.println("Don't Know");
//		}
		
		// Exercise
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ  |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		int operator = scanner.nextInt();
		switch (operator) {
			case 1:
				System.out.println("Lựa chọn của bạn là phép cộng");
				break;
			case 2:
				System.out.println("Lựa chọn của bạn là phép trừ");
				break;
			case 3:
				System.out.println("Bạn đã lựa chọn thoát chương trình");
				System.exit(0);
				break;
			default:
				System.out.println("Opps!!");
				System.exit(0);
		}
		int value = scanner.nextInt();
		scanner.close();
	}
}
