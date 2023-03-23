package project_20230321;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day13.BreakdownDTO;
import day17.ClientDTO;

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
	ProductBuyRepository productBuyRepository = ProductBuyRepository.getInstence();
	Util util = new Util();
	
	public void findAllBuy() {
		Map<String, ProductDTO> pMap = productrepository.findAll();
		int i = 1;
		if(pMap.size() == 0) {
			System.out.println("조회할 상품이 없습니다");
		} else {
			System.out.println("No\t상품코드\t상품명\t분류\t금액\t재고수량\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			for(String key : pMap.keySet()) {
				System.out.println(i + "\t" + pMap.get(key).toString());
				i++;
			}
			while(true) {
				System.out.println("구매하시겠습니까? 1.Y 2.N ");
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
		}
	}
	
	public int findBuy() {
		System.out.println("1.상품명검색 2.분류검색 0.뒤로가기");
		int menu = util.menu();
		if(menu == 1) {
			String inputStr = null;
			while(true) {
				inputStr = util.stringCheck("구매할 상품명");
				if(inputStr != null) {
					break;
				}
			}
			List<ProductDTO> selectProduct = productrepository.findBuy(inputStr, menu);
			if(selectProduct.size() == 0) {
				System.out.println("없는 상품명입니다.");
			} else {
				int i = 1;
				System.out.println("No\t상품코드\t상품명\t분류\t금액\t재고수량\t생성날짜");
				System.out.println("---------------------------------------------------------------------------");
				for(ProductDTO p : selectProduct) {
					System.out.println(i + "\t" + p.toString());
					i++;
				}
			}
			while(true) {
				System.out.println("구매하시겠습니까? 1.Y 2.N ");
				menu = util.menu();
				
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
		} else if(menu == 2) {
			String inputStr = null;
			while(true) {
				inputStr = util.stringCheck("구매할 상품분류");
				if(inputStr != null) {
					break;
				}
			}
			List<ProductDTO> selectProduct = productrepository.findBuy(inputStr, menu);
			if(selectProduct.size() == 0) {
				System.out.println("없는 상품명입니다.");
			} else {
				int i = 1;
				System.out.println("No\t상품코드\t상품명\t분류\t금액\t재고수량\t생성날짜");
				System.out.println("---------------------------------------------------------------------------");
				for(ProductDTO p : selectProduct) {
					System.out.println(i + "\t" + p.toString());
					i++;
				}
			}
			while(true) {
				System.out.println("구매하시겠습니까? 1.Y 2.N ");
				menu = util.menu();
				
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
		} else if(menu == 0) {
			return 0;
		} else {
			System.out.println("다시입력");
		}
		return 1;
	}
	
	public boolean buy() {
		while(true) {
			String buyPno = util.stringCheck("구매할 상품코드");
			ProductDTO productDTO = productrepository.findByProduct(buyPno);
			if(productDTO == null) {
				System.out.println("상품코드 확인필요");
			} else {
				while(true) {
//					long ea = -1;
//					ea = util.numberCheck("구매할 수량");
					
					long ea = 0;
					System.out.print("구매할 수량> ");
					String strEa = util.skip(sc.nextLine(), "");
//					System.out.println(strEa);
					if(strEa == "") {
						strEa = "0";
					}
					if(util.isNumeric(strEa)) {
						ea = Long.parseLong(strEa);
					} else {
						System.out.println("숫자만 입력가능");
					}
					
					if(ea > 0) {
						UserDTO userDTO = memberService.loginUser();
						if(ea <= productDTO.getStock()) {
//							long price = productDTO.getCost();
							if((productDTO.getCost()*ea) <= userDTO.getBalance()) {
								productrepository.stockReduction(productDTO.getPno(), ea);
								memberRepository.balanceReduction(userDTO.getId(), userDTO.getPw(), (productDTO.getCost()*ea));
								productBuyRepository.buyBreakdown(userDTO, productDTO, ea);
								return true;
							} else {
								System.out.println("잔액이 부족합니다");
								break;
							}
						} else {
							System.out.println("해당 상품의 재고수량이 부족합니다");
							break;
						}
					} 
					else {
						System.out.println("0보다 큰 수를 입력하세요");
					}
					
//					long ea = 0;
//					System.out.print("구매할 수량> ");
//					String strEa = util.skip(sc.nextLine(), Long.toString(productDTO.getStock()));
//					if(util.isNumeric(strEa)) {
//						ea = Long.parseLong(strEa);
//						if(ea <= 0) {
//							System.out.println("구매할 수량을 입력하지 않으셨거나 0보다 작은 수를 입력하셨습니다.");
//						} else if(ea > 0) {
//							UserDTO userDTO = memberService.loginUser();
//							if(ea <= productDTO.getStock()) {
//								long price = productDTO.getCost();
//								if((price*ea) <= userDTO.getBalance()) {
//									productrepository.stockReduction(productDTO.getPno(), ea);
//									memberRepository.balanceReduction(userDTO.getId(), userDTO.getPw(), (price*ea));
//									return true;
//								} else {
//									System.out.println("잔액이 부족합니다");
//								}
//							} else {
//								System.out.println("해당 상품의 재고수량이 부족합니다");
//							}
//						} 
//						break;
//					} else {
//						System.out.println("숫자만 입력가능");
//					}
					
				}
				break;
			}
		}
		return false;
	}
	
	public void orderBreakdown() {
		UserDTO loginUserDTO = memberService.loginUser();
		UserDTO userDTO = memberRepository.findById(loginUserDTO.getId(), loginUserDTO.getPw());
		if(userDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("아이디\t패스워드\t이름\t휴대폰번호\t주소\t보유금액\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(userDTO.toString());
			System.out.println("---------------------------------------------------------------------------");
			List<OrderDTO> oList  = productBuyRepository.orderList(userDTO.getId());
			if(oList.size() == 0) {
				System.out.println("구매내역이 없습니다");
			} else {				
				System.out.println("▼구매내역▼");
				System.out.println("------------------------------------------------------------------");
				System.out.println("주문번호\t상품코드\t상품명\t상품분류\t상품금액\t구매수량\t구매금액\t구매날짜");
				for(OrderDTO o : oList) {
					o.print();
				}
				System.out.println("------------------------------------------------------------------");
			}
		}
	}
	
	public void saleBreakdown() {
		List<OrderDTO> oList = productBuyRepository.orderAll();
		if(oList.size() == 0) {
			System.out.println("구매내역이 없습니다");
		} else {
			System.out.println("------------------------------------------------------------------");
			System.out.println("주문번호\t구매회원아이디\t구매회원이름\t상품코드\t상품명\t상품분류\t상품금액\t구매수량\t판매금액\t판매후재고\t판매날짜");
			for(OrderDTO o : oList) {
				System.out.println(o.toString());
			}
			System.out.println("------------------------------------------------------------------");
		}
	}
	
	
}
