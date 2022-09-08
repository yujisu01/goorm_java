package goormJava.MainExam;

import goormJava.MainExam.exam01_2202_17.conv;

public class exam07_2202_17 {
	static public class conv{
		public conv(int a) {
			this.a=a;} //3
		
		int func() {
			int b=1;
			for(int i=1; i<a; i++) {
				b= a*i+b;
				//System.out.println("i="+i+",a="+a+",b="+b);
			}
			int c= a+b;
			//System.out.println("a+b="+c);
			return c;	// 아아아아악 리턴값잘봐 리턴값!!! c를 리턴했어야지!
			}
		int a;
		}
		public static void main(String[] args) {
			conv obj= new conv(3);
			obj.a=5;
			int b=obj.func();
			//System.out.println("obj.a="+obj.a);
			System.out.println(obj.a+b);
		}
}
// 그래도 풀수는 있는문제임 
