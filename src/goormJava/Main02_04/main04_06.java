package goormJava.Main02_04;
// 메서드 오버로딩문제
public class main04_06 {
	public static void main(String[] args) {
		int x=1, y=2;
		double m=3.4, n=5.6;
		int[] p= {10,20,30,40};
		
		// (1) m,n 이므로 double형으로 호출 
		System.out.println(sum(m,n)+"");
		// (2) x,y 이므로 int형으로 호출
		// 		(if int, double형이라면, double형(큰그릇)으로 간다)
		System.out.println(sum(x,y)+"");
		// (3) p[] 배열을 넘김 (total 누적산)
		System.out.println(sum(p));
	}
	// static은 생성안시켜도, 프로그램 시작하면 올라가는거 
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	public static int sum(int a[]) {
		int total=0;
		
		for(int i=0; i<a.length; i++)
			total+= a[i];
		
		return total;
	}
}
