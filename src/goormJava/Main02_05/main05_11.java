package goormJava.Main02_05;

public class main05_11 {
	static class A{
		public void f() {
			System.out.println("1");}
		public static void g() {
			System.out.println("2");}
	}
	static class B extends A{
		public void f() {
			System.out.println("3");}
	}
	static class C extends B{
		public static void g(){
			System.out.println("4");}
	}
	static class D{
		public static void main(String[] args) {
			// obj라는 인스턴스 만들고, 할아버지형태로 자식메서드 만듬
			A obj=new C();
			
			// (1) 할아버지,아버지 메서드는 f()가 존재함. 
			// 		아버지가 f()메서드를 재정의(오버라이딩)했으니, 아버지함수의 f()메서드 호출함.
			obj.f();
			// (2) obj.g() 호출한다. 내메서드에 g()가 있으니 호출한다 --X
			//  	static선언되어 있으니, A함수의 g()를 호출해야함
			obj.g();
		}
	}
}
