package test_code;

import java.util.*;

public class StudentService {
	// 싱글톤 객체를 가져오기 위한 코드를 구현하시오. 
	StudentRepository repository = StudentRepository.getInstence();
	
	
	Scanner sc = new Scanner(System.in);
	public void save() {
		// 학생 정보를 입력받고 처리결과를 출력하는 코드를 구현하시오. 
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름> ");
		studentDTO.setStudentName(sc.nextLine());
		System.out.print("전화번호> ");
		studentDTO.setStudentMobile(sc.nextLine());
		System.out.print("전공> ");
		studentDTO.setStudentMajor(sc.nextLine());
		if(repository.save(studentDTO)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}		
	}

	public void findAll() {
		// map을 가져오기 위한 코드 및 출력을 위한 코드를 구현하시오. 
		Map<String, StudentDTO> studentMap = new HashMap<>(repository.findAll());
		//정렬
		List<String> keySet = new ArrayList<>(studentMap.keySet());
		Collections.sort(keySet);
		
		System.out.println("학번\t이름\t전화번호\t전공");
		System.out.println("-----------------------------------");
		for(String s : keySet) {
			System.out.println(studentMap.get(s).toString());
		}		
	}

}
