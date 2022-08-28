package goormJava.Main02_03;

public class main12 {
	static class Parent{
		int age=43;
		String name="유지수";
		// (3) 출력
		public Parent() {
			System.out.println("부모의 디폴트생성자");
		}
		public Parent(int age, String name) {
			this.age=age;
			this.name=name;
			System.out.println("부모의 인자있는 생성자");
		}
		// (6) name(=유지수), age(=43) 출력
		public void print() {
			System.out.println(name+","+age);
		}
	}
	// (2) 상속받았으니, Parent의 디폴트 생성자 호출
	static class Child extends Parent{
	 // (02) 이렇게 하면 오류나므로 주석처리 하고 인자 없는채로 진행 
	 // public Child(int age, String name) {
		public Child() {
		// (4)
		System.out.println("자식생성자");
		}
		// 오류 발생하기 때문에 하단해설 참고
		public static void main(String[] args) {
			// (01) 인자가 없는 생성자인데, 현재 Child는 인자가 있으므로 오류발생
			// (1) child c
			Child c= new Child();
			// (5) 
			c.print(); 
		}
	}
}

