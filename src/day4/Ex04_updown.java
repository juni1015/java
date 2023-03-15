package day4;

import java.util.Scanner;

public class Ex04_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*31)+1;	//1~31까지 랜덤한 숫자를 줌
		System.out.println(answer);
		
		int ok = 0;
		
		//숫자를 계속 입력받으면서 정답을 맞추는 게임
		//updown게임 정답이 입력받은 숫자보다 크면 up 출력 작으면 down 출력
		//정답을 맞추면 정답! 출력 후 반복문 빠져나오기
		
		boolean run = true;
		
		while(run) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			ok += 1;
			
			
//			if(ok >= 10) {		//j
//				if(num == answer) {
//					System.out.println("정답!");
//					break;
//				} else {
//					run = false;
//				} 
//			} else {
//				if(num == answer) {
//					System.out.println("정답!");
//					break;
//				} else if(num > answer) {
//					System.out.println("down");
//				} else {
//					System.out.println("up");
//				} 
//			}
			
			
			if(num == answer) {
				System.out.println("정답!");
				break;
			} else if(ok >= 10) {
				run = false;
			} else if(num > answer) {
				System.out.println("down");
			} else {
				System.out.println("up");
			} 
			
		}
		
		
		
		if(run == false) {
			System.out.println("10번 틀려서 game over");
		} else {
			System.out.println(ok + "번만에 정답");
			
			if(ok == 1) {
				System.out.println("perfect");
			} else if(ok <= 3) {
				System.out.println("great");
			} else if(ok <= 5) {
				System.out.println("good");
			} else {
				System.out.println("normal");
			}
		}	
		

	}

}
