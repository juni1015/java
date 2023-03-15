package day15;

public class StudentDTO {
	private Long id;
	private String studentNumber;
	private String studnetName;
	private String studentMajor;
	private String studentMoblie;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudnetName() {
		return studnetName;
	}
	public void setStudnetName(String studnetName) {
		this.studnetName = studnetName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMoblie() {
		return studentMoblie;
	}
	public void setStudentMoblie(String studentMoblie) {
		this.studentMoblie = studentMoblie;
	}	

	@Override
	//Object 클래스(최상위 클래스)에서 상속 받음
	public String toString() {
		String str = id  + "\t" + studentNumber + "\t" + studnetName + "\t" + studentMajor + "\t" + studentMoblie;
//		String str = studentNumber + "\t" + studnetName + "\t" + studentMajor + "\t" + studentMoblie;
		return str;
	}
}
