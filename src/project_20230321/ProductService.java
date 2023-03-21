package project_20230321;

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
		System.out.print("상품명*> ");
		productDTO.setPname(sc.nextLine());
		System.out.print("분류> ");
		productDTO.setCategory(util.skip(sc.nextLine(), productDTO.getCategory()));
		long numberCheck = 0;
		while(numberCheck != -1) {
			System.out.print("금액*> ");
			numberCheck = util.numberCheck();
		}
		productDTO.setCost(numberCheck);
		while(numberCheck != -1) {
			System.out.print("입고수량*> ");
			numberCheck = util.numberCheck();
		}
		productDTO.setEa(numberCheck);
		
		if(repository.save(productDTO)) {
			System.out.println("상품등록 완료");
		} else {
			System.out.println("상품등록 실패");
		}
	}

}
