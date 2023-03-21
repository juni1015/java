package project_20230321;

import java.util.List;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	
	//숫자만 입력하는 메뉴선택
	public int menu() {
		System.out.print("메뉴선택> ");
		if(sc.hasNextInt()) {
			int menu = sc.nextInt();
			sc.nextLine();
			return menu;
		} else {
			sc.nextLine();
			return -1;
		}
		
	}
	
	//숫자만 입력 체크
	public long numberCheck() {
		if(sc.hasNextLong()) {
			long number = sc.nextLong();
			return number;
		} else {
			sc.nextLine();
			return -1;
		}	
	}
	
	//중복체크
	public boolean overrapCheck(List<UserDTO> ulList, String id, int memberOk) {
		for(UserDTO u : ulList) {
			if(id.equals(u.getId()) && memberOk == u.getManagerOk()) {
				return true;
			}
		}
		return false;
	}
	
	//문자 건너뛰기
	public String skip(String str, String origin) {
		if(str == "") {	
			return origin;		
		}
		return str;
	}
	

}
