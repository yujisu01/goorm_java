package goormJava.Main02_06;
/*
 * 
 * Q 01.
 * 다음 자바 프로그램이 오류없이 실행되기 위해 밑줄친 부분에 필요한 프로그램 코드는?
 *
 */
//public class main06_01 {
	abstract class main06_01{
		int data=100;
		public abstract void printData();	// 추상메서드 하나 선언함 
	}
	 class Inner{
		 main06_01 test=new main06_01() {
			public void printData() {
				System.out.println(data);
			}
		};
		public static void main(String[] args) {
			Inner inner = new Inner();
			// inner가 가지고 있는 main06_01(=test)의 printData()를 사용해야 한다.
			inner.test.printData();
		 //-----------------------------
		}
	}

