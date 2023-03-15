package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////break/////
		/*for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;	//break;를 만나면 for문과 while문에서 빠져나옴
			}
		}
		System.out.println("끝");*/
		
		
		/////continue/////
		/*for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;	//continue;를 만나면 아래에 있는 문구를 실행하지 않고 다시 위에 있는 for문의 증감값으로 넘어감
			}
			System.out.println(i);
		}*/
		
		
		/////2단부터 9단까지 구구단 ver.1 /////
		/*int dan = 2;
		for(int j = 1; j < 9; j++) {
			System.out.println(dan + "단");
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
			dan = dan + 1;
		}*/
		
		/////2단부터 9단까지 구구단 ver.2 (더 깔끔)/////
		/*for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}*/

		/////2단부터 9단까지 구구단 5단까지만 출력/////
		/*for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			if(dan == 5) {
				break;
			}
		}*/

		/////4단부터 7단까지만 출력/////
		for(int dan = 2; dan <= 9; dan++) {
			
			if(dan < 4) {
				continue;
			} else if(dan > 7) {
				break;
			}
			
			System.out.println(dan + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
		

		/////2단부터 9단까지 구구단 단별 가로버전 ver.1/////		
		/*for(int name = 2; name <= 9; name++) {
			System.out.print(name + "단\t\t");
		}
		System.out.println("\n");
		for(int i = 1; i < 10; i++) {	//i : 곱하는 값
			for(int j = 2; j <= 9; j++) {	//j : 단
				System.out.printf("%d * %d = %d\t", j, i, (j * i));
			}
			System.out.println();
		}*/
		
		/////2단부터 9단까지 구구단 단별 가로버전 ver.2 (더 깔끔)/////				
		/*for(int i = 0; i < 10; i++) {	//i : 곱하는 값
			for(int j = 2; j <= 9; j++) {	//j : 단
				if(i == 0) {
					System.out.print(j + "단\t\t");
				} else {
					System.out.printf("%d * %d = %d\t", j, i, (j * i));
				}
			}
			System.out.println();
		}*/
		

	}

}
