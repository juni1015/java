package study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDTO {
	private static int fNumber = 100;
	private static int number = 1000;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String account;
	private String id;
	private long balance;
	private int purpose;	//목적
	private String joinDate;
	
	public void AccountDTO() {
	}
	public void AccountDTO(String id) {
		if(number == 1010) {
			fNumber++;
			number = 1000;
		}
		this.account = fNumber + "-" + number++;
		this.joinDate = DTF.format(LocalDateTime.now());
	}
	public String getAccount() {
		return account;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
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

}
