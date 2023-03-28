package test_code;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		while (true) {
			System.out.println("=====프로그래밍 언어활용 평가=====");
			System.out.println("1.학생등록 2.학생목록조회 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				service.save();
			} else if (menu == 2) {
				service.findAll();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
