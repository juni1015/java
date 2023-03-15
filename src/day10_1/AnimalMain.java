package day10_1;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상화 : 
		//추상메소드 : 상속받은 객체가 무조건 재정의 해야하는 메소드
		Dog dog = new Dog();
		dog.name = "강아지";
		dog.cry = "멍멍";
		dog.move = "성큼성큼";
		dog.food = "뼈다귀";
		
		Cat cat = new Cat();
		cat.name = "고양이";
		cat.cry = "야옹";
		cat.move = "사뿐사뿐";
		cat.food = "생선";
		
		Bird bird = new Bird();
		bird.name = "새";
		bird.cry = "짹짹";
		bird.move = "펄럭펄럭";
		bird.food = "애벌레";
		
		dog.print();
		cat.print();
		bird.print();

	}

}
