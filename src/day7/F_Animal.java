package day7;

public class F_Animal {

	String test;
	private String name;
	private String sound;
	private int leg;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // 자기 자신의 객체의 네임과 매개변수의 네임을 구분한다.
	}

	public String getSound() {
		return sound;

	}

	public void setSound(String sound) {
		this.sound = sound;

	}

	public int getleg() {
		return leg;

	}

	public void setleg(int leg) {
		this.leg = leg;

	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void ageUp() {
		age += 1;
	}
	
	

	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s하고 웁니다.\n", leg, name, sound);
	}

}
