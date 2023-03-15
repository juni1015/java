package day1;

public class 타입_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 // 타입변환 : 데이터 타입을 다른 데이터 타입으로 변환하는 것 
 // 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될때 발생한다 
 // 예시로는 byte -> short 
		
		int a = 10; 
        double b = a; // 자동 형변환 
        double c = 10.0;
        int d = (int)c; // c가 d보다 값이 크기 때문에 (int)를 붙여줌으로써 강제 형변환을한다.   
		
		
		
	}

}
