package goormJava.Main02_07;

public class main07_08 {
	static class NullClass{
		public String str = "";
	}
	static class Test{
		public static void main(String[] args) {
			try {
				// (1) nCls라는 인스턴스 생성. 이 안에는 str 이라는 멤버변수 존재
				NullClass nCls= new NullClass();
				// (2) nCls에다 null을 넣으니, 연결 끊어짐.
				// 		아무곳도 가리키고 있지 않음(null)
				// if) null 안했으면, str이라는 멤버변수에 Test대입할수 있고, 널포인터 예외 발생안함
				nCls=null;
				nCls.str="Test";
				System.out.println("A");
			// NullPointerException 발생
			} catch (NullPointerException e) {
				System.out.println("B");
			}finally {
				System.out.println("C");
			}
		}
	}
}


