package day19;

public class ChildClass extends ParentClass {
	// 생성자
	public ChildClass() {
		System.out.println("자식 기본 생성자");
	}

	//hello 재정의
	@Override	//를 작성해주면 선언부가 부모클래스의 선언부와 다를 때 에러와 함께 확인시켜줌
	public void hello() {
		System.out.println("자식 hello");
	}
	
//	@Override	//부모클래스에서 해당 메소드가 private으로 되었기 때문에 재정의 불가하여 에러
//	public void hi() {	
//		System.out.println("자식 hi");
//	}
}
