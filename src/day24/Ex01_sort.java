package day24;

public class Ex01_sort {

	public static void main(String[] args) {
		int[] num = {3, 2, 1, 5, 4};
		
		//배열 내림차순
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int tmp = 0;
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		//배열 오름차순
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < 5; j++) {
				if(num[i] < num[j]) {
					int tmp = 0;
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(num[i]);
		}
	}
	
	
}

