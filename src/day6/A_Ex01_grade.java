package day6;

import java.util.Scanner;

public class A_Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 이용한 성적리스트 만들기
		// 배열로 저장하면 새로운 성적을 받을때 기존데이터가 초기화 되지않는다. 저장이가능

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		char[] grade = new char[5];
		int cnt = 0;

		while (true) {
			System.out.println("=====성적시스탬======");
			System.out.println("1.성적등록 2.리스트 0.종료");
			System.out.print("메뉴선택 >  ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이름입력 > ");
				name[cnt] = sc.next();
				System.out.print("국어점수입력 > ");
				kor[cnt] = sc.nextInt();
				System.out.print("영어점수입력 > ");
				eng[cnt] = sc.nextInt();
				System.out.print("수학점수입력 > ");
				mat[cnt] = sc.nextInt();

				total[cnt] = kor[cnt] + eng[cnt] + mat[cnt];
				avg[cnt] = total[cnt] / 3;

				if (avg[cnt] >= 90) {
					grade[cnt] = 'A';
				} else if (avg[cnt] >= 80) {
					grade[cnt] = 'B';
				} else if (avg[cnt] >= 70) {
					grade[cnt] = 'C';
				} else if (avg[cnt] >= 60) {
					grade[cnt] = 'D';
				} else {
					grade[cnt] = 'F';
				}
				System.out.println("성적등록완료");
				cnt++;

			} else if (menu == 2) {
				System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점");
				System.out.println("-----------------------------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %c\n", name[i], kor[i], eng[i], mat[i], total[i],
							avg[i], grade[i]);
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}
		System.out.println("프로그램 종료");

	}

}
