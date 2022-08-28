package goormJava.Main02_04;

public class main04_03 {
	static class A{
		// (1-2) init(100,10) 으로 호출
		public int init(int a, int b) {
		// (1-3) 리턴값
			return a+b;
		}
		// (1-1) 찾아감
		public int init(int a) {
		// 	인자 두개(a(=100),10) 를 가지고 메서드를 호출 하겠다.
			return init(a,10);
		}
	}
	public static void main(String[] args) {
		A a=new A();
		// (1) 인자값 한개
		// (2) 최종리턴값 출력
		System.out.println(a.init(100));
	}
}
