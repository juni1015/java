package day19_interface;

public class ImplClass1 implements InterfaceEx {
	//InterfaceEx 인터페이스를 구현하는 구현클래스
	//해당 인터페이스의 추상메소드를 구현해야 함 <안 그러면 에러 뜸

	@Override
	public void hello() {
		System.out.println("ImplClass1.hello()");
	}
	
	

}
