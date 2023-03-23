package project_20230321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day17.ClientDTO;

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
	
	public ProductDTO findByProduct(String pno) {
		for(String key : pMap.keySet()) {
			if(pno.equals(pMap.get(key).getPno())) {
				return pMap.get(key);
			}
		}
		return null;
	}
	
	public boolean inputStock(String pno, long ea) {
		for(String key : pMap.keySet()) {
			if(pno.equals(pMap.get(key).getPno())) {
				pMap.get(key).setStock(pMap.get(key).getStock() + ea);
				return true;
			}
		}
		return false;
	}
	
	public Map<String, ProductDTO> findAll() {
		if(pMap != null) {
			return pMap;
		}
		return null;
	}
	
	public boolean update(String updatePno, String pname, String category, long cost, long ea) {
		for(String key : pMap.keySet()) {
			if(updatePno.equals(pMap.get(key).getPno())) {
				pMap.get(key).setPname(pname);
				pMap.get(key).setCategory(category);
				pMap.get(key).setCost(cost);
				pMap.get(key).setStock(ea);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String deletePno) {
		for(String key : pMap.keySet()) {
			if(deletePno.equals(pMap.get(key).getPno())) {
				pMap.remove(key);
				return true;
			}
		}
		return false;
	}
	
	public void stockReduction(String pno, long ea) {
		for(String key : pMap.keySet()) {
			if(pno.equals(pMap.get(key).getPno())) {
				pMap.get(key).setStock(pMap.get(key).getStock() - ea);
			}
		}
	}
	
	public List<ProductDTO> findBuy(String select, int menu) {
		List<ProductDTO> selectList = new ArrayList<>();
		//검색 정렬
		List<String> keySet = new ArrayList<>(pMap.keySet());
		Collections.sort(keySet);
		
		for(String key : keySet) {
			if(select.equals(pMap.get(key).getPname()) && menu == 1) {
				selectList.add(pMap.get(key));
			} else if(select.equals(pMap.get(key).getCategory()) && menu == 2) {
				selectList.add(pMap.get(key));
			}
		}
		return selectList;
	}
	

}
