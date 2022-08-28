package goormJava.Main02_04;

// 함정문제
public class main04_04 {
	// 인자 수가 같아도, 형태가 다르므로(int,float,double) 오버로딩 가능함
	static class Calculate{
		public int cal(int a, int b) {
			return a-b;
		}
		public float cal(float a, float b) {
			return a-b;
		}
		// (2-1) 여길 타야함
		public double cal(double a, double b) {
			return a+b;
		}
		// (1-1) 인자 3개
		public int cal(int a, int b, int c) {
			return a+b+c;
		}
	}
	public static void main(String[] args) {
		Calculate a= new Calculate();
		// (1) 인자 3개
		System.out.print(a.cal(31, 69, 25)+",");
		// (2) *중요..* 인자 2개에, 실수값인데 float인지 double 탈건지?
		// 		강제적으로 형변환 하지않으면 double로 인식함
		// 		(float을 타게하려면 (float)24.8 이런식으로 강제적형변환 해야함)
		System.out.println(a.cal(24.8 , 5.1));
	}
}
