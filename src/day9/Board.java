package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Board {
	private static int number = 0;	
	//static은 공유하는 데이터로 객체마다 나눠져 있는 것이 아니라 객체가 공통으로 동일한 데이터를 가짐
	//Main에서 static 필드를 사용할 때는 객체이름이 아닌 클래스 이름으로 접근함
	//Ex) System.out.println(Board.number);
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
	//final static은 변경할 수 없는 값으로 상수임 / 상수는 대문자로 씀
	
	private int bno;
	private String pw;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	
	public Board() {
		this.bno = ++number;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	public Board(String pw, String title, String writer) {
		this.bno = ++number;
		this.pw = pw;
		this.title = title;
		this.writer = writer;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	
	public int getBno() {	//값을 Main으로 보낼 때 사용하기 때문에 매개변수x, 리턴값o
		return this.bno;
	}
	public String getPw() {
		return this.pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void increaseCnt() {
		this.cnt++;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t%s\t%d\t%s\n", bno, title, writer, cnt, postDate);
	}

}
