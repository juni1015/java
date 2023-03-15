package day4;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("======성적======");
			System.out.print("이름 입력> ");
			String name = sc.next();
			System.out.print("국어점수 입력> ");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력> ");
			int eng = sc.nextInt();
			System.out.print("수학점수 입력> ");
			int mat = sc.nextInt();
			
			int total = kor + eng + mat;
			double avg = total / 3f;	//숫자 뒤에 f는 float
			
			char grade = ' ';
			
			if(avg >= 90) {
				grade = 'A';
			} else if(avg >= 80) {
				grade = 'B';
			} else if(avg >= 70) {
				grade = 'C';
			} else if(avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name, kor, eng, mat, total, avg, grade);
			//%d = 숫자, %s = 문자열, %f = 실수, %c = 문자
			//%f의 경우 .숫자를 입력하여 몇번째 자리수까지 나오게 할지 지정 가능
			
			System.out.print("다시입력(Y/y)> ");
			String reStart = sc.next();
			
			if(!(reStart.equals("Y") || reStart.equals("y"))) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
