package day10;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 tv2 = new Tv2();
		tv2.power = true;
		tv2.channel = 10;
		tv2.volum = 20;
		
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumDown();
		tv2.volumDown();
		
		System.out.println(tv2.power + " / " + tv2.channel + " / " + tv2.volum);
		
		Tv tv = new Tv();
		tv.power = false;
		tv.channel = 10;
//		tv.volum = 9; 	//부모는 자식걸 사용할 수 없어서 에러남
	}

}

class Tv {	//부모는 자식거 사용 못함 / 자식은 여러명 있을 수 있음
	boolean power;
	int channel;
	
	public void power() {
		this.power = !power;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
}

class Tv2 extends Tv {	//자식은 부모걸 사용할 수 있음 / 부모는 1명만 선택할 수 있음
	int volum;
	
	public void volumUp() {
		volum++;
	}
	public void volumDown() {
		volum--;
	}
}
