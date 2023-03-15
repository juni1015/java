package day13;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외 처리
//		System.out.println(9/0);	//9를 0으로 나눌 수 없어 오류
		
		
		
		try {
			//예외가 발생할 가능성이 있는 문구 작성
			System.out.println(9/0);
			int[] array = new int[5];
			System.out.println(array[5]);	//인덱스가 4까지만 있어서 오류
		} catch(ArithmeticException a) {
			//예외가 잡혔을 때 뭘 해야하는지 작성
			//예외 발생시 catch를 순차적으로 내려가서 맞는 예외에서 출력
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("인덱스 초과");
		} catch(Exception e) {
			System.out.println("예외발생");
		} finally {
			//작성하게 될 경우 try구문 마지막에 작성해야 함
			//예외가 발생해도 발생하지 않아도 걍 무조건 실행됨
			System.out.println("무조건 실행");
		}
		System.out.println("끝");

	}
	
	//일반예외(Exception)
	//: 컴파일 오류 발생
	//실행예외(RuntimeException)

}
