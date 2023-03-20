package study;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
	/*
	 * 객체 생성할 때 싱글톤 생성하고 사용하는 방법 제대로 모름
	 *  
	 */
	private static ClientRepository repository = new ClientRepository();	//공유해서 사용하기 위한 싱글톤 객체 생성
	private ClientRepository() {};	//외부에서 객체 생성할 수 없게 생성자 막아둠
	public static ClientRepository getInstence() {	//외부에서 객체 정보만 확인할 수 있게 사용하는 메소드
		return repository;
	}
	
	List<ClientDTO> cList = new ArrayList<>();
	
	public boolean save(ClientDTO clientDTO) {
		if(cList.add(clientDTO)) {
			return true;
		}
		return false;
	}
	
	public List<ClientDTO> findAll() {
		return cList;
	}

}
