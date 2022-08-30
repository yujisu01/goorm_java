package goormJava.Main02_09;
import java.io.*;

public class main09_16 {
	static class Triangular{
		public static void main(String[] args) {
			int value = tri(5);
			System.out.println("결과="+value);
		}
		public static int tri(int n) {
			if(n==1) return 1;
			else 	return (n+tri(n-1));	// 재귀함수 
		}
	}

}

// 5+tri(4) 
// 4+tri(3)
// 3+tri(2)
// 2+tri(1)
/* 돌려돌려돌림판 */
// 2+1=3
// 3+3=6
// 4+6=10
// 5+10=15 
