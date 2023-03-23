package project_20230321;

import java.util.List;
import java.util.Scanner;

public class ManagerService implements UserInt {
	private static ManagerService service = new ManagerService();
	private ManagerService() {}
	public static ManagerService getInstence() {
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	ManagerRepository repository = ManagerRepository.getInstence();
	Util util = new Util();
	
	String loginId = null;
	String loginPw = null;
	
	@Override
	public void save() {
		System.out.print("관리자생성 패스워드> ");
		if(repository.managerPw(sc.nextLine())) {
			UserDTO userDTO = new UserDTO();
			userDTO.setManagerOk(0);	
			String inputStr = null;		
			while(true) {			
				while(true) {
					inputStr = util.stringCheck("아이디");
					if(inputStr != null) {
						break;
					}
				}
				userDTO.setId(inputStr);
				if(util.overrapCheck(repository.findAll(), userDTO.getId(), 0)) {
					System.out.println("중복된 아이디가 있습니다. 다시입력");
				} else {
					break;
				}
			}
			while(true) {
				inputStr = util.stringCheck("패스워드");
				if(inputStr != null) {
					break;
				}
			}
			userDTO.setPw(inputStr);
			while(true) {
				inputStr = util.stringCheck("이름");
				if(inputStr != null) {
					break;
				}
			}
			userDTO.setName(inputStr);
			System.out.print("휴대폰번호> ");
			userDTO.setPhoneNumber(util.skip(sc.nextLine(), userDTO.getPhoneNumber()));
			System.out.print("주소> ");
			userDTO.setAddress(util.skip(sc.nextLine(), userDTO.getAddress()));
			
			if(repository.save(userDTO)) {
				System.out.println("회원가입 완료");
			} else {
				System.out.println("회원가입 실패");
			}
		} else {
			System.out.println("관리자 패스워드 확인필요");
		}
	}
	
	@Override
	public boolean loginCheck(int memberOk) {
		System.out.print("아이디> ");
		String id = sc.nextLine();
		System.out.print("패스워드> ");
		String pw = sc.nextLine();

		if(repository.loginCheck(id, pw, memberOk)) {
			loginId = id;
			loginPw = pw;
			System.out.println("로그인 성공");
			return true;
		}
		System.out.println("로그인 실패");
		return false;
	}
	
	@Override
	public void findById() {
		if(loginId == null || loginPw == null) {
			System.out.println("로그인 오류");
			return;
		}
		UserDTO userDTO = repository.findById(loginId, loginPw);
		if(userDTO == null) {
			System.out.println("세션오류");
		} else {
			System.out.println("아이디\t패스워드\t이름\t휴대폰번호\t\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			userDTO.print();
		}
	}
	
	@Override
	public void findAll() {
		List<UserDTO> uList = repository.findAll();
		System.out.println("아이디\t패스워드\t이름\t휴대폰번호\t\t생성날짜");
		System.out.println("---------------------------------------------------------------------------");
		for(UserDTO u : uList) {
			u.print();
		}
	}
	
	@Override
	public void update() {
		System.out.print("패스워드 확인> ");
		String pwOk = sc.nextLine();
		
		if(pwOk.equals(loginPw)) {
			UserDTO userDTO = repository.findById(loginId, loginPw);
			System.out.print("패스워드> ");
			String pw = util.skip(sc.nextLine(), userDTO.getPw()); 
			System.out.print("이름> ");
			String name = util.skip(sc.nextLine(), userDTO.getName());
			System.out.print("휴대폰번호> ");
			String phoneNumber = util.skip(sc.nextLine(), userDTO.getPhoneNumber());
			System.out.print("주소> ");
			String address = util.skip(sc.nextLine(), userDTO.getAddress());
			if(repository.update(loginId, loginPw, pw, name, phoneNumber, address)) {
				loginPw = pw;
				System.out.println("수정완료");
			} else {
				System.out.println("수정실패");
			}
		} else {
			System.out.println("패스워드 확인필요");
		}		
	}
	
	@Override
	public boolean logout() {
		loginId = null;
		loginPw = null;
		System.out.println("로그아웃");
		return false;		
	}
	
	@Override
	public boolean delete() {
		System.out.print("패스워드 확인> ");
		String pwOk = sc.nextLine();
		
		if(pwOk.equals(loginPw)) {
			while(true) {
				System.out.println("정말 탈퇴하시겠습니까? 1.Y 2.N ");
				int menu = util.menu();
				
				if(menu == 1) {
					if(repository.delete(loginId, loginPw)) {
						System.out.println("삭제완료");
						loginId = null;
						loginPw = null;
						return false;
					} else {
						System.out.println("삭제실패");
					}
				} else if(menu == 2) {
					break;
				} else {
					System.out.println("다시입력");
				}
			}
		} else {
			System.out.println("패스워드 확인필요");
		}
		return true;		
	}	
	
	public void testData() {
		boolean ok = false;
		for(int i = 1; i < 6; i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId("mana" + i);
			userDTO.setPw("pw" + i);
			userDTO.setName("관리자" + i);
			userDTO.setPhoneNumber("010-" + i + i + i + i + "-" + i + i + i + i );
			userDTO.setManagerOk(0);
			ok = repository.save(userDTO);
		}
		if(ok) {
			System.out.println("관리자 테스트데이터 저장완료");
		} else {
			System.out.println("관리자 테스트데이터 저장실패");
		}
	}

}
