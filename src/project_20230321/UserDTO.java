package project_20230321;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String id;
	private String pw;
	private String name;
	private String phoneNumber;
	private String address;
	private long balance;
	private int managerOk;	//관리자 여부
	private String joinDate;
	
	public void MemberDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getManagerOk() {
		return managerOk;
	}
	public void setManagerOk(int managerOk) {
		this.managerOk = managerOk;
	}
	
	@Override
	public String toString() {
		String str = id + "\t" + pw + "\t" + name + "\t" + phoneNumber + "\t" + address + "\t" + balance + "\t" + joinDate;
		
		return str;
	}
	
}
