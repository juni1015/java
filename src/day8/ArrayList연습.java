package day8;

import java.util.List;

public class ArrayList연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] mList = new Member[10];
		Member m = new Member();
		mList[0] = m;
		mList[1] = m;
		mList[2] = m;
		for(int i = 0; i < mList.length; i++) {
			System.out.println(mList[i]);
		}
		
		List<Member> list = new java.util.ArrayList<>();
		list.add(m);
		list.add(m);
		list.add(m);
		
		for(int i = 0; i < list.size(); i++) {	//list.size() = 들어간 것만큼
			System.out.println(list.get(i));
		}
		for(Member mm : list) {
			 System.out.println(mm);
		}

	}

}
