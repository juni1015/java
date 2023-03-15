package day7;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생성자 출력
		People people1 = new People();
		people1.setName("사람1");
		people1.setAge(25);
		
		//매개변수(String) 생성자 출력
		People people2 = new People("사람2");
		people2.setAge(23);
		
		//매개변수(String, int) 생성자 출력
		People people3 = new People("사람3", 20);
		
		//사람1과 사람2의 나이 +1
		people1.ageUp();
		people2.ageUp();
		
		//사람1과 사람3의 나이 +매개변수 값
		people1.ageUp2(5);
		people3.ageUp2(5);
		
		//사람2의 나이 2배
		people2.ageUp3();
		
		//사람1의 나이 -50
		people1.ageUp4("-", 50);
		
		//사람3의 나이 3배
		people3.ageUp4("*", 3);
		
		//사람1, 사람2, 사람3의 나이 출력
		people1.print();
		people2.print();
		people3.print();
		

	}

}
