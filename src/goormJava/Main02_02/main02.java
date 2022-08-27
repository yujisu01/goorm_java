package goormJava.Main02_02;

class Circle{
	private int r;
	// 인자가 없는 디폴트생성자
	public Circle() {
		r=0;
	};
	// 인자가 하나 존재하는 생성자
	public Circle(int a) {
		// (2) r=5
		r=a;
	};
	public double getArea() {
		// (4) 5*5*3.14 연산 값 리턴
		return r*r*3.14;
	}
}
public class main02 {
	public static void main(String[] args) {
		// (1) 인자가 하나 존재하는 생성자로 이동하면서 객체생성
		Circle c= new Circle(5);
		// (3) getArea() 메서드 수행
		System.out.println(c.getArea());
	}
}
