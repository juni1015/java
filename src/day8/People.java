package day8;

public class People {
	private String name;	//private : 같은 클래스 내에서만 접근 가능 (데이터를 보호하기 위해서 사용)
	private int age;
	
	//기본생성자
	public People() {	//public : 어디서나 접근 가능
		
	}
	//매개 변수를 다 받는 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void ageUp() {
		this.age++;
	}

}
