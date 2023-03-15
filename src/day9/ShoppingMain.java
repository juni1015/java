package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Shopping> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=====쇼핑몰 관리자 페이지=====");
			System.out.println("1.상품등록 2.상품변경 3.재고추가 4.상품삭제 5.상품리스트 6.상품재고조회 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Shopping shopping = new Shopping();
				System.out.print("상품번호> ");
				shopping.inputSno(sc.next());
				System.out.print("상품이름> ");
				shopping.setName(sc.next());
				System.out.print("상품색상> ");
				shopping.setColor(sc.next());
				System.out.print("상품가격> ");
				shopping.setPrice(sc.nextInt());
				System.out.print("입고수량> ");
				shopping.setEa(sc.nextInt());
				list.add(shopping);
				System.out.println("상품등록 완료");
			} else if(menu == 2) {
				System.out.print("변경할 상품번호> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Shopping s : list) {
					if(selectSno.equals(s.getSno())) {
						System.out.print("변경할 상품이름> ");
						String updateName = sc.next();
						System.out.print("변경할 상품색상> ");
						String updateColor = sc.next();
						System.out.print("변경할 상품가격> ");
						int updatePrice = sc.nextInt();
						System.out.print("변경할 상품수량> ");
						int updateEa = sc.nextInt();
						
						s.setName(updateName);
						s.setColor(updateColor);
						s.setPrice(updatePrice);
						if(updateEa != s.getEa()) {
							s.updateEa(updateEa);
						}
						System.out.println("수정 완료");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("변경할 상품이 없습니다.");
				}
			} else if(menu == 3) {
				System.out.print("수량 추가할 상품번호> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Shopping s : list) {
					if(selectSno.equals(s.getSno())) {
						System.out.print("추가할 수량> ");
						int inputEa = sc.nextInt();
						s.inputEa(inputEa);
						System.out.println("수량추가 완료");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("수량을 추가할 상품이 없습니다.");
				}
			} else if(menu == 4) {
				System.out.print("삭제할 상품번호> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Shopping s : list) {
					if(selectSno.equals(s.getSno())) {
						find = true;
						while(true) {
							System.out.print("정말 삭제하시겠습니까? 1.Y 2.N> ");
							int deleteOk = sc.nextInt();
							if(deleteOk == 1) {
								list.remove(s);
								System.out.println("삭제되었습니다.");
								break;
							} else if(deleteOk == 2) {
								System.out.println("삭제되지 않았습니다.");
								break;
							} else {
								System.out.println("다시 입력");
								continue;
							}
						}
						break;
					}
				}
				if(!find) {
					System.out.println("삭제할 상품이 없습니다.");
				}
			} else if(menu == 5) {
				System.out.println("상품번호\t상품이름\t상품색상\t상품가격\t상품수량");
				System.out.println("-------------------------------------------");
				for(Shopping s : list) {
					s.print();
				}
			} else if(menu == 6) {
				System.out.print("조회할 상품번호> ");
				String selectSno = sc.next();
				boolean find = false;
				for(Shopping s : list) {
					if(selectSno.equals(s.getSno())) {
						s.detailListPrint();
						find = true;
					}
				}
				if(!find) {
					System.out.println(selectSno + " 상품은 없습니다.");
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
