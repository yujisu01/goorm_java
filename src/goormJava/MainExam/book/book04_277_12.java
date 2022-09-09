package goormJava.MainExam.book;

public class book04_277_12 {
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
	public static void main(String[] args) {
		A obj=new C();
		obj.f();
		obj.g();
		System.out.println();
		B obj1=new C();
		obj1.f();
		obj1.g();
	}
		
}

// 1. 오버라이딩 형태로 생성된것을 볼수있고, g()는 static형식으로 선언되었다
// 2. 메인부터 보면, 
//		A 형태로 C()를 생성했다.
// 3. obj.f()는 C클래스에서 오버라이딩 됐기 떄문에 '5' 를 출력하고, obj.g()는 static 으로 선언됐기 때문에, A클래스의 g()를 출력한다. '2'
// 4. B 형태로 C()를 생성했다.
// 5. obj1.f()는 C클래스에서 오버라이딩 됐기 때문에 '5'를 출력하고, obj1.g()는 static으로 선언됐기 때문에, B클래스의 g()를 출력한다. '4'
// * static은 어떤 형태로 만들어졌는지 확인해야함. 