package project_20230321;

import java.util.ArrayList;
import java.util.List;

import day13.BreakdownDTO;

public class ProductBuyRepository {
	private static ProductBuyRepository repository = new ProductBuyRepository();
	private ProductBuyRepository() {}
	public static ProductBuyRepository getInstence() {
		return repository;
	}
	
	List<OrderDTO> oList = new ArrayList<>();
	
	public void buyBreakdown(UserDTO userDTO, ProductDTO productDTO, long ea) {
		OrderDTO orderDTO = new OrderDTO(userDTO.getId());
		orderDTO.setId(userDTO.getId());
		orderDTO.setName(userDTO.getName());
		orderDTO.setPno(productDTO.getPno());
		orderDTO.setPname(productDTO.getPname());
		orderDTO.setCategory(productDTO.getCategory());
		orderDTO.setCost(productDTO.getCost());
		orderDTO.setEa(ea);
		orderDTO.setAmount(productDTO.getCost()*ea);
		orderDTO.setStock(productDTO.getStock());
		oList.add(orderDTO);
	}
	
	public List<OrderDTO> orderList(String id) {
		List<OrderDTO> list = new ArrayList<>();
		for(OrderDTO o : oList) {
			if(id.equals(o.getId())) {
				list.add(o);
			}
		}
		return list;
	}
	
	public List<OrderDTO> orderAll() {
		return oList;
	}

}
