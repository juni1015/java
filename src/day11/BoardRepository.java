package day11;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
	//Repository 데이터저장 역할
	private List<BoardDTO> list = new ArrayList<>();
	
	public boolean save(BoardDTO boardDTO) {
		return list.add(boardDTO);	
		//리스트 안의 add메소드를 통해 boardDTO 값이 넣어지면 true, 안 넣어지면 false을 boolean으로 리턴해줌
	}
	
	public List<BoardDTO> findAll() {
		return list;
	}
	
	public BoardDTO findById(String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
//				b.increaseCnt();
				return b;	//리턴되면 메소드 빠져나감
			}
		}
		return null;
	}
	
	public boolean update(BoardDTO boardDTO, String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				b.setTitle(boardDTO.getTitle());
				b.setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	

	public boolean updateNew(String bno, String updateTitle, String updateWriter) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				b.setTitle(updateTitle);
				b.setWriter(updateWriter);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String bno) {
		for(BoardDTO b : list) {
			if(b.getBno().equals(bno)) {
				list.remove(b);
				return true;
			}
		}
		return false;
	}
}
