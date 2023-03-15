package day7;

public class C_CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C_Calculator cal = new C_Calculator();	
		cal.num1 = 19;
		cal.num2 = 8;
		
		// 메소드를 이용하여 더하기 빼기 곱하기 나누기 값 출력 
		cal.sum();
		cal.sub(10, 5);
		System.out.println(cal.mul());
		System.out.println(cal.div(10, 3));
	}

}
