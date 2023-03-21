package project_20230321;

public class MenuManagement {
	private static MenuManagement management = new MenuManagement();
	private MenuManagement() {}
	public static MenuManagement getInstence() {
		return management;
	}
	
	Util util = new Util();
	ProductService productService = ProductService.getInstence();
	
	public int productManagement() {
		System.out.println("1.상품등록 2.재고추가 3.상품수정 4.상품삭제 5.상품리스트 0.뒤로가기");
		int menu = util.menu();
		
		if(menu == 1) {
			productService.save();
		} else if(menu == 2) {
			
		} else if(menu == 3) {
			
		} else if(menu == 4) {
			
		} else if(menu == 5) {
			
		} else if(menu == 0) {
			return 0;
		} else {
			System.out.println("다시입력");
		}
		return 1;
	}
}
