package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day8.User;

public class Util {
	static Scanner sc = new Scanner(System.in);
//	UserRepository repository = UserRepository.getInstance();
	
	//숫자만 입력 체크
	public static int numberCheck() {
		if(sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			sc.nextLine();
			return -1;
		}	
	}
	
	
	//아이디 중복체크
	public static String overlapCheck(List<UserDTO> list, String str) {
		while(true) {
			System.out.print(str + "> ");
			String email = sc.next();
			boolean find = false;
			for(UserDTO u : list) {
				if(u.getEmail().equals(email + "@" + UserDTO.getDomain())) {
					System.out.println("중복된" + str);
					find = true;
					break;
				}
			}
			if(find) {
				continue;
			}
			return email;
		}
	}
	
	public static char genderCheck() {
		do {
			System.out.print("성별(1.남자 2.여자)> ");
			String gender = sc.next();
			if(gender.equals("1")) {
				return 'M';
			} else if(gender.equals("2")) {
				return 'F';
			} else {
				System.out.println("잘못된 성별입니다.");
			}
		} while(true);
	}
	
	
	
	//아이디 중복체크
	/*public String overlapCheck() {
		while(true) {
			List<UserDTO> list = repository.findAll();
			System.out.print("이메일> ");
			String id = sc.next();
			String domain = UserDTO.getDomain();
			boolean ok = false;			
			String idOk = null;
			
			if(list.size() == 0) {
				return id;
			} else {
				for(UserDTO u : list) {
					// @를 기준으로 문자열을 추출할 것이다.
					String selectEmail = u.getEmail();
					
					// 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
			        int idx = selectEmail.indexOf("@"); 
			        
			        // @ 앞부분을 추출
			        // substring은 첫번째 지정한 인덱스는 포함하지 않는다.
			        // 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
			        String selectid = selectEmail.substring(0, idx);
			        
			        if(selectid.equals(id)) {
			        	idOk = id;
			        	break;
			        } 
			        
				}
				if(idOk != null) {
					for(UserDTO u : list) {
						// @를 기준으로 문자열을 추출할 것이다.
		        		String selectEmail = u.getEmail();
						
						// 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
				        int idx = selectEmail.indexOf("@");
				        
				        // @ 앞부분을 추출
				        // substring은 첫번째 지정한 인덱스는 포함하지 않는다.
				        // 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
				        String selectid = selectEmail.substring(0, idx);
				        
				        // 뒷부분을 추출
				        // 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
				        String selectDomain = selectEmail.substring(idx+1);
				        
				        if(selectid.equals(idOk) && selectDomain.equals(domain)) {
				        	System.out.println("동일한 이메일이 있습니다. 다시입력");
				        	ok = true;
				        	break;
				        } else {
				        	ok = false;
				        }
		        	}
				} else {
					ok = false;
				}
			}
			if(!ok) {
				return id;
			}
				
		}
	}*/
}