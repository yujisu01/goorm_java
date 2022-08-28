package goormJava.Main02_04;

public class main04_02 {
	static class A{
		// (1-1) 출력
		void f() {System.out.println("0");}
		void f(int i) {System.out.println(i);}
		// (2-1) 출력
		void f(int i, int j) {System.out.println(i+j);}
		
		public static void main(String[] args) {
			A a= new A();
			// (1) 인자 없음
			a.f();
			// (2) 인자 두개
			a.f(25,25);
		}
	}
}
