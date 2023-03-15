package day7;

public class Car {
	//현실에서 객체를 만들기 위해서 설계도가 필요하듯 자바에서도 설계도가 필요한데 그것이 클래스
	//필드
	String name;
	String tire;
	String color;
	int speed;
	
	//메소드
//	public void run() {
//		speed = speed + 1;
//	}
//	public void speedRun() {
//		speed = speed + 2;
//	}
	
	//print메소드 만들기 / 본인이 가지고 있는 name, tire, color, speed를 각각 출력해주는 메소드
	public void print() {
		System.out.println(name + " = " + tire + " = " + color + " = " + speed);
	}
	
	//접근제한자 public / 리턴타입 없음 / 메소드명 speedRun / 매개변수 int s 
	//실행문구 1. '그랜저 speedRun메소드 호출됨' 출력
	//		 2. 스피드를 s만큼 올리기
	public void speedRun(int s) {
		System.out.println(name + " speedRun메소드 호출됨");
		speed += s;
	}
	
	//접근제한자 public / 리턴타입 ? / 메소드명 getColor / 매개변수 없음
	//실행문구 컬러를 리턴
	public String getColor() {
		return color;
	}
	
}
