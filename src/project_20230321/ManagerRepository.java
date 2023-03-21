package project_20230321;

import java.util.ArrayList;
import java.util.List;

public class ManagerRepository {
	private static ManagerRepository repository = new ManagerRepository();
	private ManagerRepository() {}
	public static ManagerRepository getInstence() {
		return repository;
	}

	List<UserDTO> uList = new ArrayList<>();
	
	public boolean managerPw(String pw) {
		if(pw.equals("1234")) {
			return true;
		}
		return false;
	}
	
	public boolean save(UserDTO userDTO) {
		if(uList.add(userDTO)) {
			return true;
		}
		return false;
	}

	public boolean loginCheck(String id, String pw, int memberOk) {
		for(UserDTO u : uList) {
			if(u.getId().equals(id) && u.getPw().equals(pw) && memberOk == 0) {
				return true;
			}
		}
		return false;
	}
	
	public UserDTO findById(String id, String pw) {
		for(UserDTO u : uList) {
			if(id.equals(u.getId()) && pw.equals(u.getPw())) {
				return u;
			}
		}
		return null;
	}
	
	public List<UserDTO> findAll() {
		return uList;
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

}
