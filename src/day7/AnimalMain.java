package day7;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		
		a.test = "테스트입니다.";
		System.out.println(a.test);
		
		a.setName("강아지");
		System.out.println(a.getName() + "입니다.");
		
		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName() + " / " + dog.getSound() + " / " + dog.getLeg());
		dog.print();
		
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setLeg(4);
		System.out.println(cat.getName() + " / " + cat.getSound() + " / " + cat.getLeg());
		cat.print();
		
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("꼬끼오");
		chicken.setLeg(2);
		chicken.print();
		
		Animal elephant = new Animal();
		elephant.setName("코끼리");
		elephant.setSound("뿌우");
		elephant.setLeg(4);
		elephant.setAge(8);
		elephant.print();	
		
		elephant.ageUp();
		System.out.println("코끼리 나이 : " + elephant.getAge());

	}

}
