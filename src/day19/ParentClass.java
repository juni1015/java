package day19;

public class ParentClass {
	//필드
	public String name;
	
	//생성자
	public ParentClass() {
		System.out.println("부모 기본 생성자");
	}
	
	//메소드
	public void hello() {
		System.out.println("부모 hello");
	}
	
	private void hi() {	//private은 상속받는 자식클래스에서 사용이 불가함
		System.out.println("부모 hi");
	}
}
