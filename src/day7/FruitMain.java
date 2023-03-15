package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//apple이라는 객체 생성
		Fruit apple = new Fruit();	//Fruit() < 생성자 / 생성자는 객체를 만들 때 자동적으로 생성자가 실행함
		apple.setName("사과");
		apple.color = "빨강";
		apple.isSeed = true;
		System.out.println(apple.getName() + apple.color + apple.isSeed);
		
		Fruit apple1 = new Fruit("사과", "빨강", true);
		System.out.println(apple1.getName() + apple1.color + apple1.isSeed);

		//banana라는 객체 생성
		Fruit banana = new Fruit();
		banana.setName("바나나");
		banana.color = "노랑";
		banana.isSeed = false;
		
		//멜론 생성자를 통해 객체 생성
		Fruit melon = new Fruit("멜론", "연두");
		System.out.println(melon.getName() + melon.color);
		
		//오렌지 객체 생성
		Fruit orange = new Fruit();
		orange.setName("오렌지");
		orange.color = "주황";
		orange.isSeed = true;
		System.out.println(orange.getName() + orange.color + orange.isSeed);
		

	}

}
