package day1;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ban1 = 'A';
		String name1 = "홍길동";
		int kor1 = 100, eng1 = 49, mat1 = 89;
		double avg1 = (kor1+eng1+mat1)/(double)3;	
		//실수로 나누려면 강제형변환 (숫자 뒤에 . or f or 숫자 앞에 (double))
		
		System.out.println(ban1 + " : " + name1 + " : " + kor1 + " : " + eng1 + " : " + mat1 + " : " + avg1);

	}

}
