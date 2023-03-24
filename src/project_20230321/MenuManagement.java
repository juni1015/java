package project_20230321;

public class MenuManagement {
	private static MenuManagement management = new MenuManagement();
	private MenuManagement() {}
	public static MenuManagement getInstence() {
		return management;
	}
	
	Util util = new Util();
	ProductService productService = ProductService.getInstence();
	ProductBuyService productBuyService = ProductBuyService.getInstence();
	
	public int productManagement() {
		System.out.println("1.상품등록 2.재고추가 3.상품수정 4.상품삭제 5.상품재고확인 0.뒤로가기");
		int menu = util.menu();
		
		if(menu == 1) {
			productService.save();
		} else if(menu == 2) {
			productService.inputStock();
		} else if(menu == 3) {
			productService.update();
		} else if(menu == 4) {
			productService.delete();
		} else if(menu == 5) {
			productService.findAll();
		} else if(menu == 0) {
			return 0;
		} else {
			System.out.println("다시입력");
		}
		System.out.println();
		return 1;
	}
	
	public int productBuy() {
		System.out.println("1.리스트구매 2.검색구매 0.뒤로가기");
		int menu = util.menu();
		
		if(menu == 1) {
			productBuyService.findAllBuy();
		} else if(menu == 2) {
			int managementOk = 1;
			while(managementOk != 0) {
				managementOk = productBuyService.findBuy();
			}
		} else if(menu == 0) {
			return 0;
		} else {
			System.out.println("다시입력");
		}
		System.out.println();
		return 1;
	}
}
