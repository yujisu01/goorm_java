package goormJava.MainExam.sinagong;
// 오버라이딩 문제임

public class book_283_45 {
	static class SuperObject{
		public void paint() {
			draw();
		}
		public void draw() {
			draw();
			System.out.println("super object");
		}
	}
	static class SubObject extends SuperObject{
		public void paint() {
			super.draw();
		}
		public void draw() {
			System.out.println("Sub object");
		}
	}
	public static void main(String[] args) {
		SuperObject a=new SubObject();
		a.paint();
	}

}
// 오버라이딩 문제이다.
// 1. main에서 a의 paint함수로 이동 -> super.draw() 부모꺼 호출함 
// 2. 
