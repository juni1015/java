package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=====학사관리시스템=====");
			System.out.println("1.학생등록 2.리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Student student = new Student();
				System.out.print("이름> ");
				student.setName(sc.next());
				System.out.print("국어점수> ");
				student.setKor(sc.nextInt());
				System.out.print("영어점수> ");
				student.setEng(sc.nextInt());
				System.out.print("수학점수> ");
				student.setMat(sc.nextInt());
				
				student.setTotal();
				student.setAvg();
				student.setGrade();
				list.add(student);
				System.out.println(student.getName() + " 학생이 등록되었습니다.");
			} else if(menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("-----------------------------------------------------------");
				for(Student s : list) {
					s.print();
				}
			} else if(menu == 3) {
				System.out.print("검색할 학번> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(selectSno.equals(s.getSno())) {
						System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
						System.out.println("-----------------------------------------------------------");
						s.print();
						find = true;
						break;
					} 
				}
				if(!find) {
					System.out.println("검색할 학번이 없습니다.");
				}
			} else if(menu == 4) {
				System.out.print("수정할 학번> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(selectSno.equals(s.getSno())) {
						System.out.print("수정할 이름> ");
						s.setName(sc.next());
						System.out.print("수정할 국어점수> ");
						s.setKor(sc.nextInt());
						System.out.print("수정할 영어점수> ");
						s.setEng(sc.nextInt());
						System.out.print("수정할 수학점수> ");
						s.setMat(sc.nextInt());
						
						s.setTotal();
						s.setAvg();
						s.setGrade();
						System.out.println("수정완료");
						find = true;
						break;
					} 
				}
				if(!find) {
					System.out.println("수정할 학번이 없습니다.");
				}
			} else if(menu == 5) {
				System.out.print("삭제할 학번> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Student s : list) {
					if(selectSno.equals(s.getSno())) {
						list.remove(s);
						System.out.println("삭제완료");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("삭제할 학번이 없습니다.");
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
