package goormJava.Main02_05;

public class main05_17 {
	static class A{
		int i;

		public A(int i) {this.i= i;}  // (1-2) B에서 super로 i값(=14) 넘겼으니 현재 14임
		int get() {return i;}
	}
	static class B extends A{
		int i;
		
		public B(int i) {
			super(2*i); 	// (1-2) (X에) 2*7 =14 를 i값으로 넘겨라
			this.i= i; 		// (2-1) 여기에서의 i는 B의 i 임 (인자로 받은 7)
			}		
		int get() {return i;} // (2-2) 인자로 받은 7 값이 i에 들어가 있음
	}
		public static void main(String[] args) {
			A ab= new B(7);
			
			// (1-1) ab.i 구하기
			// (2) ab.get() 구하기 --
			// 2-3) B가 가지고 있는 get() 메서드 출력 (현재 인자로 받은 값 출력)
			System.out.println(ab.i+","+ab.get());
		}

}
