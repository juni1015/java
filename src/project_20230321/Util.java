package project_20230321;

import java.util.List;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	
	//숫자만 입력하는 메뉴선택
	public int menu() {
		System.out.print("선택> ");
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
//	public long numberCheck() {
//		if(sc.hasNextLong()) {
//			long number = sc.nextLong();
//			return number;
//		} else {
//			sc.nextLine();
//			System.out.println("숫자만 입력가능");
//			return -1;
//		}	
//	}
	
	//숫자만 입력 체크
	public long numberCheck(String str) {
		System.out.print(str + "> ");
		if(sc.hasNextLong()) {
			long number = sc.nextLong();
			sc.nextLine();
			return number;
		} else {
			sc.nextLine();
			System.out.println("숫자만 입력가능");
			return -1;
		}	
	}
	
	//문자 무조건 입력
	public String stringCheck(String str) {
		System.out.print(str + "*> ");
		String inpStr = sc.nextLine();
		if(inpStr != "") {
			return inpStr;
		} else {
			System.out.println("필수 입력값입니다.");
			return null;
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

	//숫자 건너뛰기
//	public long numberSkip(long number, long origin) {
//		if(number == 0) {	
//			return origin;		
//		}
//		return number;
//	}
	
	//숫자만 입력 체크
	public boolean isNumeric(String s) {
        try {
//          Double.parseDouble(s);
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
