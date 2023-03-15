package day2;

import java.util.Scanner;

public class 조건문_case_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// 문제 ) 변수 a에 숫자를 입력받고, 1~12월을 영어로 출력하는 프로그램을 작성해라 
	
        Scanner sc = new Scanner(System.in);
        System.out.print(" 월을 입력해 주세요 : " );
        int a = sc.nextInt();
        
		switch(a) {
		case 1:
			System.out.println("January");
			break; // 케이스마다 브레이크가 없으면 모든 케이스를 실행해버리니 기본형식은 브레이크가 있어야한다. 
		case 2:
			System.out.println("February");
			break;
		case 3:
	        System.out.println("March");	 
			break;
		case 4:
			System.out.println("April");
			break;  
		case 5:
			System.out.println("May");
			break;
		case 6:
	        System.out.println("June");	
		case 7:
			System.out.println("July");
			break; 
		case 8:
			System.out.println("August");
			break;
		case 9:
	        System.out.println("Ssptember");	 
			break;    
		case 10:
			System.out.println("October");
			break; //  
		case 11:
			System.out.println("November");
			break;
		case 12:
	        System.out.println("December");	 
			break;
			default: // if문에서 else와 같이 나머지 결과값을 출력해주는 default
				System.out.println("달이 아닙니다");
				
		}
	
	
	
	
	
	
	
	
	
	
	
	
}

}
