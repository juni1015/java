package day2;

public class 반복문_for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////1~10까지 가로로 출력/////
		/*for(int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");	//이스케이프 문자 중 \t는 탭, \n은 줄바꿈
		}
		System.out.println("\n안\t녕");*/
		
		
		/////1~100까지의 합을 출력/////
		/*int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		
		
		/////1~100까지의 짝수의 합을 출력/////
		/*int sum = 0;
		for(int i = 2; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		
		
		/////구구단 6단 출력/////
		int dan = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		

	}

}
