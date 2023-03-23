package project_20230321;

public class ProductBuyRepository {
	private static ProductBuyRepository repository = new ProductBuyRepository();
	private ProductBuyRepository() {}
	public static ProductBuyRepository getInstence() {
		return repository;
	}
	

}
