package test_code;

public class StudentDTO {
	private static int number = 100;

	private String studentNumber;
	private String studentName;
	private String studentMobile;
	private String studentMajor;

	public StudentDTO() {
		this.studentNumber = "s" + number++;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	@Override
	public String toString() {
//		return "StudentDTO [studentName=" + studentName + ", studentMobile=" + studentMobile + ", studentMajor="
//				+ studentMajor + "]";
		String str = studentNumber + "\t" + studentName + "\t" + studentMobile + "\t" + studentMajor;
		return str;
	}
}
