package goormJava.Main02_07;

public class main07_04 {
	static class TestException{
		public static void main(String[] args) {
			try {
				System.out.print("A ");
				// foo()에서 예외 던진게 없음
				foo();
				System.out.print("B ");
			} catch (Exception e) {
				System.out.print("C ");
			}finally {
				System.out.print("D ");
			}
			System.out.print("E ");
		}
		// foo()함수에서 던진거 없음. 모든예외 다처리했으니 main에서는 할거없음
		public static void foo() throws Exception{
			try {
				System.out.print("F ");
				// 그냥 예외 발생시킴 
				throw new Exception();
			} catch (Exception e) {
				System.out.print("G ");
			}finally {
				System.out.print("H ");
			}
		}
	}
}


// (1) main함수의 try문 출력 --A
// (2) foo() 메서드 이동
// (2-1) foo() 의 try문 출력 --F
// (2-2) foo() 에서 throw new Exception만났으니 catch문 이동 --G
// (2-3) foo() 에서 finally 출력 --H
// (3) foo()의 catch문에서 throw처리 할거 없었으니까 main함수의 try문에서의 두번째 출력문도 출력 --B
// (4) main()에서 try문 예외처리 없었으니까 catch문 출력X, finally 출력 --D
// (5) 마지막 출력 --E


