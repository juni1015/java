package day8;

public class User {
	private String name;
	private String id;
	private String pw;
	
	public User() {
		
	}
	public User(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return this.pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\n", name, id, pw);
	}

}
