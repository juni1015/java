package project_20230321;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
	private static MemberRepository repository = new MemberRepository();
	private MemberRepository() {}
	public static MemberRepository getInstence() {
		return repository;
	}
	
	List<UserDTO> uList = new ArrayList<>();
	
	public boolean save(UserDTO userDTO) {
		if(uList.add(userDTO)) {
			return true;
		}
		return false;
	}
	
	public boolean loginCheck(String id, String pw, int memberOk) {
		for(UserDTO u : uList) {
			if(u.getId().equals(id) && u.getPw().equals(pw) && memberOk == 1) {
				return true;
			}
		}
		return false;
	}
	
	public List<UserDTO> findAll() {
		return uList;
	}
	
	public UserDTO findById(String id, String pw) {
		for(UserDTO u : uList) {
			if(id.equals(u.getId()) && pw.equals(u.getPw())) {
				return u;
			}
		}
		return null;
	}
	
	public boolean update(String loginId, String loginPw, String pw, String name, String phoneNumber, String address) {
		for(UserDTO u : uList) {
			if(loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
				u.setPw(pw);
				u.setName(name);
				u.setPhoneNumber(phoneNumber);
				u.setAddress(address);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String loginId, String loginPw) {
		for(UserDTO u : uList) {
			if(loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
				uList.remove(u);
				return true;
			}
		}
		return false;
	}
	
	public long balanceUp(String loginId, String loginPw, long money) {
		for(UserDTO u : uList) {
			if(loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
				u.setBalance(u.getBalance() + money);
				return u.getBalance();
			}
		}
		return 0;
	}
	
	public void balanceReduction(String id, String pw, long amount) {
		for(UserDTO u : uList) {
			if(id.equals(u.getId()) && pw.equals(u.getPw())) {
				u.setBalance(u.getBalance() - amount);
			}
		}
	}

}
