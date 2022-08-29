package goormJava.Main02_04;

public class main04_10 {
	static class A{
		// (1) static한 메서드는 오버라이딩이 안됨. 
		static void f() {System.out.println("1");}
		// (2) g()는 static선언 안했으니 오버라이딩 가능
		void g() {System.out.println("2");}
	}
	static class B extends A{
		static void f() {System.out.println("3");}
		void g() {System.out.println("4");}
	}
	static class C{
		public static void main(String[] args) {
			// (3) 부모형태로 정의됐을때, A의 f() 를 호출하게 된다 (static 한정)
			A a=new B();
			a.f();
			// (4) a.g()는 오버라이딩 했으니 무조건 자식메서드를 호출하게 된다. (static선언 안했으니)
			// 인자값,형태 다같으면 자식꺼 호출
			a.g();
		}
	}
}

// (1) 오버로딩, 오버라이딩 문제
// (2) main함수에서 인자값,생성자 확인 -> 오버로딩인지 오버라이딩 인지
// (3) 오버로딩일 경우 (메서드명은 똑같고, 인자만 다름), 정의된 함수 확인후 따라가서 출력
// (4) 오버라이딩일 경우(재정의), static 있으면 부모메서드 값 호출
// (4-1) 		 	  , static 없으면 자식메서드 값 호출

// 실수 호출 하면 기본적으로 double형임 (float은 강제적으로 형변환해줘야함)

