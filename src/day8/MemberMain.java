package day8;

import java.util.*;	//자바.유틸에 들어가 있는 모든 것(*)을 사용하겠다
//해당 Main에서는 Scanner와 List 두개를 import해야하는데 *을 쓸 경우 모든 것을 사용하기 때문에 하나로 통합가능 

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Util util = new Util();
		List<Member> list = new ArrayList<>(); // list.add(객체); list.get(index);
		//list 안에는 Member 객체만 들어올 수 있음 / <>안에는 어떤 타입이 들어갈지 작성
		//배열은 크기를 지정하나 ArrayList는 크기 지정하지 않음(값을 넣을 때마다 늘어남) 
		int id = 0;
		
		while(true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.검색 4.멤버수정 5.멤버삭제 0.종료");
			System.out.print("메뉴 선택> ");
//			int menu = sc.nextInt();
			int menu = util.numberCheck1("메뉴");
			
			if(menu == 1) {					
				Member member = new Member();
				member.setId(++id);		//후치증가 id++ / 전치증가 ++id = +1를 하고 명령실행
				System.out.print("이메일 입력> ");
				member.setEmail(sc.next());
				System.out.print("패스워드 입력> ");
				member.setPw(sc.next());
				System.out.print("이름 입력> ");
				member.setName(sc.next());
				list.add(member);	//list객체에 member값을 넣음
				System.out.println("멤버등록 완료");
			} else if(menu == 2) {
				System.out.println("아이디\t이메일\t\t패스워드\t이름\t가입일");
				System.out.println("-------------------------------------------");
				for(Member m : list) {
//					System.out.printf("%d\t%s\t%s\t%s\t%s\n", m.getId(), m.getEmail(), m.getPw(), m.getName(), m.getJoinDate());
					m.print();
				}
			} else if(menu == 3) {
				System.out.print("검색할 아이디> ");
//				int searchId = sc.nextInt();
				int searchId = util.numberCheck1("검색할 아이디");
				boolean find = false;
				System.out.println("아이디\t이메일\t\t패스워드\t이름\t가입일");
				System.out.println("-------------------------------------------");
				
				for(Member m : list) {
					if(m.getId() == searchId) {
						m.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 아이디입니다.");
				}
			} else if(menu == 4) {
				System.out.print("수정할 아이디> ");
				int updateId = sc.nextInt();
				boolean find = false;
				
				for(Member m : list) {
					if(updateId == m.getId()) {
						System.out.print("수정할 이메일 입력> ");
						m.setEmail(sc.next());
						System.out.print("수정할 패스워드 입력> ");
						m.setPw(sc.next());
						System.out.print("수정할 이름 입력> ");
						m.setName(sc.next());
						System.out.println("수정완료");
						find = true;
						break;						
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 아이디입니다.");
				}
			} else if(menu == 5) {
				System.out.println("삭제할 아이디> ");
				int deleteId = sc.nextInt();
				boolean find = false;
				
				for(Member m : list) {
					if(deleteId == m.getId()) {
						list.remove(m);
						System.out.println(m.getName() + "삭제완료");
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 아이디입니다.");
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
		}
		System.out.println("프로그램 종료");

	}

}
