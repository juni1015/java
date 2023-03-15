package day1;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;
		
//		if(age >= 19) {
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("성인이 아닙니다.");
//		}

		if(age >= 19) {
			System.out.println("성인입니다.");
		} else if(age >= 13 ) {
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("어린이 입니다.");
		}
	}

}
