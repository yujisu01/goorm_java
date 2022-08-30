package goormJava.Main02_07;
/*
 * Q 01.
 *  다음 자바프로그램 실행시 출력되는 문자를 순서대로 쓰시오
 */
public class main07_01 {
	static class ExceptionTest{
		ExceptionTest(){
			try {
				// (2)
				method();
				// (4) try에서 예외가 발생안했으니 끝남
				System.out.println("A");
			} catch (Exception e) {
				System.out.println("B");
			}
			// (5) catch 안거침
			 finally {
				System.out.println("C");
			}
			// (6) 
			System.out.println("D");
		}
		// (3) 뭐 실행되는거 없음
		void method() { }
		public static void main(String[] args) {
			// (1) 생성자부터 타게된다.
			ExceptionTest t= new ExceptionTest();
		}
	}
}
