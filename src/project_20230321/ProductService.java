package project_20230321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
	private static ProductService service = new ProductService();
	private ProductService() {}
	public static ProductService getInstence() {
		return service;
	}
	
	Scanner sc = new Scanner(System.in);
	Util util = new Util();
	ProductRepository repository = ProductRepository.getInstence();
	
	public void save() {
		ProductDTO productDTO = new ProductDTO();
		String inputStr = null;
		while(true) {
			inputStr = util.stringCheck("상품명");
			if(inputStr != null) {
				break;
			}
		}
		productDTO.setPname(inputStr);
		System.out.print("분류> ");
		productDTO.setCategory(util.skip(sc.nextLine(), productDTO.getCategory()));
		long cost = 0;
		while(true) {
			System.out.print("금액> ");
			String strCost = util.skip(sc.nextLine(), Long.toString(productDTO.getCost()));
			if(util.isNumeric(strCost)) {
				cost = Long.parseLong(strCost);
				break;
			} else {
				System.out.println("숫자만 입력가능");
			}
		}
		productDTO.setCost(cost);
		long ea = 0;
		while(true) {
			System.out.print("재고수량> ");
			String strEa = util.skip(sc.nextLine(), Long.toString(productDTO.getStock()));
			if(util.isNumeric(strEa)) {
				ea = Long.parseLong(strEa);
				break;
			} else {
				System.out.println("숫자만 입력가능");
			}
		}
		productDTO.setStock(ea);
		
		if(repository.save(productDTO)) {
			System.out.println("상품등록 완료");
		} else {
			System.out.println("상품등록 실패");
		}
	}
	
	public void inputStock() {
		String inputStr = null;
		
		while(true) {
			inputStr = util.stringCheck("상품코드");
			if(inputStr != null) {
				break;
			}
		}
		ProductDTO productDTO = repository.findByProduct(inputStr);
		if(productDTO != null) {
			long ea = 0;
			while(true) {
				System.out.print("재고수량> ");
				String strEa = util.skip(sc.nextLine(), Long.toString(productDTO.getStock()));
				if(util.isNumeric(strEa)) {
					ea = Long.parseLong(strEa);
					if(ea == 0) {
						System.out.println("재고수량을 입력하지 않으셨거나 0을 입력하여 추가되지 않았습니다");
					} else if(repository.inputStock(productDTO.getPno(), ea)) {
						System.out.println("재고추가 완료\t" + productDTO.getPno() + " 재고 : " + productDTO.getStock());
					}
					break;
				} else {
					System.out.println("숫자만 입력가능");
				}
			}
			//숫자 입력되었는지만 체크했었음
//			while(true) {
//				numberCheck = util.numberCheck("재고추가");
//				if(numberCheck != -1) {
//					if(repository.inputStock(productDTO.getPno(), numberCheck)) {
//						System.out.println("재고추가 완료\t" + productDTO.getPno() + " 재고 : " + productDTO.getStock());
//					}
//				}
//				break;
//			}
		} else {
			System.out.println("조회한 상품은 없는 상품입니다.");
		}
	}
	
	public void findAll() {
		Map<String, ProductDTO> pMap = repository.findAll();
		
		if(pMap == null) {
			System.out.println("조회할 상품이 없습니다");
		} else {
			List<String> keySet = new ArrayList<>(pMap.keySet());
			Collections.sort(keySet);
			
			System.out.println("상품코드\t상품명\t분류\t금액\t재고수량\t생성날짜");
			System.out.println("---------------------------------------------------------------------------");
			for(String key : keySet) {
				System.out.println(pMap.get(key).toString());
			}
		}
	}
	
	public void update() {
		String updatePno = null;
		
		while(true) {
			updatePno = util.stringCheck("상품코드");
			if(updatePno != null) {
				break;
			}
		}
		ProductDTO productDTO = repository.findByProduct(updatePno);
		if(productDTO == null) {
			System.out.println("조회한 상품이 없습니다");
		} else {
			System.out.print("상품명> ");
			String pname = util.skip(sc.nextLine(), productDTO.getPname());
			System.out.print("분류> ");
			String category = util.skip(sc.nextLine(), productDTO.getCategory());
			long cost = 0;
			while(true) {
				System.out.print("금액> ");
				String strCost = util.skip(sc.nextLine(), Long.toString(productDTO.getCost()));
				if(util.isNumeric(strCost)) {
					cost = Long.parseLong(strCost);
					break;
				} else {
					System.out.println("숫자만 입력가능");
				}
			}
			long ea = 0;
			while(true) {
				System.out.print("재고수량> ");
				String strEa = util.skip(sc.nextLine(), Long.toString(productDTO.getStock()));
				if(util.isNumeric(strEa)) {
					ea = Long.parseLong(strEa);
					break;
				} else {
					System.out.println("숫자만 입력가능");
				}
			}
			
			if(repository.update(updatePno, pname, category, cost, ea)) {
				System.out.println("수정완료");
			} else {
				System.out.println("수정실패");
			}
		}
	}
	
	public void delete() {
		String deletePno = null;
		
		while(true) {
			deletePno = util.stringCheck("상품코드");
			if(deletePno != null) {
				break;
			}
		}
		ProductDTO productDTO = repository.findByProduct(deletePno);
		if(productDTO == null) {
			System.out.println("조회한 상품이 없습니다");
		} else {
			while(true) {
				System.out.println("정말 삭제하시겠습니까? 1.Y 2.N> ");
				int menu = util.menu();
				
				if(menu == 1) {
					if(repository.delete(deletePno)) {
						System.out.println("삭제완료");
						break;
					} else {
						System.out.println("삭제실패");
					}
				} else if(menu == 2) {
					break;
				} else {
					System.out.println("다시입력");
				}
			}
		}
	}
	
	public void testData() {
		boolean ok = false;
		for(int i = 1; i < 6; i++) {
			ProductDTO productDTO = new ProductDTO();
			if(i % 2 == 0) {
				productDTO.setPname("상의" + i);
				productDTO.setCategory("상의");
			} else {
				productDTO.setPname("하의" + i);
				productDTO.setCategory("하의");
			}
			productDTO.setCost(i*1000);
			productDTO.setStock(i*100);
			ok = repository.save(productDTO);
		}
		if(ok) {
			System.out.println("상품 테스트데이터 저장완료");
		} else {
			System.out.println("상품 테스트데이터 저장실패");
		}
	}
	

}
