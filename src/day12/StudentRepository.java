package day12;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<StudentDTO> list = new ArrayList<>();
	
	public boolean save(StudentDTO studentDTO) {
		return list.add(studentDTO);	//성공하면 true하고 실패하면 false를 리턴함
	}
	
	public List<StudentDTO> findAll() {
		return list;
	}
	
	public StudentDTO findById(String sno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				return s;
			}
		}
		return null;
	}
	
	public boolean update(String sno, StudentDTO studentDTO) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				s.setName(studentDTO.getName());
				s.setKor(studentDTO.getKor());
				s.setEng(studentDTO.getEng());
				s.setMat(studentDTO.getMat());
				s.setGrade();
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String sno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				list.remove(s);
				return true;
			}
		}
		return false;
	}
}
