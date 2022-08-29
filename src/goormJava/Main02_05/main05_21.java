package goormJava.Main02_05;

public class main05_21 {
	static class classP{
		int func1(int a,int b) {return (a+b);}
		int func2(int a,int b) {return (a-b);}
		int func3(int a,int b) {return (a*b);}
	}
	static public class classA extends classP{
		int func1(int a,int b) {return (a%b);}
		double func2(double a,double b) {return (a*b);}
		int func3(int a,int b) {return (a/b);}
	}
	public static void main(String[] args) {
		classP p= new classA();
		System.out.println(p.func1(5, 2)+","+p.func2(5, 2)+","+p.func3(5, 2));
	}

}
// (1) func1()은 오버라이딩이므로 classA 의 값 리턴 = (5%2=1)
// (2) func2()는 오버로딩이므로 classP의 값 리턴 = (5-2=3)
// (3) func3()은 오버라이딩이므로 classA의 값 리턴 = (5/2=2)

// 출력시 형변환 주의 (int,double..)