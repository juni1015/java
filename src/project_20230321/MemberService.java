package project_20230321;

import java.util.List;
import java.util.Scanner;

import day8.User;

public class MemberService implements UserInt {
	private static MemberService service = new MemberService();
	private MemberService() {}
	public static MemberService getInstence() {
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	Util util = new Util();
	private MemberRepository repository = MemberRepository.getInstence();	//여기에 왜 private 쓰는지 이해 못함
	
	String loginId = null;
	String loginPw = null;
	
	@Override
	public void save() {
		UserDTO userDTO = new UserDTO();
		userDTO.setManagerOk(1);
		String inputStr = null;
		while(true) {			
			while(true) {
				inputStr = util.stringCheck("아이디");
				if(inputStr != null) {
					break;
				}
			}
			userDTO.setId(inputStr);
			if(util.overrapCheck(repository.findAll(), userDTO.getId(), 1)) {
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
			System.out.println("로그인 완료");
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
			System.out.println("아이디\t패스워드\t이름\t휴대폰번호\t주소\t보유금액\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(userDTO.toString());
		}		
	}

	@Override
	public void findAll() {
		List<UserDTO> ulList = repository.findAll();
		System.out.println("아이디\t패스워드\t이름\t휴대폰번호\t주소\t보유금액\t생성날짜");
		System.out.println("---------------------------------------------------------------------------");
		for(UserDTO u : ulList) {
			System.out.println(u.toString());
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
	
	public void balanceUp() {
		System.out.print("충전할 금액> ");
		long money = sc.nextLong();
		long userBalance = repository.balanceUp(loginId, loginPw, money);
		
		if(userBalance == 0) {
			System.out.println("충전 실패");
		} else {
			System.out.println("충전 후 잔액은 " + userBalance);
		}
	}
	
	public UserDTO loginUser() {
		UserDTO userDTO = repository.findById(loginId, loginPw);
		return userDTO;
	}
	
	public void testData() {
		boolean ok = false;
		for(int i = 1; i < 6; i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId("mem" + i);
			userDTO.setPw("pw" + i);
			userDTO.setName("회원" + i);
			userDTO.setPhoneNumber("010-" + i + i + i + i + "-" + i + i + i + i );
			userDTO.setAddress("인천");
			userDTO.setBalance(i*10000);
			userDTO.setManagerOk(1);
			ok = repository.save(userDTO);
		}
		if(ok) {
			System.out.println("상품 테스트데이터 저장완료");
		} else {
			System.out.println("상품 테스트데이터 저장실패");
		}
	}
	
}
