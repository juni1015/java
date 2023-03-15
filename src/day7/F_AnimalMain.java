package day7;

public class F_AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F_Animal a = new F_Animal();

		a.test = "테스트 입니다";
		System.out.println(a.test);

		F_Animal dog = new F_Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setleg(4);
		System.out.println(dog.getName() + " / " + dog.getSound() + " / " + dog.getleg());

		F_Animal cat = new F_Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setleg(4);
		System.out.println(cat.getName() + " / " + cat.getSound() + " / " + cat.getleg());

		F_Animal chicken = new F_Animal();
		chicken.setName("닭");
		chicken.setSound("꼬끼오");
		chicken.setleg(2);
		chicken.print();
	

		F_Animal elephant = new F_Animal();
		elephant.setName("코끼리");
		elephant.setSound("뿌우");
		elephant.setleg(4);
		elephant.print();
		
		elephant.setAge(8);
		elephant.ageUp();
		elephant.print();
		System.out.println("코끼리나이: "+elephant.getAge());
		dog.ageUp();
		System.out.println("강아지나이: "+elephant.getAge());

	}

}
