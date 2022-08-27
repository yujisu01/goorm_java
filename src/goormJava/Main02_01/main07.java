package goormJava.Main02_01;

public class main07 {
	// (1) 멤버변수로 private a가 있음. a라는 멤버변수만 인스턴스에 그려주면 됨
	// set, add, print 이런 메서드 존재함.
	private int a;
	public void set(int a) {
		this.a=a;
	}
	public void add(int d) {
		a+= d;
	}
	public void print() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// p는 a라는 멤버변수가 있음. new는 메모리에 할당 했기때문에 메모리상에 a가 존재함
		main07 p = new main07();
		// q라는 변수를 만듬. 얘는 a가 없음. (new로 선언안했으므로)
		main07 q;
		// 여기에 10값을 받아서, set에 10값 넣음
		p.set(10);
		q=p;
		// p가 가지고 있는 add함수를 보면, a=a+d
		// 인자로 10 넘김
		// 내가 현재 갖고있는 10값에 + 10 =20
		p.add(10);
		// q에 set(30)함. 원래 할당되어 있던 값 20 상쇄, 30넣음.
		// 현재 인스턴스값 30
		q.set(30);
		// p값 출력
		p.print();
	}
}
