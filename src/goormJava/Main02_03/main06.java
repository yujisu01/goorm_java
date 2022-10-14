package goormJava.Main02_03;

// 이미 Main02_03.main05에 정의해놨으므로, 주석처리함 (문제에는 그대로 출제)

public class main06 {
 static class Parent{
	public int a=1000;
	public int fun1() {
		return a;
	}
}
 static class Child extends Parent{
	public int a=500;
	public int fun2() {
		return a;
	}
}
	public static void main(String[] args) {
	
		Child c1= new Child();
		System.out.print(c1.fun1()+",");
		System.out.print(c1.fun2()+",");
		
		c1.a=300;
		System.out.print(c1.fun1()+",");
		System.out.println(c1.fun2()+",");
		
		Parent p2=new Child();
		p2.a=700;
		System.out.print(p2.a+",");
		
		System.out.print(c1.a);
	}
}

// (1) c1은 Parent상속받음.
// 이때 Parent의 a와, 내가 갖고있는 a 둘다 공존

//Child1의 a(=500)값을 300으로 변경
//c1(child)에 들어있는 현재 a값 출력
