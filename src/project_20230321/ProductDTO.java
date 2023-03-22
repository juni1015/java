package project_20230321;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductDTO {
	private static int number = 1000;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String pno;
	private String pname;
	private String category;	//상품 분류
	private long cost;	//상품 금액
	private long stock;	//재고
	private String productDate;
	
	public ProductDTO() {
		this.pno = "P" + number++;
		this.productDate = DTF.format(LocalDateTime.now());
	}
	
	public String getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public String getProductDate() {
		return productDate;
	}

	@Override
	public String toString() {
		String str = pno + "\t" + pname + "\t" + category + "\t" + cost + "\t" + stock + "\t" + productDate;
		return str;
	}

}
