package goormJava.Main02_03;

public class main10 {
	static class A{
		int a;
		// (3) 인자없는(디폴트)생성자로 이동함. a=1 대입
		A(){
			this.a=1;
		}
		// (4) 그다음, super의 display 메서드 이동 
		//  a=1
		void display() {
			System.out.println("a="+a);}
	}
	static class B extends A{
		// (2) 부모의 메서드를 호출한거지, 생성자는 호출하지 않았다.
		//  따라서, 부모의 인자없는 생성자로 이동.
		B(int a){
			super.display();}
	}
	public static void main(String[] args) {
		// (1) B(10) 이동
		B obj=new B(10);
	}

}
// 즉, B(10)이라는 인자값을 가지고, B라는 클래스에서 생성자를 호출
// -> super.display라는 메서드 호출
// 근데 생성자는 부모부터 타야되는데 명시적으로 하지 않은것이니
// 인자없는 디폴트 생성자인 A() 호출하고-> super.display() 하게됨