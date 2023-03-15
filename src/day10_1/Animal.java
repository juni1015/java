package day10_1;

public abstract class Animal {
	//클래스에 abstract를 붙이면 추상클래스임 / 추상메소드가 하나 이상 있을 때 붙여줘야함
	String name;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	//어떻게 우는지
	public abstract String cry();
	//어떻게 움직이는지
	public abstract String move();
	//무엇을 먹는지
	public abstract String food();
	
	//프린트
	public abstract void print(); 
	
	
//	public abstract void cry();
	//메소드는 abstract를 붙이면 추상메소드임
	//실행구문이 없음 / 실행구문은 자식클래스에서 오버라이딩해야함
}
