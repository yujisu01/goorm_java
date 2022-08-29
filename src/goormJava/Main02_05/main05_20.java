package goormJava.Main02_05;

public class main05_20 {
	// Foo함수에는 a라는 멤버변수와, addValue(), addFive()메서드 존재
	static class Foo{
		public int a=3;  
		
		public void addValue(int i) {
			// (1-1) a= 3+1 = 4
			a=a+i;
			System.out.println("Foo :"+a+"");
		}
		public void addFive() {
			a=a+5;
			System.out.println("Foo :"+a+"");
		}
	}
	static class Bar extends Foo{
		public int a= 8;
		
		public void addValue(double i) {
			a=a +(int)i;
			System.out.println("Bar :"+a+"");
		}
		public void addFive() {
			// (2-1) a= 8+5 = 13
			a+= 5;
			System.out.println("Bar :"+a+"");
		}
	}
	public static void main(String[] args) {
		Foo f= new Bar();
		// (1) 오버라이딩 한건줄 알고, Bar() 메서드에 인자값 1 집어넣으면 틀림
		// 		이유: 오버라이딩 재정의 하려면, 인자값, 형태까지 다 같아야 함
		// 			Foo()함수의 addValue()에서는 int형이고, Bar()함수의 addValue()는 double형으로 형태가 다름
		// 			따라서 오버로딩 문제이다.
		// 			인자를 정수형으로 1값을 넘겨줬으니 Foo 함수로 이동 
		f.addValue(1);
		// (2) addFive()는 인자가 같으므로 오버라이딩 문제이다.
		// 		따라서, 자식이 가지고 있는 메서드를 호출하게 된다.
		f.addFive();
	}
}
