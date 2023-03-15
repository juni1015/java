package day12;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	StudentRepository repository = new StudentRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름> ");
		studentDTO.setName(sc.next());
		System.out.print("국어> ");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어> ");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학> ");
		studentDTO.setMat(sc.nextInt());
		studentDTO.setGrade();
		
		if(repository.save(studentDTO)) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}
	
	public void findAll() {
		List<StudentDTO> list = repository.findAll();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------------");
		for(StudentDTO s : list) {
			System.out.println(s.toString());
			//s.print는 바로 출력하고 s.toString은 출력해야할 값을 리턴해줌
			//정보를 확인하기 위해 toString을 씀
		}
	}
	
	public void findById() {
		System.out.print("조회할 학번> ");
		String sno = sc.next();
		
		StudentDTO studentDTO = repository.findById(sno);
		
		if(studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다.");
		} else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("-----------------------------------------------------------");
			System.out.println(studentDTO.toString());
		}	
	}
	
	public void update() {
		System.out.print("수정할 학번> ");
		String sno = sc.next();
		
		StudentDTO studentDTO = repository.findById(sno);
		
		if(studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다.");
		} else {
			System.out.print("수정할 이름> ");
			studentDTO.setName(sc.next());
			System.out.print("수정할 국어> ");
			studentDTO.setKor(sc.nextInt());
			System.out.print("수정할 영어> ");
			studentDTO.setEng(sc.nextInt());
			System.out.print("수정할 수학> ");
			studentDTO.setMat(sc.nextInt());
			studentDTO.setGrade();
			
			boolean updateOk = repository.update(sno, studentDTO);	
			//자바의 경우에는 없어도 되지만 데이터베이스에서 변경할 경우에는 업데이트를 따로 넘겨줘야하기 때문에 필요함
			
			if(updateOk) {
				System.out.println("수정완료");
			} else {
				System.out.println("수정실패");
			}	
		}
	}
	
	public void delete() {
		System.out.print("삭제할 학번> ");
		String sno = sc.next();
		
		if(repository.delete(sno)) {
			System.out.println("학번 " + sno + " 학생이 삭제되었습니다.");
		} else {
			System.out.println("조회할 수 없는 학번입니다.");
		}
	}
}
