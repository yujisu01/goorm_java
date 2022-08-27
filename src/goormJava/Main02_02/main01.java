package goormJava.Main02_02;

public class main01 {
	String name;
	int age;
	
	public main01() {
		this.name="사람";
		this.age=2;
	}
	public main01(String name, int age) {
		// (3-1) 인자로 받은 유지수, 28을 집어넣음
		this.name=name;
		this.age=age;
	}
	public void toPrint() {
		System.out.println(this.name+"님의 나이는"+this.age+"살 입니다!");
	}
	public static void main(String[] args) {
		// (1) p1, p2라는 인스턴스가 생성되면서 멤버변수 name, age가 들어가게됨.
		// (2) name에 "사람", age에 1 들어감.
		main01 p1= new main01();
		// (4) p1.toPrint 실행한다.
		p1.toPrint();
		
		// (3) p2가 생성되면서, 유지수와 28 인자 두개를 줌
		//     인자 2개 있는 생성자인것을 찾아간다.
		main01 p2= new main01("유지수",28);
		// (5) p2.toPrint 실행한다.
		p2.toPrint();
	}
}
