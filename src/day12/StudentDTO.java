package day12;

import java.text.DecimalFormat;

public class StudentDTO {
	//하나의 객체(하나의 학생)의 정보를 담아놓기 위한 클래스
	private static int number = 100;
	private static DecimalFormat df = new DecimalFormat("###.##");
	
	private String sno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade;
	
	public StudentDTO() {
		this.sno = "S" + number++;
	}
	
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		this.total = kor + eng + mat;
		this.avg = total / (double)3;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		this.total = kor + eng + mat;
		this.avg = total / (double)3;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		this.total = kor + eng + mat;
		this.avg = total / (double)3;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if(avg >= 90) {
			this.grade = 'A';
		} else if(avg >= 80) {
			this.grade = 'B';
		} else if(avg >= 70) {
			this.grade = 'C';
		} else if(avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}
	
	@Override	//재정의하려면 선언부가 동일해야함 따라서 리턴타입이 있는 메소드를 void로 작성 불가능
	public String toString() {
		String str = sno + " \t " + name + " \t " + kor + " \t " + eng + " \t " + mat + " \t " + total + " \t " + df.format(avg) + " \t " + grade;
		//위의 코드로 오버라이딩(재정의)하지 않으면 기본 toString메소드로 객체의 정보(주소값)를 출력함
		return str;
	}
}
