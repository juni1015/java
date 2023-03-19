package study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ClientDTO {
	private static int fNumber = 100;
	private static int number = 1000;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String id;
	private String pw;
	private String name;
	private int purpose;	//목적
	private String joinDate;
	private String acoount;
	
	public void ClientDTO() {
//		this.joinDate = DTF.date
	}
}
