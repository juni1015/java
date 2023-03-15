package day10;

public class FruitMain {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.name = "사과";
		f.isSeed = true;
		
		f.removeSeed();
		
		System.out.println(f.name + " / " + f.isSeed);
		
		Fruit2 f2 = new Fruit2();
		f2.color = "빨강";
		f2.name = "사과";
		f2.isSeed = true;
		f2.removeSeed();
		System.out.println(f2.name + " / " + f2.isSeed + " / " + f2.color);
	}
}

class Fruit {	//class의 접근제한자는 퍼블릭과 디폴트(안 쓰면 됨)만 가능 
	String name;
	boolean isSeed;
	
	public void removeSeed() {
		isSeed = false;
	}
}

//기능이 유사한 새로운 클래스를 만들 때 명령구문을 복사 붙여넣기 하는 것이 아니라
class Fruit2 extends Fruit{	//extends Fruit : Fruit라는 클래스를 상속받겠다
//	String name;			//상속받은 클래스와 겹치는 부분은 작성하지 않아도 사용할 수 있음
//	boolean isSeed;
	String color;
	
//	public void removeSeed() {
//		isSeed = false;
//	}
	public void colorChange(String color) {
		this.color = color;
	}
}
	
