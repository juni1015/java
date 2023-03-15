package day10;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person("홍길동", 99);
		Student s = new Student("홍길동", 99, false, "S100");
		//상속된 부모가 있을 경우 자식 객체 생성시 부모 객체가 같이 생성됨

	}
}

class Person {
	String name;
	int age;
	boolean isFull;
	
	public Person() {
		System.out.println("Person기본생성자");
	}
	public Person(String name) {
		this.name = name;
		System.out.println("Person생성자1");
	}
	public Person(String name, int age) {
//		this.name = name;
		this(name);		//= 2번째 생성자를 사용한 거임
		this.age = age;
		System.out.println("Person생성자2");
	}
	public Person(String name, int age, boolean isFull) {
//		this.name = name;
//		this.age = age;
		this(name, age);	//= 3번째 생성자를 사용한 것임
		this.isFull = isFull;
		System.out.println("Person생성자3");
	}
}

class Student extends Person {	//상속을 받았으면 부모의 객체도 같이 생성됨
	String sno;
	
	public Student() {
//		super();	//기본 생성자가 숨겨져 있음 / 무조건 첫줄에 있어야 함
		System.out.println("Student기본생성자");
	}
	public Student(String name, int age) {
		System.out.println("Student생성자1");		
	}
	public Student(String name, int age, boolean isFull, String sno) {
//		super();	//아래 생성자가 없을 경우 기본 생성자가 숨겨져 있음
//		super(name, age, isFull);	//super = 자기의 부모를 표현함 / 부모의 4번째 생성자가 실행됨 
		super(name, age, isFull);
		this.sno = sno;				//this = 자기를 표현함
		System.out.println("Student생성자2");
	}
}