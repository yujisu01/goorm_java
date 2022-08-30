package goormJava.Main02_07;

public class main07_05 {
	static class TestException{
		public static void main(String[] args) {
			try {
				// 산술오류 발생 
				int avg=10/0;
				System.out.println("avg:"+avg);
			} catch (NumberFormatException e) {
				System.out.println("숫자변환 예외발생");
			} catch (ArithmeticException e) {
				System.out.println("산술연산 예외발생");
			} catch(Exception e) {
				System.out.println("예외발생");
			}finally {
				System.out.println("예외처리 완료");
			}
		}
	}
}
