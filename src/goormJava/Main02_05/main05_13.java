package goormJava.Main02_05;

public class main05_13 {
	static class ovr1{
		public static void main(String[] args) {
			ovr1 a1=new ovr1();
			ovr2 a2=new ovr2();
			// (1), (2), (3) 출력
			System.out.println(a1.sum(3,2)+a2.sum(3,2));
		}
		// (1-1)
		int sum(int x,int y) {
			return x+y;
		}
	}
	static class ovr2 extends ovr1{
		// (2-1)
		// ovr1 오버라이딩 함 (재정의)
		// x=3, y=2
		// super : 부모로 감 (=ovr1의 sum(x,y)을 호출해라)
		int sum(int x,int y) {
			return x-y + super.sum(x, y);
		}
	}
}

// (1) a1.sum(3,2) = 5
// (2) a2.sum(3,2) 
// (2-1) x-y+super.sum(x,y)  의 값은 1+5 = 6
// (3) 5+6=11

