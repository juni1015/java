package day4;

import java.util.Scanner;

public class A_Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름, 국어점수, 영어점수, 수학점수를 입력받고
		// 점수 총합의 평균을 구하고 90점 이상이면 A, 80이상 B, 70이상 C, 60이상 D, 그이하라면 F
		// 모든 정보를 취합하여 출력하고 재실행 여부를 물어보는 코드를 작성해라 ( 조건문/반복문 사용 )
		
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (true) {
			System.out.println("====성적====");
			System.out.print("이름 입력 > ");
			String name = sc.next();
			System.out.print("국어점수 입력 > ");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력 > ");
			int eng = sc.nextInt();
			System.out.print("수학점수 입력 > ");
			int mat = sc.nextInt();

			int total = kor + eng + mat;
			double avg = total / 3f;
			char grade = ' ';

			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg > 70) {
				grade = 'C';

			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name, kor, eng, mat, total, avg, grade);
			// %d=숫자, %s=문자열,%f=실수,%c=문자

		

				System.out.printf("다시하시겠습니까 Y/N = ");
				String reStart = sc.next();

				if (reStart.equals("Y")) {
					run = true;
					
				} else if (reStart.equals("N")) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("\n\n잘못된 입력입니다 ");
					System.out.println("종료되었습니다.");
					break;
				}
			

			

		}

	}

}
