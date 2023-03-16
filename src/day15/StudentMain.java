package day15;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		
		StudentDTO studentDTO1 = new StudentDTO();
		studentDTO1.setId(1L);
		studentDTO1.setStudentNumber("1111");
		studentDTO1.setStudnetName("김자바");
		studentDTO1.setStudentMajor("컴퓨터공학");
		studentDTO1.setStudentMoblie("010-1111-1111");
		
		StudentDTO studentDTO1_1 = new StudentDTO();
		studentDTO1_1.setId(1L);
		studentDTO1_1.setStudentNumber("1111");
		studentDTO1_1.setStudnetName("김자바");
		studentDTO1_1.setStudentMajor("컴퓨터공학");
		studentDTO1_1.setStudentMoblie("010-1111-1111");
		
		//객체에 있는 값 비교
		System.out.println(studentDTO1.equals(studentDTO1_1));
		System.out.println(studentDTO1.getId().equals(studentDTO1_1.getId()));
		
		StudentDTO studentDTO2 = new StudentDTO();
		studentDTO2.setId(2L);
		studentDTO2.setStudentNumber("2222");
		studentDTO2.setStudnetName("이자바");
		studentDTO2.setStudentMajor("경영학");
		studentDTO2.setStudentMoblie("010-2222-2222");
		
		StudentDTO studentDTO3 = new StudentDTO();
		studentDTO3.setId(3L);
		studentDTO3.setStudentNumber("3333");
		studentDTO3.setStudnetName("박자바");
		studentDTO3.setStudentMajor("전자공학");
		studentDTO3.setStudentMoblie("010-3333-3333");
		
//		studentMap.put(studentDTO1.getId(), studentDTO1.toString());
//		studentMap.put(studentDTO2.getId(), studentDTO2.toString());
//		studentMap.put(studentDTO3.getId(), studentDTO3.toString());
		
		//DTO클래스에 toString 오버라이딩하여 studentDTO1.toString() 하지 않아도 toString이 적용됨
		studentMap.put(studentDTO1.getId(), studentDTO1);
		studentMap.put(studentDTO2.getId(), studentDTO2);
		studentMap.put(studentDTO3.getId(), studentDTO3);
		
		System.out.println("-----------------------------------------------");
		System.out.println("번호\t학번\t이름\t전공\t전화번호");
		System.out.println("-----------------------------------------------");
		
		for(Long id : studentMap.keySet()) {
//			System.out.println(studentMap.get(key));
			System.out.println(studentMap.get(id));
			System.out.println(studentMap.get(id).getStudnetName());
		}
	}

}
