package day15;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<>();
		//Map이라는 인터페이스를 사용하는데 HashMap이라는 클래스 생성자를 사용
		//<>에는 소문자로 되어 있는 타입을 사용하지 않음
		//Map<어떤타입의key, 어떤타입의value>
		
		map1.put(1, "안녕하세요");
		System.out.println(map1.put(2, "hello"));	//null이 나오는 이유 : 값이 들어가기 직전의 값이 리턴됨
		System.out.println(map1.put(2, "헬로"));		//위와 동일한 이유로 hello가 나옴
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		
		map1.put(5, "안녕");
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		
		String val1 = map1.get(1);
		System.out.println(val1);
		
		map1.remove(2);
		System.out.println(map1.get(2));	//key 2번의 value값을 지움
		
		for(int key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}

	}

}
