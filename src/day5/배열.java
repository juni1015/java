package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "이순신";
		String name3 = "심청이";
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		//배열 = 하나의 변수에 여러개의 값을 넣을 수 있음
		//배열의 각각의 방의 번호를 인덱스라고 함 / 인덱스는 0부터 시작
		String[] name = new String[3];	//문자열이 들어갈 수 있는 배열 3칸 만들기
		int[] i = new int[10];	//정수가 들어갈 수 있는 배열 10 칸 만들기
		// int i[] = new int[10];
		//int [] i = {34, 91, 34, 35, 34, 78, 34, 786, 34, 785};	//배열을 만들 때 동시에 초기화하는 방법 (배열 만들 때만 가능한 방법)
		
		name[0] = "배열홍길동";
		name[1] = "배열이순신";
		name[2] = "배열심청이";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		i[0] = 34;
		i[1] = 91;
		i[2] = 34;
		i[3] = 35;
		i[4] = 34;
		i[5] = 78;
		i[6] = 34;
		i[7] = 786;
		i[8] = 34;
		i[9] = 785;
		
		//배열을 사용하는 이유 첫번째 for문 사용하여 입출력이 용이함
		//그래서 for문의 시작하는 값이 보통 0부터 시작하는 듯
		for(int j = 0; j < i.length; j++) {	//length 길이
			System.out.println(i[j]);
		}
	}

}
