package day13;

public class 다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Dog();
//		
//		a.eat();
//		a.cry();
		
		
		Animal a = new Dog();
//		test(a);
		a.a = new Dog();
		
		//다형성 : 부모타입의 객체에 자식 생성자로 생성할 수 있는 것
		//특징 : Animal 객체이기 때문에 Animal 다 사용 가능하고 
		//		자식클래스는 오버라이딩 된 것만 사용 가능함
		
	}
	
	public static void test(Animal a) {
		a.cry();
	}

}

class Animal {
	Animal a = new Animal();
	public void eat() {
		System.out.println("먹다");
	}
	public void cry() {
		System.out.println("울다");
	}
}
class Dog extends Animal {
	public void cry() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	public void cry() {
		System.out.println("야옹");
	}
}
