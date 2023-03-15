package day5;

public class C_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 배열이란? 
		
	String name1 = "홍길동";  // name1 이라는 변수에는 문자열이 하나만 들어간다. 
	String name2 = "이순신";
	String name3 = "심청이";
	System.out.println(name1);
	System.out.println(name2);
	System.out.println(name3);
		
	String[] name = new String[10]; // 문자열이 들어갈 수 있는 배열 10칸, 배열의 각각의 방의 주소를 인덱스라고한다 인데스는 0번부터 시작한다. 
	name[0] = "배열_홍길동";
	name[1] = "배열_이순신";
	name[2] = "배열_심청이";
	
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	
	int[] i = new int[10]; // 정수들이 들어갈 수 있는 배열 10칸 
	// int[] i = {34, 11, 35, 32, 32, 66, 64, 54, 24, 74}; // 배열 선언과 동시에 값을 지정해주는 방법이있다. 
	i[0] = 34;
	i[1] = 11;
	i[2] = 35;
	i[3] = 32;
	i[4] = 32;
	i[5] = 66;
	i[6] = 64;
	i[7] = 54;
	i[8] = 24;
	i[9] = 74;
	
	for(int j=0; j<i.length; j++) { // i.length = i의 길이 
		System.out.println(i[j]);
	}
		
	}

}
