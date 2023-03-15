package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util2 {
	Scanner sc = new Scanner(System.in);
	UserRepository repository = UserRepository.getInstance();
//	List<UserDTO> list = new ArrayList<>();
	
	//숫자만 입력 체크
	public int numberCheck() {
		if(sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			sc.nextLine();
			return -1;
		}	
	}
	
	//아이디 중복체크
	public String overlapCheck() {
		while(true) {
			List<UserDTO> list = repository.findAll();
			System.out.print("이메일> ");
			String id = sc.next();
			String domain = UserDTO.getDomain();
			

			System.out.println(list.size());
			boolean ok = true;
			
			for(UserDTO u : list) {
				// @를 기준으로 문자열을 추출할 것이다.
				String email = u.getEmail();
				
				// 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
		        int idx = email.indexOf("@"); 
		        
		        // @ 앞부분을 추출
		        // substring은 첫번째 지정한 인덱스는 포함하지 않는다.
		        // 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
		        String mail1 = email.substring(0, idx);
		        
		        // 뒷부분을 추출
		        // 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
		        String mail2 = email.substring(idx+1);
		      
		        System.out.println("mail1 : "+mail1);
		        System.out.println("mail2 : "+mail2);
		        
		        if(mail1.equals(id)) {
		        	if(mail2.equals(domain)) {
			        	System.out.println("동일한 아이디 값이 있습니다");
			        	ok = false;
		        	} else {
		        		return id;
		        	}
		        } else {
		        	return id;
		        }

				if(ok) {
					System.out.println("ok");
					return id;
				}
				
			}
			continue;
			
		}
	}
	
	
	//아이디 중복체크
	public String overlapCheck2() {
		while(true) {
			List<UserDTO> list = repository.findAll();
			System.out.print("이메일> ");
			String id = sc.next();
			String domain = UserDTO.getDomain();
//
//			System.out.println(id);
//			System.out.println(domain);
			
//			if(!(list.isEmpty())) {
//				System.out.println(id);
//				System.out.println(domain);
				boolean ok = true;
				System.out.println(list.size());
				
				for(UserDTO u : list) {
					String a = u.getEmail();

					// @를 기준으로 문자열을 추출할 것이다.
			        String email = a;
			        
			        // 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
			        int idx = email.indexOf("@"); 
			        
			        // @ 앞부분을 추출
			        // substring은 첫번째 지정한 인덱스는 포함하지 않는다.
			        // 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
			        String mail1 = email.substring(0, idx);
			        
			        // 뒷부분을 추출
			        // 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
			        String mail2 = email.substring(idx+1);
			      
			        System.out.println("mail1 : "+mail1);
			        System.out.println("mail2 : "+mail2);

					if(mail1.equals(id)) {
						if(mail2.equals(domain)) {
							System.out.println("중복된 아이디가 있습니다. 다시 입력");
							ok = false;
						} else {
							return id;
						}
					} else {
						return id;
					}
				}
//			} else {
//				return id;
//			}
			if(ok) {
				System.out.println("ok");
				return id;
			}
			continue;
		}
		
	}
	
	
	
//	//아이디 중복체크
//	public String overlapCheck() {
//		while(true) {
//			System.out.print("이메일> ");
//			String id = sc.next();
//			String domain = UserDTO.getDomain();
////
////			System.out.println(id);
////			System.out.println(domain);
//			
////			if(!(list.isEmpty())) {
////				System.out.println(id);
////				System.out.println(domain);
//			boolean ok = true;
//			System.out.println(list.size());
//				for(int i = 0; i < list.size(); i++) {
//					String a = list.get(i).getEmail();
//
//					// @를 기준으로 문자열을 추출할 것이다.
//			        String email = a;
//			        
//			        // 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
//			        int idx = email.indexOf("@"); 
//			        
//			        // @ 앞부분을 추출
//			        // substring은 첫번째 지정한 인덱스는 포함하지 않는다.
//			        // 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
//			        String mail1 = email.substring(0, idx);
//			        
//			        // 뒷부분을 추출
//			        // 아래 substring은 @ 바로 뒷부분인 n부터 추출된다.
//			        String mail2 = email.substring(idx+1);
//			      
//			        System.out.println("mail1 : "+mail1);
//			        System.out.println("mail2 : "+mail2);
//
//					if(mail1.equals(id)) {
//						if(mail2.equals(domain)) {
//							System.out.println("중복된 아이디가 있습니다. 다시 입력");
//							ok = false;
//						} else {
//							return id;
//						}
//					} else {
//						return id;
//					}
//				}
////			} else {
////				return id;
////			}
//			if(ok) {
//				System.out.println("ok");
//				return id;
//			}
//			continue;
//		}
//		
//	}
	
	
}
