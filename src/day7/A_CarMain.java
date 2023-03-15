package day7;

public class A_CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Car c1 = new A_Car();
		A_Car c2 = new A_Car();

		c1.name = "그렌져";
		c1.tire = "한국";
		c1.color = "빨강";
		c1.speed = 10;

		System.out.println(c1.name + " / " + c1.tire + " / " + c1.color + " / " + c1.speed);

		// 제네시스, 넥센타이어, 검정, 20;

		c2.name = "제네시스";
		c2.tire = "넥센타이어";
		c2.color = "검정";
		c2.speed = 20;

		System.out.println(c2.name + " / " + c2.tire + " / " + c2.color + " / " + c2.speed);
		
		c1.run(); // 메서드의 사용방법 
		c2.speedRun();
		System.out.println(c1.name + " / " + c1.tire + " / " + c1.color + " / " + c1.speed); 
		System.out.println(c2.name + " / " + c2.tire + " / " + c2.color + " / " + c2.speed);
		
		
		
		c1.print();
		c2.print();
		
		c1.speedRun(100);
		c2.speedRun(100);
		
		// 출력예 
		// c1=> 빨강
		// c2=> 검정
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		
		

	}

}
