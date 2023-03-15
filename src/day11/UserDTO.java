package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	//기본적으로 Object라는 클래스를 상속받고 그 부분은 숨겨져 있음 / extends Object
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static String domain = "naver.com";
	
	private String email;
	private String password;
	private String name;
	private int age;
	private String joinDate;
	
	public UserDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
	}
	public UserDTO(String email, String password, String name, int age) {
		this();	//기본생성자 실행
//		this.joinDate = DTF.format(LocalDateTime.now());
		this.email = email + "@" + domain;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public static String getDomain() {
		return domain;
	}
	public static void setDomain(String domain) {
		//메소드 앞에 static을 붙이면 공유하는 메소드
		//클래스에 붙어서 공유 메소드로 사용됨 
		//공용으로 사용하기 때문에 this를 사용할 수 없음
		UserDTO.domain = domain;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJoinDate() {
		return joinDate;
	}
	
	@Override
	public String toString() {
		//toString은 Object클래스 오버라이딩임 
		return email + "\t" + password + "\t" + name + "\t" + age + "\t" + joinDate;
	}

}
