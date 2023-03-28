package test_code;

import java.util.*;

public class StudentRepository {
	// 싱글톤 패턴을 구현하시오. 
	private static StudentRepository repository = new StudentRepository();
	private StudentRepository() {}
	public static StudentRepository getInstence() {
		return repository;
	}
	
	private Map<String, StudentDTO> studentMap = new HashMap<>();

	public boolean save(StudentDTO studentDTO) {
		// 저장을 위한 코드를 구현하시오.
		studentMap.put(studentDTO.getStudentNumber(), studentDTO);
		if(studentMap.size() == 0) {
			return false;
		} else {
			return true;
		}		
	}

	public Map<String, StudentDTO> findAll() {
		// map을 리턴하기 위한 코드를 구현하시오. 
		return studentMap;
		
	}
}
