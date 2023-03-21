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
	private long ea;	//재고
	private String productDate;
	public void ProductDTO() {
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
	public long getEa() {
		return ea;
	}
	public void setEa(long ea) {
		this.ea = ea;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}
	

}
