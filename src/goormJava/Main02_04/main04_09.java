package goormJava.Main02_04;
// 메서드 오버라이딩
public class main04_09 {
	static class Parent{
		public void set_name(String param_n) {
			System.out.println("부모이름 변경");
		}
		// (2-1) 부모만 가지고 있으니 (age)
		public void set_age(int param_i) {
			System.out.println("부모나이 변경");
		}
	}
	static class Child extends Parent{
		// (1-1) 출력
		public void set_name(String param_n) {
			System.out.println("자식이름 변경");
		}
		// (3-1) 자식한테만 있으니
		public void set_height(int param_h) {
			System.out.println("자식키 변경");
		}
	}
	public static void main(String[] args) {
		Child c=new Child();
		// (1) 오버라이딩문제 - 자식이 갖고있는걸 출력하게 된다.
		// 	상속관계에서 부모거를 똑같은 형태로 물려받으면, 자식이 재정의한 메서드를 호출함
		c.set_name("홍길동");
		// (2) 
		c.set_age(40);
		// (3) 
		c.set_height(170);
	}

}
