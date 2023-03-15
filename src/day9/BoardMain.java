package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Board b1 = new Board();
//		Board b2 = new Board();
//		b1.setBno(9);
//		System.out.println(b2.getBno());
//		
//		b1.number = 5;
//		System.out.println(b2.number);
		
//		Board b1 = new Board();
//		System.out.println(b1.getBno());
//		
//		Board b3 = new Board();
//		System.out.println(b3.getBno());
//		
//		Board b2 = new Board();
//		System.out.println(b2.getBno());
		
		Scanner sc = new Scanner(System.in);
		List<Board> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=====게시판=====");
			System.out.println("1.게시글등록 2.리스트 3.읽기 4.수정 5.삭제 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt(); sc.nextLine();
			
			if(menu == 1) {
				System.out.print("제목> ");
				String title = sc.nextLine();
				System.out.print("작성자> ");
				String writer = sc.next();
				System.out.print("비밀번호> ");
				String pw = sc.next();
				Board board = new Board(pw, title, writer);
				list.add(board);
				System.out.println(title + "이(가) 등록되었습니다.");
			} else if(menu == 2) {
				System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
				System.out.println("------------------------------------------------");
				for(Board b : list) {
					b.print();
				}
			} else if(menu == 3) {
				System.out.print("읽을 글번호> ");
				int bno = sc.nextInt();
				System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
				System.out.println("------------------------------------------------");
				boolean find = false;
				for(Board b : list) {
					if(bno == b.getBno()) {
						b.increaseCnt();
						b.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 글번호입니다.");
				}
			} else if(menu == 4) {
				System.out.print("수정할 글번호> ");
				int updateBno = sc.nextInt();sc.nextLine();
				System.out.print("수정할 글 패스워드> ");
				String updatePw = sc.next();sc.nextLine();
				boolean find = false;
				for(Board b : list) {
					if(updateBno == b.getBno()) {
						if(updatePw.equals(b.getPw())) {
							System.out.print("수정할 제목> ");
							String updateTitle = sc.nextLine();
							System.out.print("수정할 작성자> ");
							String updateWriter = sc.nextLine();
							b.setTitle(updateTitle);
							b.setWriter(updateWriter);
							System.out.println("수정 성공");
							break;
						} else {
							System.out.println("패스워드가 틀렸습니다.");
							find = true;
						}
					}
				}
				if(!find) {
					System.out.println("수정할 수 없는 글번호입니다.");
				}
			} else if(menu == 5) {
				System.out.print("삭제할 글번호> ");
				int deleteBno = sc.nextInt();
				System.out.print("삭제할 글 패스워드> ");
				String deletePw = sc.next();
				boolean find = false;
				for(Board b : list) {
					if(deleteBno == b.getBno() && deletePw.equals(b.getPw())) {
						System.out.println(b.getTitle() + "이(가) 삭제성공");
						list.remove(b);
						find = true;
						break;
					} else {
						System.out.println("패스워드가 틀렸습니다.");
						find = true;
					}
				}
				if(!find) {
					System.out.println("삭제할 수 없는 글번호입니다.");
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
