package project_20230321;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductBuyService {
	private static ProductBuyService service = new ProductBuyService();
	private ProductBuyService() {}
	public static ProductBuyService getInstence() {
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	ProductRepository productrepository = ProductRepository.getInstence();
	MemberRepository memberRepository = MemberRepository.getInstence();
	MemberService memberService = MemberService.getInstence();
	Util util = new Util();
	
	public void findAllBuy() {
		Map<String, ProductDTO> pMap = productrepository.findAll();
		int i = 1;
		if(pMap.size() == 0) {
			System.out.println("조회할 상품이 없습니다");
		} else {
			System.out.println("No.\t상품코드\t상품명\t분류\t금액\t재고수량\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			for(String key : pMap.keySet()) {
				System.out.println(i + ".\t" + pMap.get(key).toString());
				i++;
			}
			while(true) {
				System.out.println("구매하시겠습니까? 1.Y 2.N> ");
				int menu = util.menu();
				
				if(menu == 1) {
					if(service.buy()) {
						System.out.println("구매완료");
					} else {
						System.out.println("구매실패");
					}
					break;
				} else if(menu == 2) {
					break;
				} else {
					System.out.println("다시입력");
				}
			}
			
//			while(true) {
//				System.out.println("구매하시겠습니까? 1.Y 2.N> ");
//				int menu = util.menu();
//				
//				if(menu == 1) {
//					String buyPno = util.stringCheck("구매할 상품코드");
//					long ea = -1;
//					while(true) {
//						
//						ea = util.numberCheck("구매할 수량");
//						if(ea > 0) {
//							break;
//						} else {
//							System.out.println("0보다 큰수를 입력하세요");
//						}
//					}
//				} else if(menu == 2) {
//					break;
//				} else {
//					System.out.println("다시입력");
//				}
//			}
		}
	}
	
//	public void findBuy() {
//		System.out.println("1.상품명검색 2.분류검색");
//		int menu = util.menu();
//		
//		if(menu == 1) {
//			String inputStr = null;
//			while(true) {
//				inputStr = util.stringCheck("구매할 상품명");
//				if(inputStr != null) {
//					break;
//				}
//			}
//			List<ProductDTO> selectProduct = productrepository.findBuy(inputStr, menu);
//		} else if(menu == 2) {
//			
//		} else {
//			System.out.println("다시입력");
//		}
//		
//		while(true) {
//			System.out.println("구매하시겠습니까? 1.Y 2.N> ");
//			int menu = util.menu();
//			
//			if(menu == 1) {
//				if(service.buy()) {
//					System.out.println("구매완료");
//				} else {
//					System.out.println("구매실패");
//				}
//				break;
//			} else if(menu == 2) {
//				break;
//			} else {
//				System.out.println("다시입력");
//			}
//		}
//	}
	
	public boolean buy() {
		while(true) {
			String buyPno = util.stringCheck("구매할 상품코드");
			ProductDTO productDTO = productrepository.findByProduct(buyPno);
			if(productDTO == null) {
				System.out.println("상품코드 확인필요");
			} else {
				long ea = -1;
				while(true) {
					ea = util.numberCheck("구매할 수량");
					if(ea > 0) {
						UserDTO userDTO = memberService.loginUser();
						if(ea <= productDTO.getStock()) {
							long price = productDTO.getCost();
							if((price*ea) <= userDTO.getBalance()) {
								productrepository.stockReduction(productDTO.getPno(), ea);
								memberRepository.balanceReduction(userDTO.getId(), userDTO.getPw(), (price*ea));
								return true;
							} else {
								System.out.println("잔액이 부족합니다");
								break;
							}
						} else {
							System.out.println("해당 상품의 재고수량이 부족합니다");
							break;
						}
					} else {
						System.out.println("0보다 큰수를 입력하세요");
					}
				}
				break;
			}
		}
		return false;
	}
	
	
	
}
