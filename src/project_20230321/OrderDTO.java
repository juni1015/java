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
	private String color;
	private long cost;	//상품 금액
	private int ea;
	private String orderDate;
	
	public void OrderDTO() {
		
	}
	public void OrderDTO(String id) {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
