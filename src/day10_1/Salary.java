package day10_1;

public abstract class Salary {
	int salary;
	
	public abstract void tax();

}

class 정규직 extends Salary {

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double tax = salary * 0.1;
		System.out.println("정규직 세금은 : " + tax);
	}
}
class 계약직 extends Salary {

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double tax = salary * 0.033;
		System.out.println("계약직 세금은 : " + tax);
	}
	
}