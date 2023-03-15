package day10_1;

public class SalartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상메소드 사용하는 이유
		//클래스 중에서 공통으로 사용하는 것은 공통된 한 곳에 모아서 사용할 수 있게 하기 위해
		정규직 a = new 정규직();
		a.salary = 2000000;
		a.tax();
		
		계약직 b = new 계약직();
		b.salary = 1500000;
		b.tax();
	}
}
