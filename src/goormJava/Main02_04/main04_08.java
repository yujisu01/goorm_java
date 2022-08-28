package goormJava.Main02_04;
/*
 * Q 08.
 * 출력결과는?
 * 
 * --> 오류 
 */
public class main04_08 {
	 static class A{
		public int add(int a,int b) {return a+b;}
		public int add(double a,double b) {return (int)(a*b);}
		public int add(float a,float b) {return (int)(a-b);}
	}
	 // B는 A를 상속받았으므로, A클래스의 add 메서드(3개) + 지꺼 add 메서드 총 4개갖고있음
	static class B extends A{
		public int add(int a, int b, int c) {return a+b+c;}
	}
	public static void main(String[] args) {
		A a=new B();
	  // 인자가 3개니까 B를 가야하는데, 오류가 남. (이게 정답 일단 주석처리함)
	 // System.out.println(a.add(100,200,300));
		System.out.println(a.add(30, 200));
	}
}

// 아버지형태로 (A) 날라왔을때, 아버지가 가지고 있는것만 사용할수 있다
// 부모가 갖고있는것은 (int, double, float) 이 형태로 생성한것들임.
// 자식이 갖고있는 형태는 사용할수 없음 (인자 3개인거) --> 그래서 오류발생

// 즉, 부모가 갖고있는 메서드만 사용할수 있다.

// 오버라이딩 한다면, 부모형태로 날라왔어도 오버라이딩한것을 사용함
// static 사용해서 오버라이딩 한다면, 자기껄 보게됨 (부모꺼 안보고)
