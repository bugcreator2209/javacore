package Lab3;

import java.util.Arrays;

public class DocumentLab3 {
	public static void main(String[] args) {
		//#1: Vòng lặp
		//1. Vòng lặp for
		for (int i = 0; i < 5; i++) {
			// Câu lệnh break - thoát hẳn vòng lặp
			if(i == 4) {
				break;
			}
			// Câu lệnh continue - không thoát hẳn vòng lặp. Chỉ bỏ qua vòng lặp hiện tại khi check điều kiện
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("==========");
		
		//2. Vòng lặp while
		int a = 0;
		while (a < 5) {
			System.out.println(a);
			a++; // Nếu không đặt a++ vòng lặp sẽ bị chạy vô hạn
		}
		System.out.println("==========");
		
		//3. Vòng lặp do/while - Khác với câu lệnh while (mặc định sẽ chạy 1 lần trước khi kiểm tra giá trị)
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while(j < 5);
		
		System.out.println("==========");
		
		//#2: Array - mảng : là cách lưu trữ " nhiều giá trị " bên trong 1 biến duy nhất => không tốn công khai báo nhiều lần
		// Khai báo mảng ở Java thì dùng {}
		String[] clubs = {"Arsenal", "MU", "Mancity"};
		System.out.println("Get clubs: " + Arrays.toString(clubs));
		// Để khai báo 1 mảng nhưng chưa muốn gán giá trị thì bằng cách
		String[] newArrays = new String[5];
		System.out.println("Get newArrays: " + Arrays.toString(newArrays));
		// Để gán giá hoặc thay thể 1 giá trị trong mảng - Ví dụ phần tử đầu tiên trong mảng
		newArrays[0] = "First Element";
		System.out.println("Get newArrays: " + Arrays.toString(newArrays));
		// Kiểm tra 1 mảng có bao nhiêu giá trị - Kết quả = 5 bằng với số lượng giá trị trong mảng đã khai báo ở trên
		System.out.println("Get newArrays: " + newArrays.length);
		System.out.println("==========");
		//3: Array using for
		// Để in từng phần tử trong array có thể dùng for thay vì phải ghi từng giá trị như dòng 48
		for (int i = 0; i < newArrays.length; i++) {
			System.out.println(newArrays[i]);
		}
	}
}
