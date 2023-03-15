package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
	//Repository 데이터저장 역할
	private Map<String, BoardDTO> map = new HashMap<>();
	
	public boolean save(String bno, BoardDTO boardDTO) {
		map.put(bno, boardDTO);
		return true;
		//리스트 안의 add메소드를 통해 boardDTO 값이 넣어지면 true, 안 넣어지면 false을 boolean으로 리턴해줌
	}
	
	public Map<String, BoardDTO> findAll() {
		return map;
	}
	
	public Map<String, BoardDTO> findById(String bno) {
		for(String bnoFind : map.keySet()) {
			if(bnoFind.equals(bno)) {
				return map;
			}			
		}
		return null;
	}
	
	public boolean update(BoardDTO boardDTO, String bno) {
		for(String bnoFind : map.keySet()) {
			if(bnoFind.equals(bno)) {
				map.get(bno).setTitle(boardDTO.getTitle());
				map.get(bno).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String bno) {
		for(String bnoFind : map.keySet()) {
			if(bnoFind.equals(bno)) {
				map.remove(bnoFind);
				return true;
			}
		}
		return false;
	}
	
	public List<BoardDTO> findWriter(String writer) {
		List<BoardDTO> writerList = new ArrayList<>();
		
		for(String bnoFind : map.keySet()) {
			if(map.get(bnoFind).getWriter().equals(writer)) {
				//아래 방법으로 객체 생성해서 하나하나 넣어줄 필요없음
//				BoardDTO boardDTO = new BoardDTO();
//				boardDTO.setBno(bnoFind);
//				boardDTO.setTitle(map.get(bnoFind).getTitle());
//				boardDTO.setWriter(map.get(bnoFind).getWriter());
//				boardDTO.setPostDate(map.get(bnoFind).getPostDate());
				
				writerList.add(map.get(bnoFind));	
				//map에 있는 bnoFind의 키에 해당하는 객체가 list에 저장됨 
			}
		}
		return writerList;
	}
}
