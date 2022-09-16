package goormJava.MainExam.soojebi;
// https://cafe.naver.com/soojebi/129515
	class A{ 
	private String s; 
	A(){System.out.println("null");}
	A(String S){ this.s=s+"A"; }
	public void fn(String s) { System.out.println(this.s+s);}
  }
	 class B extends A{
		private String s;
		B(String s){ this.s=s+"B"; }
		public void fn(String s) { System.out.println(this.s+s);}
	}
public class book_000_02 {
	public static void main(String[] args) {
		A a=new B("Hello");
		a.fn("Hi");
	}
}
