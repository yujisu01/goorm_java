package goormJava.Main02_05;

public class main05_12 {
	static class A{
		public void f() {System.out.println("1");}
		public static void g() {System.out.println("2");}
	}
	static class B extends A{
		public void f() {System.out.println("3");}
		public static void g() {System.out.println("4");}
	}
	static class C extends B{
		public void f() {System.out.println("5");}
		public static void g() {System.out.println("6");}
	}
	static class D{
		public static void main(String[] args) {
			// (1) 할아버지형태로 자식(나)메서드 만듬-- 재정의 함 (오버라이딩)
			// 	  C기준에서 최종적으로 재정의 된 "5" 출력이 된다.
			A obj=new C();
			obj.f();
			// (2) A(=할아버지형태)인 g()의 "2" 출력
			obj.g();
			System.out.println("----");
			
			// (3) 아버지형태로 자식(나)메서드 --재정의
			// 	 	C기준에서 최종적으로 재정의 된 "5" 출력이 된다.
			B obj1= new C();
			// (4) B(=아버지형태)의 g() "4" 출력함.
			obj1.f();
			obj1.g();
		}
	}
}
