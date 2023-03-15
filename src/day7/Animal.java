package day7;

public class Animal {
	String test;
	private String name;	//같은 클래스에서만 사용할 수 있을 때 private을 사용함
	private String sound;	//외부에서 접근하지 못하게 보호하기 위하여 사용함
	private int leg;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int ageUp() {
		System.out.println("나이 +1");
		return age = age + 1;
	}
	
	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s 웁니다\n", leg, name, sound);
	}

}
