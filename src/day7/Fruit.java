package day7;

public class Fruit {
	private String name;
	String color;
	boolean isSeed;		//is 붙으면 맞냐 아니냐
	
	//생성자
	public Fruit() {	//<기본생성자 : 소스코드를 작성하지 않아도 자동으로 생성됨 (매개 변수를 사용하는 생성자가 있으면 자동으로 생성되지 않음)
						//생성자의 특성 (생성자와 메소드가 다른점) : 생성자는 return타입이 없음, 생성자는 class이름과 동일한 이름을 가짐	 
	}					//생성자는 객체를 생성할 때 데이터를 넣어줌
	public Fruit(String name, String color, boolean isSeed) {	//보통 필드의 값을 집어넣음과 동시에 객체를 생성하고 싶을 때 생성자 사용함
		System.out.println("생성자 1");							//매개 변수를 사용하는 생성자가 있으면 기본생성자도 작성해줘야 사용 가능
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	//오버로딩 : 아래와 같이 매개변수가 다른 경우(순서포함)에는 생성자의 이름을 동일하게 사용할 수 있음
	//		   (매개 변수를 다르게 하는 생성자를 여러개 선언하는 것)
	public Fruit(String name, String color) {
		System.out.println("생성자 2");
		this.name = name;
		this.color = color;
	}
	public Fruit(String color, boolean isSeed, String name) {
		System.out.println("생성자 3");
		this.name = name;
		this.isSeed = isSeed;
		this.color = color;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
