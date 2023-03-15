package day5;

public class I_배열예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 정수형 배열에 정수 100개 할당하고, 출력하는 코드를 작성해라  

		int num[] = new int[100];
		for(int i=0; i<num.length; i++) {
			 num[i] = i+1;		
		
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
