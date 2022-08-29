package goormJava.Main02_06;
/*
 * Q 05.
 *  다음 자바프로그램의 실행결과는? (인터페이스 문제)
 * 
 */
public interface main06_05 {
	interface A{
		int a=2;
	}
	static class B implements A{
		int b;
		// (2-1) b= 인자로 받은 1 * implements한 A의 a값
		B(int i){ b= i*a;}
		// (2-2) b= 2
		int getb() { return b; }
	}
	public static void main(String[] args) {
		// (1)
		int a=3;
		// (2)
		B b1= new B(1);
		System.out.println("b1.getb()="+b1.getb());
	}
}
