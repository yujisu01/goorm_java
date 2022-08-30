package goormJava.Main02_07;

public class main07_03 {
	static class TestException{
		public static void main(String[] args) {
			try {
				// (1)
				System.out.print("A");
				// (2) Foo()메서드 이동 
				// (8) (6)번에서 throw를 던졌으니, 더이상 다음처리를 수행하지 못하고, catch문으로 이동
				Foo();
				System.out.print("B");
				// (9) 출력
			} catch (Exception e) {
				System.out.print("C");
			}
			// (10) 출력
			System.out.print("D");
		}
		public static void Foo() throws Exception{
			try {
				// (3) 
				System.out.print("E");
				// (4) 그냥 Exception이 발생이 됐다->Exception구문으로 이동
				throw new Exception();  	
			// (5) 정상 출력
			} catch (Exception e) {
				System.out.print("F");
				// (6) 여기에 있는 exception을 던져라. (나를 호출한 공간으로)
				throw e;
			// (7) 무조건 타는곳
			}finally {
				System.out.print("G");
			}
		}
	}
}
