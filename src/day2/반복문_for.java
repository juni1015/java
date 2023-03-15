package day2;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10까지 출력
		for(int i = 1; i <= 10; i++) {	//for문 형식 : for(변수선언; 조건; 증감값;), i++는 i=i+1의 약자
			System.out.println(i);
		}
		
		//1~10까지 홀수 출력
		for(int i = 1; i <= 10; i=i+2) {	//for문 형식 : for(변수선언; 조건; 증감값;), i++는 i=i+1의 약자
			System.out.println(i);
		}
		
		//1~10까지 짝수 출력
		for(int i = 2; i <= 10; i=i+2) {	//for문 형식 : for(변수선언; 조건; 증감값;), i++는 i=i+1의 약자
			System.out.println(i);
		}

	}

}
