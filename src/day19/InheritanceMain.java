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
		
//		ChildClass c2 = new ParentClass();	//부모가 더 크기 때문에 큰 것을 작을 걸로 넣으려고 하는 것이라 사용 불가
		ChildClass c3 = (ChildClass) new ParentClass();	//위의 코드처럼 사용하려면 강제형변환과 같이 강제로 변환해서 사용해야 함
		ParentClass p2 = new ChildClass();
		
	}

}
