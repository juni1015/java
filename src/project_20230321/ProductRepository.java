package project_20230321;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
	private static ProductRepository repository = new ProductRepository();
	private ProductRepository() {}
	public static ProductRepository getInstence() {
		return repository;
	}
	
//	List<ProductDTO> pList = new ArrayList<>();
	Map<String, ProductDTO> pMap = new HashMap<>();
	
	public boolean save(ProductDTO productDTO) {
		if(pMap.put(productDTO.getPno(), productDTO) == null) {
			return true;
		}
		return false;
	}

}
