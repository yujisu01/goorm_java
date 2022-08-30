package goormJava.Main02_07;
/*
 * Q 08.
 *  다음 자바 프로그램 실행시 출력되는 문자를 순서대로 쓰시오
 * 
 */
public class main07_02 {
	static class ExceptionTest{
		ExceptionTest(){
			try {
				// (1) 
				// (2-1) method()에서 예외 발생했기 떄문에 더이상 수행못함, catch문으로 빠짐
				method();
				System.out.println("A");
				// (3) 출력
			} catch (Exception e) {
				System.out.println("B");
			}
			// (4) catch끝났으니 finally이동 (finally는 무조건 수행함)
			finally {
				System.out.println("C");
			}
			// (5)
			System.out.println("D");
		}
		// (2) throw : 예외를 만들어서 나를 호출한 곳으로 던지면됨 ((1)로 던짐)
		void method() throws Exception{
			throw new Exception();
		}
		public static void main(String[] args) {
			ExceptionTest t=new ExceptionTest();
		}
	}
}
