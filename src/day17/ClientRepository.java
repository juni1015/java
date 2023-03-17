package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
		cMap.put(clientDTO.getAccount(), clientDTO);
		if(cMap.get(clientDTO.getAccount()) == null) {
			return false;
		}
		return true;
	}
	
	public boolean loginChenk(String id, String password) {
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword())) {
				return true;
			}
		}
		return false;
	}
	
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
	
	public boolean deposit(String account, long money) {
		for(String key : cMap.keySet()) {
			if(account.equals(key)) {	
				//account.equals(cMap.get(key).getAccount())로 작성해도 되지만 key가 account의 값을 가지고 있기 때문에 key로 작성해도 무관함
				cMap.get(key).setBalance(cMap.get(key).getBalance() + money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();	//거래내역을 넣을 객체 생성
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
				bMap.put(breakdownDTO.getLine(), breakdownDTO);
				return true;
			}
		}
		return false;
	}
	
	public boolean transferChenk(String transferAccount) {
		for(String key : cMap.keySet()) {
			if(transferAccount.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public int withdraw(String account, long money) {
		for(String key : cMap.keySet()) {
			if(account.equals(key)) {
				if(cMap.get(key).getBalance() >= money) {
					cMap.get(key).setBalance(cMap.get(key).getBalance() - money);
					BreakdownDTO breakdownDTO = new BreakdownDTO();
					breakdownDTO.setAccount(account);
					breakdownDTO.setDivision("출금");
					breakdownDTO.setDealMoney(money);
					breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
					bMap.put(breakdownDTO.getLine(), breakdownDTO);
					return 1;
				} else {
					return 0;
				}
			}
		}
		return -1;
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
	
	public List<ClientDTO> select(String selectId) {
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
}
