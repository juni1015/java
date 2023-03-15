package day13;

import java.util.List;
import java.util.Scanner;

public class ClientService {
	//싱글톤패턴
	private static ClientService service = new ClientService();	
	private ClientService() {}	//생성자
	public static ClientService getIstence() {
		return service;
	}
	
	private Scanner sc = new Scanner(System.in);
	private ClientRepository repository = ClientRepository.getInstence();
	private String loginId = null;	//세션역할
	private String loginPassword = null;
	
	public void save() {
		ClientDTO clientDTO = new ClientDTO();
		System.out.print("id> ");
		clientDTO.setId(sc.next());
		System.out.print("password> ");
		clientDTO.setPassword(sc.next());
		System.out.print("name> ");
		clientDTO.setName(sc.next());
		if(repository.save(clientDTO)) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	public boolean loginCheck() {
		System.out.print("id> ");
		String id = sc.next();
		System.out.print("password> ");
		String password = sc.next();
		
		if(repository.loginChenk(id, password)) {
			loginId = id;
			loginPassword = password;
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	
	public void findAll() {
		List<ClientDTO> cList = repository.findAll();
		System.out.println("계좌번호\t\t아이디\t패스워드\t예금주\t잔액\t가입일");
		System.out.println("------------------------------------------------------------------");
		for(ClientDTO c : cList) {
			System.out.println(c.toString());
		}
	}
	
	public void findById() {
		ClientDTO clientDTO = repository.findById(loginId, loginPassword);
		if(clientDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("계좌번호\t\t아이디\t패스워드\t예금주\t잔액\t가입일");
			System.out.println("------------------------------------------------------------------");
			System.out.println(clientDTO.toString());
			System.out.println("------------------------------------------------------------------");
			List<BreakdownDTO> bList  = repository.breakList(clientDTO.getAccount());
			if(bList.size() == 0) {
				System.out.println("입출금 내역이 없습니다");
			} else {				
				System.out.println("▼입출금내역▼");
				System.out.println("------------------------------------------------------------------");
				System.out.println("계좌번호\t\t구분\t거래금액\t거래후 잔액\t거래일");
				for(BreakdownDTO b : bList) {
					System.out.println(b.toString());
				}
				System.out.println("------------------------------------------------------------------");
			}
		}
		
	}
	
	public void deposit() {
		String account = repository.getAccount(loginId, loginPassword);
		if(account == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.print("입금금액> ");
			long money = sc.nextLong();
			if(repository.deposit(account, money)) {
				System.out.println("입금완료");
			} else {
				System.out.println("입금실패");
			}
		}
		
	}
	
	public void withdraw() {
		String account = repository.getAccount(loginId, loginPassword);
		if(account == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.print("출금금액> ");
			long money = sc.nextLong();
			int ok = repository.withdraw(account, money);
			if(ok == 1) {
				System.out.println("출금완료");
			} else if(ok == 0) {
				System.out.println("잔액부족");
			} else {
				System.out.println("계좌오류");
			}
		}
	}
	
	public void transfer() {
		String wAccount = repository.getAccount(loginId, loginPassword);
		if(wAccount == null) {
			System.out.println("출금계좌 오류");
			return;
		}
		System.out.print("이체할 계좌번호> ");
		String transferAccount = sc.next();
		System.out.print("이체할 금액> ");
		long transferMoney = sc.nextLong();
		if(repository.transferChenk(transferAccount)) {
			int ok = repository.withdraw(wAccount, transferMoney);
			if(ok == 1) {
				System.out.println("출금완료");
				if(repository.deposit(transferAccount, transferMoney)) {
					System.out.println("입금완료");
				}
			} else if(ok == 0) {
				System.out.println("잔액부족");
			} else {
				System.out.println("계좌오류");
			}
		} else {
			System.out.println("이체할 계좌번호가 없습니다.");
		}
	}
	
	public void update() {
		System.out.print("패스워드 확인> ");
		String password = sc.next(); 
		
		if(password.equals(loginPassword)) {
			System.out.print("수정할 패스워드> ");
			String updatePassword = sc.next();
			if(repository.update(loginId, loginPassword, updatePassword)) {
				loginPassword = updatePassword;
				System.out.println("패스워드 수정완료");
			} else {
				System.out.println("패스워드 수정실패");
			}
		} else {
			System.out.println("패스워드가 일치하지 않습니다.");
		}
	}
	
	public boolean delete() {
		if(repository.delete(loginId, loginPassword)) {
			System.out.println("삭제성공");
			return false;
		} else {
			System.out.println("삭제실패");
			return true;
		}
	}
	
	public void logout() {
		loginId = null;
		loginPassword = null;
		System.out.println("로그아웃");
	}

}
