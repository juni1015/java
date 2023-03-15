package day7;

public class People {
	private String name;
	private int age;
	
	//생성자 만들기 : 기본생성자 / 매개변수(String) 생성자 / 매개변수(String, int) 생성자
	public People() {
		System.out.println("기본 생성자");
	}
	public People(String name) {
		System.out.println("매개변수(String) 생성자");
		this.name = name;
	}
	public People(String name, int age) {
		System.out.println("매개변수(String, int) 생성자");
		this.name = name;	//이름이 같은 경우에는 this를 붙임 
		this.age = age;
	}
	
	//메소드 만들기 : name의 get, set메소드 / age의 get, set메소드 / print메소드 (형식 : name의 나이는 age세 입니다)
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
	
	public void print() {
		System.out.printf("%s의 나이는 %d세 입니다.\n", name, age);
//		System.out.println(name + "의 나이는 " + age + "세 입니다.");
	}
	
	public void ageUp() {
		this.age++;
	}
	public void ageUp2(int a) {
		this.age += a;
	}
	public void ageUp3() {
		this.age *= 2 ;
//		this.age += age;
	}
	public void ageUp4(String o, int num) {
		if(o.equals("+")) {
			this.age += num;
		} else if(o.equals("-")) {
			this.age -= num;
		} else if(o.equals("*")) {
			this.age *= num;
		} else if(o.equals("/")) {
			this.age /= num;
		}
	}
	
	

}
