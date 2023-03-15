package day10_2;

public class Person {
	private static int number = 10000;
	
	private String id;	//주민번호 생년월일-성별(남1여2)number
	private String name;
	private char gender;
	private String birthday;
	
	public String getId() {
		return id;
	}
	public void setId() {
		if(!(gender == 0 || birthday == null)) {
			int firstNo = (gender == 'M')? 1 : 2;	
			//삼항연산자 사용방법 : int a = (조건식)? 참일 때 값 : 거짓일 때 값
//			if(gender == 'm') {
//				int a = 1;
//			} else {
//				int a = 2;
//			}
			int random = (int)(Math.random()*9)+1;
			this.id = birthday + "-" + firstNo + number++ + random;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
