package goormJava.Main02_04;

public class main04_05 {
	static class A{
		// (1-1)
		public int add(int a, int b) {return a+b;}
		// (3-1) 리턴할때 (int) 했으므로, int형으로 형변환함 (버림이니까 반올림x)
		public int add(double a, double b) {return (int)(a*b);}
		// (2-1) 리턴할때 (int)(a-b) 했으므로, int형으로 형변환함 (버림이니까 반올림x)
		public int add(float a, float b) {return (int)(a-b);}
	}
	public static void main(String[] args) {
		A a= new A();
		// (1)
		System.out.println(a.add(100, 200));
		// (2) 강제적형변환
		System.out.println(a.add((float)5.7, (float)9.8));
		// (3) 
		System.out.println(a.add(5.7, 9.8));
	}
}
