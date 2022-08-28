package goormJava.Main02_03;

class Subject1{
	protected int a =1000;
	public int fun1() {
		return a;
	}
}
class Subject2 extends Subject1{
	private int b=5;
	public int fun2() {
		return a/b;
	}
}
public class main04 {
	public static void main(String[] args) {
		// subject1을 상속받았으므로, subject1이 가지고 있는 멤버변수 사용가능함
		Subject2 sub= new Subject2();
		// 부모의 fun1() 호출 (a값)
		System.out.println(sub.fun1());
		// fun2() 호출 (a/b값)
		System.out.println(sub.fun2());
	}
}
