package project_20230321;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderDTO {
	private static int number = 1000;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String ono;
	private String id;
	private String name;	//구매자 이름
	private String pno;
	private String pname;	//상품 이름
	private String category;//상품 분류
	private long cost;		//상품 금액
	private long ea;		//구매한 상품 개수
	private long amount;	//합계금액
	private long stock;
	private String orderDate;
	
	public OrderDTO() {
		
	}
	public OrderDTO(String id) {
		this.ono = "O" + id + number++;
		this.orderDate = DTF.format(LocalDateTime.now());
	}
	
	public String getOno() {
		return ono;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
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
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public String getOrderDate() {
		return orderDate;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\t%d\t%d\t%d\t%s\n", ono, pno, pname, category, cost, ea, amount, orderDate);
	}

	@Override
	public String toString() {
		String str = ono + "\t" + id + "\t" + name + "\t" + pno + "\t" + pname + "\t" + category + "\t" + cost + "\t" + ea + "\t" + amount + "\t" + stock + "\t" + orderDate;
		
		return str;
	}

}
