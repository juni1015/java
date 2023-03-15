package day7;

public class Board {
	private long no;
	private String title;
	private int cnt;
	private boolean open;
	
	//매개변수 = 파라미터
	//기본생성자 생성 / 전체 다 매개변수 생성자
	public Board() {
		System.out.println("기본 생성자");
	}
	
	public Board(long no, String title, int cnt, boolean open) {
		System.out.println("전체 다 매개변수 생성자");
		this.no = no;
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	
	
	//cnt(조회수) 1씩 올리기 메소드 생성 / open(공개비공개) 변경 메소드
	//전체 get/set 메소드 생성
	public int cntUp() {
		this.cnt++;
		return cnt;
//		this.cnt++;
	}
	
	public void toggleOpen() {
		open = !open;
//		if(this.open == true) {
//			this.open = false;
//		} else {
//			this.open = true;
//		}
	}
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
