package day10_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> sList = new ArrayList<>();
		List<Teacher> tList = new ArrayList<>();
		boolean run = true;
		
		while(run) {
			System.out.println("=====학교시스템=====");
			System.out.println("1.학생 2.강사");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				while(true) {
					System.out.println("1.학생등록 2.학생리스트 3.학생조회 0.뒤로가기");
					System.out.print("메뉴선택> ");
					menu = sc.nextInt();
					if(menu == 1) {
						Student student = new Student();
						System.out.print("이름> ");
						student.setName(sc.next());
						System.out.print("성별(1.남자 2.여자)> ");
						int num = sc.nextInt();
						if(!(num == 1 || num == 2)) {
							System.out.println("없는 성별입니다");
							continue;
						}
						char gender = (num == 1)?'M' : 'F';
						student.setGender(gender);
						System.out.print("생년월일> ");
						student.setBirthday(sc.next());
						student.setId();
						System.out.print("평균> ");
						student.setAvg(sc.nextDouble());
						System.out.print("학과> ");
						student.setDept(sc.next());
												
						if(tList.size() == 0) {
							System.out.println("선택가능한 지도교수가 없습니다.");
						} else {
							//등록한 교수의 리스트가 보여짐 / 예시 : 1 ooo \n 2 ooo \n 3 ooo
							System.out.println("--------------------------------");
							for(int i = 0; i < tList.size(); i++) {
								System.out.println((i + 1) + "\t" + tList.get(i).getName());
							}
							System.out.println("--------------------------------");
							System.out.print("지도교수> ");
							int tNum = sc.nextInt();
							student.setTname(tList.get(tNum-1).getName());	
							//선택한 번호의 지도교수 이름이 들어감
							//tNum-1을 하는 이유는 위의 리스트에는 1부터 시작하고 tList의 인덱스는 0부터 시작하기 때문임
							tList.get(tNum-1).setStudentCnt();
							tList.get(tNum-1).setSalary();
							//지도교수 선택 시 해당 교수의 학생수와 월급이 오름
						}
						sList.add(student);
						System.out.println("학생 등록");
					} else if(menu == 2) {
						System.out.printf("주민번호\t\t이름\t성별\t생년월일\t학번\t지도교수\t평균\t학번\n");
						System.out.println("-------------------------------------------------------------------");
						for(Student s : sList) {
							s.print();
						}
					} else if(menu == 3) {
						System.out.println();
					} else if(menu == 0) {
						break;
					} else {
						System.out.println("다시입력");
					}	
					System.out.println();
				}
			} else if(menu == 2) {
				while(true) {
					System.out.println("1.강사등록 2.강사리스트 3.강사조회 0.뒤로가기");
					System.out.print("메뉴선택> ");
					menu = sc.nextInt();
					if(menu == 1) {
						Teacher teacher = new Teacher();
						System.out.print("이름> ");
						teacher.setName(sc.next());
						System.out.print("성별(1.남자 2.여자)> ");
						int num = sc.nextInt();
						if(!(num == 1 || num == 2)) {
							System.out.println("없는 성별입니다");
							continue;
						}
						char gender = (num == 1)?'M' : 'F';
						teacher.setGender(gender);
						System.out.print("생년월일> ");
						teacher.setBirthday(sc.next());
						teacher.setId();
						tList.add(teacher);
						System.out.println("강사등록완료");
					} else if(menu == 2) {
						System.out.printf("주민번호\t\t이름\t성별\t생년월일\t강사번호\t월급\n");
						System.out.println("-------------------------------------------------------------------");
						for(Teacher t : tList) {
							t.print();
						}
					} else if(menu == 3) {
						System.out.print("강사번호> ");
						String tno = sc.next();
						for(Teacher t : tList) {
							if(tno.equals(t.getTno())) {
								System.out.println("------------------------");
								for(Student s : sList) {
									if(s.getTname().equals(t.getName())) {	//학생이 고른 지도교수 이름과 교수이름이 같은 경우
										System.out.println(s.getName());	//학생의 이름을 출력
									}
								}
								System.out.println("------------------------");
							}
						}
					} else if(menu == 0) {
						break;
					} else {
						System.out.println("다시입력");
					}	
					System.out.println();
				}
			
				
			}
		}

	}

}
