package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Shopping {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String sno;
	private String name;
	private String color;
	private int price;
	private int ea;
	private List<String> detailList = new ArrayList<>();
	
	//재고추가 메소드
	public void inputEa(int inputEa) {
		this.ea += inputEa;
		String date = DTF.format(LocalDateTime.now());
		String str = "재고추가\t" + inputEa + "\t" + ea + "\t" + date;
		detailList.add(str);
	}
	
	//재고수정 메소드
	public void updateEa(int updateEa) {
		this.ea = updateEa;
		String date = DTF.format(LocalDateTime.now());
		String str = "재고수정\t" + updateEa + "\t" + ea + "\t" + date;
		detailList.add(str);
	}
	
	
	public void inputSno(String sno) {
		this.sno = sno + "-" + ++number;
	}

	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
		String date = DTF.format(LocalDateTime.now());
		String str = "재고입고" + "\t" + ea + "\t" + ea + "\t" + date;
		detailList.add(str);
	}
	
//	public void setEa(int ea, String inputOk) {
//		if(inputOk.equals("추가")) {
//			int inputEa = ea;
//			this.ea += inputEa;
//			String date = DTF.format(LocalDateTime.now());
//			String str = "재고" + inputOk + "\t" + inputEa + "\t" + ea + "\t" + date;
//			detailList.add(str);
//		} else {
//			this.ea = ea;
//			String date = DTF.format(LocalDateTime.now());
//			String str = "재고" + inputOk + "\t" + ea + "\t" + ea + "\t" + date;
//			detailList.add(str);
//		}
//	}
	
	//내역 읽기 보내기
	public List<String> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<String> detailList) {
		this.detailList = detailList;
	}
	
	//프린트
	public void print() {
		System.out.printf("%s\t%s\t%s\t%d\t%d\n", sno, name, color, price, ea);
	}
	

	//내역프린트
	public void detailListPrint() {
		System.out.println("구분\t변경사항\t재고\t날짜");
		System.out.println("------------------------------------");
		for(String s : detailList) {
			System.out.println(s);
		}
	}
	
	
}
	