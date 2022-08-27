package goormJava.Main02_02;

public class main03 {
	// 두개의 멤버변수
	String model;
	String color;
	
	// 인자없는 디폴트생성자
	// (5) c2
	public main03() {
		this.model="트럭";
		this.color="black";
		System.out.println("model:"+this.model+",color:"+this.color);
	}
	// 두개의 인자를 받는 생성자
	// (3) c1
	public main03(String model, String color) {
		this.model=model;
		this.color=color;
		System.out.println("model:"+this.model+",color:"+this.color);
	}
	public static void main(String[] args) {
		// (1) 인자 2개받는곳으로 이동
		main03 c1= new main03("승용차","white");
		// (4) 인자 없는곳으로 이동
		main03 c2= new main03();
	}

}
