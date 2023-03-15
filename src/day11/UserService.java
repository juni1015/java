package day11;

import java.util.List;
import java.util.Scanner;

public class UserService {
	UserRepository repository = new UserRepository();
	Scanner sc = new Scanner(System.in);
	
	String loginEmail = null;
	String loginPassword = null;
	
	public void save() {
		System.out.print("이메일> ");
		String email = sc.next();
		System.out.print("패스워드> ");
		String password = sc.next();
		System.out.print("이름> ");
		String name = sc.next();
		System.out.print("나이> ");
		int age = sc.nextInt();
		UserDTO userDTO = new UserDTO(email, password, name, age);
		if(repository.save(userDTO)) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	public boolean loginCheck() {
		System.out.print("이메일> ");
		String email = sc.next();
		System.out.print("비밀번호> ");
		String password = sc.next();
		
		if(repository.loginCheck(email, password)) {
			System.out.println("로그인 성공");
			loginEmail = email;
			loginPassword = password;
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	
	public void findAll() {
		List<UserDTO> list = repository.findAll();
		for(UserDTO u : list) {
			System.out.println("이메일\t\t패스워드\t이름\t나이\t가입일");
			System.out.println("---------------------------------------------------------");
			System.out.println(u.toString());	
			//toString은 해시코드(주소값)를 가지고 옴
			//toString은 Object클래스 오버라이딩임 
		}		
	}
	
	public void findById() {	//읽기
		//마이페이지에 들어갈 때 해당 메소드 진행시 
		//로그인되어 있는 상태로 다시 아이디 패스워드 받을 필요가 없기 때문에 변수에 로그인 아이디 패스워드를 받아넣어 확인될 수 있도록 함
//		System.out.print("아이디> ");
//		String email = sc.next();
//		System.out.print("비밀번호> ");
//		String password = sc.next();
		
//		UserDTO userDTO = repository.findById(email, password);
		
//		List<UserDTO> list = repository.findAll();
//		for(UserDTO u : list) {
//			if(u.getEmail().endsWith(email) && u.getPassword().equals(password)) {
//				System.out.println(u.toString());
//			}
//		}
		
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if(userDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println(userDTO);
		}
	}
}
