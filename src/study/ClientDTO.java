package study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ClientDTO {
	/*
	 * toString에 대해 제대로 알지 못하여 사용하는데 문제 있음
	 */
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String id;
	private String pw;
	private String name;
	private int purpose;	//목적
	private String joinDate;
	private String acoount;
	
	public void ClientDTO() {
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
	public int getPurpose() {
		return purpose;
	}
	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}
	public String getJoinDate() {
		return joinDate;
	}
	
//	@Override
//	public String toString() {
//		String str = 
//		return super.toString();
//	}
}
