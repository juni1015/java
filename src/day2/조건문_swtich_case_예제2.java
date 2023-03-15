package day2;

import java.util.Scanner;

public class 조건문_swtich_case_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	    // 문제 ) 숫자 2개를 입력받고 
		// 메뉴에서 하나를 선택하여 결과출력
		// 1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지
		// swtich문으로 작성할것 
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" ==== 계산기 ==== "); // 
		System.out.print(" 첫번째 숫자입력 "); 
        int num1 = sc.nextInt();
        System.out.print(" 두번째 숫자입력 ");
        int num2 = sc.nextInt();
        
        System.out.println("1. 더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
        System.out.print("메뉴선택 > ");
        int menu = sc.nextInt();
        
        switch(menu) {
        
	    case 1:
		System.out.println(num1+" + "+num2 +" = "+ (num1+num2));
		break; // 케이스마다 브레이크가 없으면 모든 케이스를 실행해버리니 기본형식은 브레이크가 있어야한다. 
	    case 2:
		System.out.println(num1+" - "+num2 +" = "+ (num1-num2));
		break;
	    case 3:
        System.out.println(num1+" * "+num2 +" = "+ (num1*num2));	 
		break;
	    case 4:
	    System.out.println(num1+" / "+num2 +" = "+ (num1/num2));	 
	    break;
	    case 5:
	    System.out.println(num1+" % "+num2 +" ="+ (num1%num2));	 
		break;
		default: // if문에서 else와 같이 나머지 결과값을 출력해주는 default
			System.out.println("1~5까지 입력해주세요");
			
        }
        

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
