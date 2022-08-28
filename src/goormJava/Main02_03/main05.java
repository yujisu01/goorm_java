package goormJava.Main02_03;
/*
 * Q 05. 다음 자바코드를 컴파일 할때, 문법 오류가 발생하는 부분은?
 * 
 * */
public class main05 {
static class Parent{
	protected int a=1000;
	public int fun1() {
		return a;
	}
}
static class Child extends Parent{
	private int b=5;
	public int fun2() {
		return a/b;
	}
}

	public static void main(String[] args) {
		Child c1= new Child();
		Parent p1= new Child();
		// c1은 Parent 상속받았으니, Parent 사용 가능함
		System.out.println(c1.fun1());	// ㄱ
		System.out.println(c1.fun2());	// ㄴ
		// 지꺼 지가씀
		System.out.println(p1.fun1());	// ㄷ
		// 아들래미꺼 못씀. fun2() 못씀 (주석처리)
		//System.out.println(p1.fun2());	// ㄹ
	}
}
