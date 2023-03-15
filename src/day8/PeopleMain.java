package day8;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People();
		
//		p1.name = "홍길동"	//name 필드가 private으로 생성되었기 때문에 에러 발생
		p1.setName("홍길동");
//		System.out.println(p1.name);
		System.out.println(p1.getName());
		
		People p2 = new People("이순신", 90);

	}

}
