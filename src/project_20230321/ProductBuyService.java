package project_20230321;

public class ProductBuyService {
	private static ProductBuyService service = new ProductBuyService();
	private ProductBuyService() {}
	public static ProductBuyService getInstence() {
		return service;
	}
	
	ProductRepository repository = ProductRepository.getInstence();
	
	public void findAllBuy() {
		
	}
	
	
}
