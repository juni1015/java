package day11;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	//Service는 Repository를 호출함
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		boolean success = br.save(boardDTO);
		if(success) {
			System.out.println("게시글 등록완료");
		} else {
			System.out.println("게시글 등록실패");
		}
	}
	
	public void findAll() {
		List<BoardDTO> list = br.findAll();
		System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("---------------------------------------");
		for(BoardDTO b : list) {
			b.print();
		}
	}
	
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		BoardDTO boardDTO = br.findById(bno);
		if(boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다.");
		} else {
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("---------------------------------------");
			boardDTO.increaseCnt();
			boardDTO.print();
		}
	}
	
	//아래의 경우 객체를 새로 생성하기 때문에 수정 후 게시글등록시 번호가 잘못됨(100 수정 후 게시글 등록시 101이 아닌 102가 등록됨)
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next(); sc.nextLine();
		BoardDTO b = br.findById(bno);	
		//수정할 때 글번호를 체크해야하는 이유 : 수정할 제목, 작성자를 다 받고나서 업데이트를 해야 글 번호가 있는지 없는지 확인되기 때문
		if(b == null) {
			System.out.println("조회할 수 없는 글번호입니다.");
		} else {
			BoardDTO boardDTO = new BoardDTO();	//Bno뜨지 않게 하려면 bno를 자동으로 작성하는 생성자말고 bno자동으로 작성되지 않은 생성자 추가해서 그 생성자 사용해야 함
			System.out.print("수정할 제목> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if(br.update(boardDTO, bno)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}
	
	public void updateNew() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next(); sc.nextLine();
		BoardDTO b = br.findById(bno);	
		//수정할 때 글번호를 체크해야하는 이유 : 수정할 제목, 작성자를 다 받고나서 업데이트를 해야 글 번호가 있는지 없는지 확인되기 때문
		if(b == null) {
			System.out.println("조회할 수 없는 글번호입니다.");
		} else {
//			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목> ");
			String updateTitle = sc.nextLine();
			System.out.print("수정할 작성자> ");
			String updateWriter = sc.nextLine();
			sc.nextLine();
			if(br.updateNew(bno, updateTitle, updateWriter)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}
	
	public void delete() {
		System.out.print("삭제할 글번호> ");
		String bno = sc.next(); sc.nextLine();
//		BoardDTO b = br.findById(bno);	//업데이트와 달리 글번호를 제외하고 작성하는 값이 없기 때문에 삭제되지 않으면 실패문구로 띄워줘도 됨 
//		if(b == null) {
//			System.out.println("조회할 수 없는 글번호입니다.");
//		} else {
			if(br.delete(bno)) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
//		}
	}
}
