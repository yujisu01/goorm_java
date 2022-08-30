package goormJava.Main02_08;

public class main08_07 {
	static class Test{
		public static void main(String[] args) {
			int a=101;
			System.out.println((a>>2)<<3);
		}
	}
}
// (1) 64 32 16 8 4 2 1
// 	   1  1  0  0 1 0 1   -> 101을 2진수로

// (2) a>>2
// 	 1 1 0 0 1   		  -> 뒤에꺼 2개 걍 뻄

// (3) <<3 
// 	 1 1 0 0 1 0 0 0 	  -> 뒤애 3개 걍 붙임

// (4) 200출력