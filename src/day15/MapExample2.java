package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map2 = new HashMap<>();
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째", "spring");
//		map2.put("네번째", "spring");
		
		System.out.println(map2.get("두번째"));
//		System.out.println(map2.get("세번째"));
		
//		map2.remove("세번째");
//		System.out.println(map2.get("세번째"));
		
//		if(map2.get("세번째") == map2.get("네번째")) {
//			System.out.println("o");
//		} else {
//			System.out.println("x");
//		}
//		
//		if(map2.get("세번째").equals(map2.get("네번째"))) {
//			System.out.println("o");
//		} else {
//			System.out.println("x");
//		}
		
//		String a = "오예";	//문자열 리터널로 값을 집어넣으면 기존에 만들어놨던 리터널 값이 같으면 만들어놨던 리터널 값을 참조하여 같은 주소값이 들어감
//		String b = "오예";
//		
//		if(a == b) {
//			System.out.println("o");
//		} else {
//			System.out.println("x");
//		}
		
		//map 반복문으로 접근
		for(String key : map2.keySet())	{	//keyset 키 덩어리를 만들어줌 / 키에 해당하는 타입으로 반복함
			System.out.println(key);	//키값 확인
			System.out.println(map2.get(key));	//벨류값 확인
		}
		
		

	}

}
