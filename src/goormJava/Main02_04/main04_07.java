package goormJava.Main02_04;

public class main04_07 {
	static class Adder{
		public int add(int a,int b) {return a+b;}
		// (2-1)
		public double add(double a, double b) {return a+b;}
	}
	static class Computer extends Adder{
		private int x;
		
		// (1-1)
		public int calc(int a,int b,int c) {
			if(a==1) return add(b,c);
			else return x;
		}
	}
	public static void main(String[] args) {
		Computer c= new Computer();
		// (1) 
		// 	(if, 인자로 넘긴 a값(=1)이 1이 아니라면, x값(=0)을 리턴하게 된다.
		System.out.println("100+200="+c.calc(2, 100, 200));
		// (2)
		System.out.println("5.7+9.8="+c.add(5.7, 9.8));
	}
	
}
