package day12;

import java.util.List;
import java.util.Scanner;

import day8.User;

public class UserService {
	private static UserService Service = new UserService();
	
//	private UserService() {
//		//싱글톤 객체 : 생성자가 private이면 외부에서 객체 생성이 불가능하기 때문에 
//		//main에서는 getInstance메소드를 이용하여 객체를 사용함 
//	}
	public static UserService getInstance() {
		//메소드를 사용하려면 객체 만들어 객체변수명으로 메소드를 실행하는데
		//싱글톤의 경우 해당 클래스에서만 하나의 객체를 생성하기 때문에
		//객체변수명이 아닌 클래스명으로 메소드를 실행하기 위해 static을 사용해야 함
		return Service;
	}
	
	Scanner sc = new Scanner(System.in);
	UserRepository repository = UserRepository.getInstance();
	String loginEmail = null;
	String loginPassword = null;
//	Util util = new Util();

	public void domainChange() {
		String before = UserDTO.getDomain();
		System.out.print("변경할 도메인> ");
		UserDTO.setDomain(sc.next());
		System.out.println(before + " => " + UserDTO.getDomain() + "변경완료!");
	}
	
	public void save() {
		UserDTO userDTO = new UserDTO();
//		System.out.print("이메일> ");
//		String id = util.overlapCheck();
		String id = Util.overlapCheck(repository.findAll(), "이메일");
		userDTO.setEmail(id);	//util 클래스로 아이디 중복체크 만들기 메소드명 : overlapCheck
		System.out.print("패스워드> ");
		userDTO.setPassword(sc.next());
		System.out.print("이름> ");
		userDTO.setName(sc.next());
		System.out.print("나이> ");
		userDTO.setAge(sc.nextInt());
		userDTO.setGender(Util.genderCheck());		
		
		if(repository.save(userDTO)) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록실패");
		}
	}
	
	public boolean loginCheck() {
		System.out.print("이메일> ");
		String email = sc.next();
		System.out.print("패스워드> ");
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
		System.out.println("이메일\t\t패스워드\t이름\t나이\t성별\t가입일");
		System.out.println("----------------------------------------------------------");
		for(UserDTO u : list) {
			System.out.println(u.toString());
		}
	}
	
	public void findById() {
		if(loginEmail == null || loginPassword == null) {
			System.out.println("로그인오류");
			return;
		}
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if(userDTO == null) {
			System.out.println("세션오류");
		} else {
			System.out.println("이메일\t\t패스워드\t이름\t나이\t성별\t가입일");
			System.out.println("------------------------------------------------------------------------");
			System.out.println(userDTO.toString());			
		}
	}
	
	public boolean logout() {
		loginEmail = null;
		loginPassword = null;
		System.out.println("로그아웃");
		return false;
	}
	
	public void update() {
//		System.out.print("이메일 확인> ");
//		String email = sc.next();
		System.out.print("패스워드 확인> ");
		String password = sc.next();
		
		if(password.equals(loginPassword)) {
			UserDTO userDTO = new UserDTO();
			System.out.print("수정할 패스워드> ");
			userDTO.setPassword(sc.next());
			System.out.print("수정할 이름> ");
			userDTO.setName(sc.next());
			System.out.print("수정할 나이> ");
			userDTO.setAge(sc.nextInt());
			
			if(repository.update(userDTO, loginEmail, loginPassword)) {
				System.out.println("수정 성공");
				loginPassword = userDTO.getPassword();
			} else {
				System.out.println("수정 실패");
			}
		} else {
			System.out.println("로그인 정보 다시 확인");
		}
	}
	
	public boolean delete() {
//		System.out.print("이메일 확인> ");
//		String email = sc.next();
		System.out.print("패스워드 확인> ");
		String password = sc.next();
		
		if(password.equals(loginPassword)) {
			while(true) {
				System.out.print("정말 탈퇴하시겠습니까? 1.Y 2.N> ");
				int menu = sc.nextInt();
				
				if(menu == 1) {
					if(repository.delete(loginEmail, loginPassword)) {
						System.out.println("탈퇴 성공");
						loginEmail = null;
						loginPassword = null;
						return false;
					} else {
						System.out.println("탈퇴 실패");
					}
				} else if(menu == 2) {
					break;
				} else {
					System.out.println("다시 입력");
					continue;
				}
			}
		} else {
			System.out.println("로그인 정보 다시 확인");
		}
		return true;
	}
}
