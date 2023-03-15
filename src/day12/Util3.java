package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util3 {
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
		boolean ok = false;
		while(true) {
			List<UserDTO> list = repository.findAll();
			System.out.print("이메일> ");
			String id = sc.next();
			String domain = UserDTO.getDomain();
			

			System.out.println(list.size());
			
			if(list.size() == 0) {
				return id;
			} else {
				for(UserDTO u : list) {
//					String a = u.getEmail();
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
			        //String mail2 = selectEmail.substring(idx+1);
			      
			        System.out.println(id);
			        System.out.println(domain);
			        System.out.println("mail1 : "+selectid);
			        //System.out.println("mail2 : "+mail2);
			        
			        if(selectid.equals(id)) {
			        	System.out.println("아이디부터 같음");
			        	for(UserDTO u2 : list) {
			        		String selectDomain = u2.getEmail();
					        
					        if(selectDomain.equals(id + "@" + domain)) {
					        	System.out.println("동일한 이메일이 있습니다.");
					        	ok = false;
					        	break;
					        } else {
					        	return id;
					        	//ok = true;
					        }
			        	}
			        	//ok = false;
			        } 
			        /*else {
			        	System.out.println("아이디부터 다름");
			        	return id;
		        		//ok = true;
			        }*/
			        break;
			        /*if(!ok) {
			        	break;
			        }*/
			        
			        /*if(!ok) {
			        	if(mail2.equals(domain)) {
				        	System.out.println("동일한 아이디 값이 있습니다");
				        	ok = false;
//					        	break;
			        	} else {
			        		System.out.println("아이디는 같고 이메일은 다름");
//				        		return id;
			        		ok = true;
			        	}
			        }*/
	        		
				}

				/*if(ok) {
					System.out.println("ok");
					return id;
				}*/
			}
			
			
			
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
