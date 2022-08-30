package goormJava.Main02_07;

public class main07_07 {
	static class Division{
		public static void main(String[] args) {
			int a,b,result;
			a=3; b=0;
			try {
				// (1) a/b 연산 안되므로 수행못함 (미출력)
				result=a/b;
				System.out.print("A ");
			// (2)
			} catch (ArithmeticException e) {
				System.out.print("B ");
			// (3)
			}finally {
				System.out.print("C ");
			// (4)
			}System.out.print("D");
		}
	}
}
