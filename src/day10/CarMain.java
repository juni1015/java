package day10;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar scar = new SportCar()
;
		scar.run();
		System.out.println(scar.speed);
	}

}

class Car {
	String color;
	String tire;
	int speed;
	
	public void run() {
		System.out.println("Car run메소드");
		this.speed++;
	}
}

class SportCar extends Car {
	String engine;
	
	//오버라이딩 : 부모의 메소드를 재정의하는 것
	public void run() {	//오버라이딩할 경우 선언부인 이 부분이 부모 메소드와 동일해야 함
		System.out.println("SportCar run메소드");
		this.speed += 2;
	}
}