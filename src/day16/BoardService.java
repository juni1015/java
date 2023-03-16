package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardService {
	//Service는 Repository를 호출함
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 메소드 작성 및 분석 시 작성후 확인
	 * 리턴타입 :
	 * 메소드이름 :
	 * 매개변수 :
	 */
	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		String bno = boardDTO.getBno();
		boolean success = br.save(bno, boardDTO);
		if(success) {
			System.out.println("게시글 등록완료");
		} else {
			System.out.println("게시글 등록실패");
		}
	}
	
	public void findAll() {
		Map<String, BoardDTO> mapFind = br.findAll();
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("-------------------------------------------------");
		
		//키값으로 오름차순 정렬
		//map의 값을 list 객체를 정의하여 정렬해야 함 
		List<String> keySet = new ArrayList<>(mapFind.keySet());	//keySet이라는 이름을 가진 list를 생성하여 map객체의 key로만 이루어진 값들을 넣어줌
		Collections.sort(keySet);	//collections <자바 Util의 클래스임 / collections 가지고있는 sort라는 메소드를 사용하는 것임 / keySet이라는 list를 정렬해줌
		
		for(String bno : keySet) {	//bno라는 반복변수에 keySet리스트의 값을 하나씩 넣어주며 반복함
			mapFind.get(bno).print();	//map에 들어있는 해당bno의 DTO객체를 출력함
		}
	}
	
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		sc.nextLine();
		Map<String, BoardDTO> mapFind = br.findById(bno);
		// if(mapFind.get(bno) == null) 로 if문을 돌릴 경우에는 
		// mapFind가 null일 경우 mapFind 자체에 값이 없기 때문에 그 안의 bno를 찾을 수 없어서 에러 발생함
		if(mapFind == null) {
			System.out.println("찾을 수 없는 글입니다.");
		} else {
			System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
			System.out.println("-------------------------------------------------");
			mapFind.get(bno).increaseCnt();
			mapFind.get(bno).print();
		}
	}
	
	//day11 Service의 update메소드와 같이 수정후 게시글 등록시 bno가 건너뛰어지는 문제 발생하여 updateNew메소드처럼 만들어야함
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next(); sc.nextLine();
		Map<String, BoardDTO> mapFind = br.findById(bno);
		//수정할 때 글번호를 체크해야하는 이유 : 수정할 제목, 작성자를 다 받고나서 업데이트를 해야 글 번호가 있는지 없는지 확인되기 때문
		if(mapFind == null) {
			System.out.println("조회할 수 없는 글번호입니다.");
		} else {
			BoardDTO boardDTO = new BoardDTO();
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
		Map<String, BoardDTO> mapFind = br.findById(bno);
		//수정할 때 글번호를 체크해야하는 이유 : 수정할 제목, 작성자를 다 받고나서 업데이트를 해야 글 번호가 있는지 없는지 확인되기 때문
		if(mapFind == null) {
			System.out.println("조회할 수 없는 글번호입니다.");
		} else {
//			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목> ");
//			boardDTO.setTitle(sc.nextLine());
			String updateTitle = sc.nextLine();
			System.out.print("수정할 작성자> ");
//			boardDTO.setWriter(sc.next());
			String updateWriter = sc.next();
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
		if(br.delete(bno)) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
	public void findWriter() {
		System.out.print("검색할 작성자> ");
		String writer = sc.next();
		sc.nextLine();
		
		List<BoardDTO> writerFind = br.findWriter(writer);
		
		if(writerFind.size() == 0) {
			System.out.println("조회할 수 없는 작성자입니다.");
		} else {
			System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
			System.out.println("-------------------------------------------------");
			for(BoardDTO b : writerFind) {
				b.print();
			}
		}
	}
	
	public void testInset() {
		boolean success = false;
		for(int i = 1; i < 6; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("writer" + i);
			String bno = boardDTO.getBno();
			
			success = br.save(bno, boardDTO);
		}
		if(success) {
			System.out.println("테스트 등록완료");
		} else {
			System.out.println("테스트 등록실패");
		}
	}
}
