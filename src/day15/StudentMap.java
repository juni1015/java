package day15;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, String> studentMap = new HashMap<>();
		
		StudentDTO studentDTO1 = new StudentDTO();
		studentDTO1.setId(1L);
		studentDTO1.setStudentNumber("1111");
		studentDTO1.setStudnetName("김자바");
		studentDTO1.setStudentMajor("컴퓨터공학");
		studentDTO1.setStudentMoblie("010-1111-1111");
		
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
		
		studentMap.put(1L, studentDTO1.toString());
		studentMap.put(2L, studentDTO2.toString());
		studentMap.put(3L, studentDTO3.toString());
		
//		studentMap.put(1, studentDTO1);
//		studentMap.put(2, studentDTO2);
//		studentMap.put(3, studentDTO3);
		
		System.out.println("-----------------------------------------------");
		System.out.println("번호\t학번\t이름\t전공\t전화번호");
		System.out.println("-----------------------------------------------");
		
		for(int key : studentMap.keySet()) {
//			System.out.println(studentMap.get(key));
			System.out.println(key + "\t" + studentMap.get(key));
		}
	}

}
