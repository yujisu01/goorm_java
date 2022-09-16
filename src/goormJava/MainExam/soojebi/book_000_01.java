package goormJava.MainExam.soojebi;
// 수제비 카페에서 본 문제
// https://cafe.naver.com/soojebi/129515
public class book_000_01 {
	static class Parent{
		public Parent() {System.out.println("a");}
		public void fn() {System.out.println("b");}
		public void fnA() {System.out.println("c");}
	}
	static class Child extends Parent{
		public Child() {System.out.println("d");}
		public void fn() {System.out.println("e");}
		public void fnB() {System.out.println("f");}
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.fn();
		c.fnA();
	}

}
// 상속관계임. child에서 부모꺼 호출안했어도 묵시적으로 부모꺼 먼저 감
// Parent() 디폴트 메서드 이동 해서 a 출력-> Child() 가서 d출력
// 메인함수에서 호출한 c.fn() 가서 e 출력-> c.fnA() 가서 c 출력