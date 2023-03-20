package study;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClientService {
	/*
	 * 객체 생성할 때 싱글톤을 쓰는 방법, 이유에 대해 정확하게 인지하지 못하고 있음
	 * 싱글톤 생성하고 사용하는 방법 제대로 모름
	 */
	private static ClientService service = new ClientService();	//외부에서 객체 생성이 불가능하기 때문에 내부에서 생성
	private ClientService() {};	//외부에서 객체를 생성하지 못하도록 막아둠
	public static ClientService getInstance() {	//내부에서 생성한 객체를 외부에서 사용이 가능하도록 메소드 생성 / 외부에서 사용하는 메소드로 public으로 만들어야 함
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	ClientRepository repository = ClientRepository.getInstence();	//뜻 정확하게 모르고 제대로 사용할 줄 모름
	
	public void save() {
		ClientDTO clientDTO = new ClientDTO();
		System.out.print("아이디> ");
		clientDTO.setId(sc.nextLine());
		System.out.print("패스워드> ");
		clientDTO.setPw(sc.nextLine());
		System.out.print("목적(1.예적금, 2.투자, 3.월급, 4.생활비)> ");
		clientDTO.setPurpose(sc.nextInt());
		if(repository.save(clientDTO)) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	public void findAll() {
		List<ClientDTO> cList = repository.findAll();
		if(cList.size() == 0) {
			System.out.println("조회할 내용이 없습니다");
		} else {
//			for(String c : cList) {
//				
//			}
		}
	}

}
