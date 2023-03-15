package day7;

public class A_Car {

	// 클래스(class) : 현실에서 객체를 만들기위해서 설계도가 필요하듯
	// 자바에서도 설계도가 필요한데 그것이 클래스(class)이다.

	String name; // }
	String tire; // } 필드영역
	String color; // }
	int speed;

	public void run() { // }
		speed = speed + 1; // speed += 1 // } 메서드영역
	} // }

	public void speedRun() {
		speed = speed + 2;
	}

	// 메서드 print 만들기
	// 기능 : 자신이 가지고있는 name, tire, color, speed 를 출력해주는 메서드를 만들어라

	public void print() { //메소드는 접근제한자/리턴타입/메소드이름으로 구성된다 => public(접근제한자)/void(리턴타입)(리턴이없을시void)/메소드이름(pirnt)(매개변수) 
		System.out.println(name + " = " + tire + " = " + color + " = " + speed );
	}
	
	// 문제 
	// 접근제한자 : public 
	// 리턴타입 : 없음 
	// 매개변수 int s
	// 실행문구 : 1. 그랜져 speedRun메소드 호출됌 출력 
	//          2. 스피드를 s만큼 올리기 
	
	public void speedRun(int s){
		System.out.println(name+" speedRun 호출됌");
		speed = speed + s;
	}
	
	// 문제 
	// 접근제한자 : public 
	// 리턴타입 : ?
	// 메소드명 : getColor
	// 매개변수 : 없음
	// 실행문구 : 컬러를리턴 
	
	public String getColor(){
		return color;
	}
	
	
	
}
