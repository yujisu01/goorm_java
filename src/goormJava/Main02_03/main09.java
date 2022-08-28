package goormJava.Main02_03;

public class main09 {
static class A{
	int a;
	// (4) A(a=10) 
	A(int a){
		this.a=a;
	}
	// (6) a=10 
	void display() {
		System.out.println("a="+a);
	}
}
static class B extends A{
	// (2) B(a=10) 
	B(int a){
		// (3) 부모를 명시적으로 호출하고 있으니, super의 인자있는 생성자 A호출
		super(a);
		// (5) super가 갖고있는 display 메서드 이동
		super.display();
	}
}
	public static void main(String[] args) {
		// (1) B(10) 
		B obj= new B(10); 
	}
}
