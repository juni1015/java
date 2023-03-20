package day19_interface;

public class InterfaceMain {

	public static void main(String[] args) {
		//인터페이스 객체 생성
//		InterfaceEx if1 = new interfaceEx();	//인터페이스 자체로 객체를 만드는 것은 불가능
		
		//아래와 같은 방식으로는 잘 사용하지 않음 (인터페이스 쓸 이유가 없음)
		ImplClass1 ipc1 = new ImplClass1();	//사용은 가능하나 인터페이스를 활용하는 방법이 아님
		
		/**
		 * 좌변 : 인터페이스 타입의 객체로 선언
		 * 우변 : 구현클래스 생성자
		 */
		InterfaceEx if1 = new ImplClass1();	//﻿좌변은 인터페이스타입 우변은 해당 인터페이스를 구현한 클래스의 생성자로 객체를 생성함
		if1.hello();
		
		InterfaceEx if2 = new ImplClass2();
		if2.hello();
		
		//좌변은 동일한데 우변의 생성자(값)를 다르게 사용할 수 있는 것을 다형성이라고 함
		//하나의 파일을 다양한 생성자로 사용할 수 있음
		InterfaceEx if3 = new ImplClass1();
		if3.hello();
		if3 = new ImplClass2();
		if3.hello();
	}

}
