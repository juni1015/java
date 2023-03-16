package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
	//Repository 데이터저장 역할
	private Map<String, BoardDTO> map = new HashMap<>();
	
	public boolean save(String bno, BoardDTO boardDTO) {
		map.put(bno, boardDTO);
//		System.out.println(map.size());		//실행부터 지금까지 map에 저장된 값의 개수가 나옴
//		System.out.println(map.get(bno));	//현재 저장하는 bno의 객체 주소값이 나옴
		if(map.get(bno) == null) {			//현재 저장하는 값이 제대로 들어가는지 확인하려면 size로 확인시 이전에 작성된 값의 개수도 확인되기 때문에 제대로 확인할 수 없음
			return false;
		}
		return true;
	}
	
	public Map<String, BoardDTO> findAll() {
		return map;
	}
	
	public Map<String, BoardDTO> findById(String bno) {
		for(String bnoFind : map.keySet()) {	//map.keySet은 키만 들어있기 때문에 키의 타입인 String으로 반복변수 bnoFind를 선언해야 함
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
	
	public boolean updateNew(String bno, String updateTitle, String updateWriter) {
		for(String bnoFind : map.keySet()) {
			if(bnoFind.equals(bno)) {		//if(bno.equals(map.get(bnoFind).getBno())) { 으로도 사용가능
				map.get(bno).setTitle(updateTitle);
				map.get(bno).setWriter(updateWriter);
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
		//정렬
		List<String> keySet = new ArrayList<>(map.keySet());	//list 안에 map의 key의 값들만 넣음
		Collections.sort(keySet);	//map의 key의 값들만 넣은 list를 정렬함
		
		for(String bnoFind : keySet) {	//정렬된 list(keySet)에 들어있는 key의 값을 bnoFind에 넣어 순차적으로 돌림
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
