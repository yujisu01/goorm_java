package goormJava.Main02_08;

// 정보처리기사 2022-2회 실기 기출문제 (17번)
public class exam01 {
	static public class conv{
		public conv(int a) {
			this.a=a;}
		// (3) 여기서 연산 ㄱ
		int func() {
			// (4-1) for문 돌림 (i(=1)부터 ~ a(=5)미만 까지 ((2)에서 obj.a=5대입해서 5임) 
			int b=1;
			for(int i=1; i<a; i++) {
				// (4-2) b값을 구하자
				//  	5*1+1 = 6
				//		5*2+6 = 16 ... 5*3+16= 31....5*4+31 = 51 
				// 		최종 b값= 51이 됨. 여기서 끝 아님
				b= a*i+b;
				System.out.println("i="+i+",a="+a+",b="+b);
			}
			int c= a+b;
			System.out.println("a+b="+c);
			// (5) int c값을 리턴해줘야함
			//		a(=5)+b(=51) 값을 리턴해줘야함.
			return c;
			}
		int a;
		}
		public static void main(String[] args) {
			// (1) conv(3) 인자값 넘김 근데 무용지물각
			conv obj= new conv(3);
			// (2) obj.a=5 가 됐음
			obj.a=5;
			// (3)
			int b=obj.func();
			System.out.println("obj.a="+obj.a);
			// (4) 정답은 obj.a+b만 구하면 되는거
			// (6) func()메서드에서 연산다끝내서, obj.a(=5)+b(=56)값을 출력해주면 끝
			System.out.println(obj.a+b);
		}
	}

