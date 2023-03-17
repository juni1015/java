package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClientRepository {
	private static ClientRepository repository = new ClientRepository();
	private ClientRepository() {}
	public static ClientRepository getInstence() {
		return repository;
	}
	
//	List<ClientDTO> cList = new ArrayList<>();
	Map<String, ClientDTO> cMap = new HashMap<>();
//	List<BreakdownDTO> bList = new ArrayList<>();
	Map<String, BreakdownDTO> bMap = new HashMap<>();
	
	public boolean save(ClientDTO clientDTO) {
//		return cList.add(clientDTO);
//		cMap.put(clientDTO.getAccount(), clientDTO);
//		if(cMap.get(clientDTO.getAccount()) == null) {
//			return false;
//		}
//		return true;
		
		//위의 코드을 아래와 같이 줄일 수 있음 {}가 없는 이유는 한줄로 입력이 가능하기 때문으로 두줄 이상의 경우에는 꼭 {}를 작성해야 함
		if(cMap.put(clientDTO.getAccount(), clientDTO) == null)
			return true;
		else
			return false;
	}
	
	public boolean overrapId(String id) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId())) {
				return true;
			}
		}
		return false;
	}
	
//	public boolean loginChenk(String id, String password) {
//		for(String key : cMap.keySet()) {
//			if(id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword())) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public Map<String, ClientDTO> findAll() {
		return cMap;
	}
	
	public ClientDTO findById(String id, String password) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword())) {
				return cMap.get(key);
			}
		}
		return null;
	}
	
	//list로 리턴하는 거래내역 메소드
//	public List<BreakdownDTO> breakList(String account) {
//		List<BreakdownDTO> bList = new ArrayList<>();
//		//검색 정렬
//		List<String> keySet = new ArrayList<>(bMap.keySet());
//		Collections.sort(keySet);
//		
//		for(String key : keySet) {
//			if(account.equals(bMap.get(key).getAccount())) {
//				bList.add(bMap.get(key));
//			}
//		}
//		return bList;
//	}
	
	//위의 주석과 동일한 기능의 Map으로 리턴하는 거래내역 메소드 
	public Map<String, BreakdownDTO> breakList(String account) {		
		Map<String, BreakdownDTO> map = new HashMap<>();
		for(String key : bMap.keySet()) {
			if(account.equals(bMap.get(key).getAccount())) {
				map.put(key, bMap.get(key));
			}
		}
		return map;
	}
	
	public String getAccount(String id, String password) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId())&& password.equals(cMap.get(key).getPassword())) {
				return cMap.get(key).getAccount();
			}
		}
		return null;
	}
	
//	public boolean deposit(String account, long money) {
//		for(String key : cMap.keySet()) {
//			if(account.equals(key)) {	
//				//account.equals(cMap.get(key).getAccount())로 작성해도 되지만 key가 account의 값을 가지고 있기 때문에 key로 작성해도 무관함
//				cMap.get(key).setBalance(cMap.get(key).getBalance() + money);
//				BreakdownDTO breakdownDTO = new BreakdownDTO();	//거래내역을 넣을 객체 생성
//				breakdownDTO.setAccount(account);
//				breakdownDTO.setDivision("입금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
//				bMap.put(breakdownDTO.getLine(), breakdownDTO);
//				return true;
//			}
//		}
//		return false;
//	}
	
//	public int withdraw(String account, long money) {
//		for(String key : cMap.keySet()) {
//			if(account.equals(key)) {
//				if(cMap.get(key).getBalance() >= money) {
//					cMap.get(key).setBalance(cMap.get(key).getBalance() - money);
//					BreakdownDTO breakdownDTO = new BreakdownDTO();
//					breakdownDTO.setAccount(account);
//					breakdownDTO.setDivision("출금");
//					breakdownDTO.setDealMoney(money);
//					breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
//					bMap.put(breakdownDTO.getLine(), breakdownDTO);
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//		}
//		return -1;
//	}
	
	public int deal (String account, long money, int menu) {
		for(String key : cMap.keySet()) {
			if(account.equals(key)) {
				if(cMap.get(key).getBalance() >= money && menu == 2) {
					cMap.get(key).setBalance(cMap.get(key).getBalance() - money);
				} else if(menu == 1) {
					cMap.get(key).setBalance(cMap.get(key).getBalance() + money);
				} else {
					return 0;
				}
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				if(menu == 1) {
					breakdownDTO.setDivision("입금");
				} else if(menu == 2) {
					breakdownDTO.setDivision("출금");
				}
				breakdownDTO.setAccount(account);
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
				bMap.put(breakdownDTO.getLine(), breakdownDTO);
				return 1;
			}
		}
		return -1;
	}
	
	public boolean transferChenk(String transferAccount) {
		for(String key : cMap.keySet()) {
			if(transferAccount.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean update(String id, String password, String updatePassword) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword())) {
				cMap.get(key).setPassword(updatePassword);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id, String password) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword())) {
				cMap.remove(key);
				return true;
			} 
		}
		return false;
	}
	
	public List<ClientDTO> selectId(String selectId) {
		List<ClientDTO> selectList = new ArrayList<>();
		//검색 정렬
		List<String> keySet = new ArrayList<>(cMap.keySet());
		Collections.sort(keySet);
		
		for(String key : keySet) {
			if(selectId.equals(cMap.get(key).getId())) {
				selectList.add(cMap.get(key));
			}
		}
		return selectList;
	}
	
	public List<ClientDTO> selectName(String selectName) {
		List<ClientDTO> selectList = new ArrayList<>();
		//client list 정렬
		List<String> keySet = new ArrayList<>(cMap.keySet());
		Collections.sort(keySet);
		
		for(String key : keySet) {
			if(selectName.equals(cMap.get(key).getName())) {
				selectList.add(cMap.get(key));
			}
		}
		return selectList;		
	}
}
