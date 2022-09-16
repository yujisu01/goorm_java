package goormJava.MainExam.soojebi;

public class book_130_20 {
	static class Parent{
	void print() {System.out.println("parent");}
}
	static class Child extends Parent{
	Child(){System.out.println("매개변수 없어");}
	Child(String msg){System.out.print(msg);}
	
	void print() {
		new Child("hello");
		System.out.println(" child");
	}
}
	public static void main(String[] args) {
		Parent pa=new Child();
		pa.print();
	}
}
// 오버라이딩 문제
// index02_04.txt 참고
// 상속관계면 부모클래스에서 정의된 메서드를 다시 재정의한다.