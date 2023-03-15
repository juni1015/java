package day1;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a = 10;
		double b = a;	// 자동 형변환 ( 순서 : byte < short < int < long < float < double)
		
		double c = 10.3;
		int d = (int)c;	//강제 형변환

	}

}
