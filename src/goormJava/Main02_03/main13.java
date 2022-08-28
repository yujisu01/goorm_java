package goormJava.Main02_03;

public class main13 {
	static class A{
		int a=10;
		// (2-1) 여기
		// (4-1) 여기
		public A() {
			System.out.println("가");
		}
		public A(int x) {
			System.out.println("나");
		}
		public static void main(String[] args) {
			// (1) B의 디폴트생성자 이동
			B b1=new B();
			// (3) B의 인자값있는 생성자 이동
			A b2=new B(1);
			// (5) b1은 자식(B), b2는 아버지형태(A)니까 20+10=30
			System.out.println(b1.a+b2.a);
		}
	}
	static class B extends A{
		int a=20;
		
		// (2) '다' 출력? 하기 전에, 상속받은 부모님 A디폴트 생성자 출력
		public B() {
			System.out.println("다");
		}
		// (4) '라'출력 하기전에, 상속받은 부모님 A디폴트 생성자 출력(명시안헀으므로)
		public B(int x) {
			System.out.println("라");
		}
	}

}
