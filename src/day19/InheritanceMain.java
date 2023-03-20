package day19;

public class InheritanceMain {

	public static void main(String[] args) {
		//부모 객체
		ParentClass p1 = new ParentClass();
		p1.name = "name1";
		System.out.println(p1.name);
		p1.hello();
		
		//자식 객체
		ChildClass c1 = new ChildClass();	
		//상속해준 부모클래스의 생성자도 같이 호출 / 부모와 자식 생성자가 같이 호출
		c1.name = "자식 name1";
		System.out.println(c1.name);
		c1.hello();
		
	}

}
