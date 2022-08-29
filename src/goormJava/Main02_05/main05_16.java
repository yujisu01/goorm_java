package goormJava.Main02_05;

public class main05_16 {
	static class X{
		int i;
		// X의 생성자
		X(){ i=10; }
		void print() {System.out.print(i+",");}
	}
	static class Y extends X{
		int i=15;
		int j=10;
		// (3) Y의 생성자가 없음. 그러면 부모의 인자없는 생성자를 타게됨 
		Y(){ j=20; }
		void print() {System.out.print(j+",");}
		void superprint() {super.print();}
	}
	static class Z extends Y{
		int k;
		Z(){ 
			// (2) super()했으니, Y 봐야됨
			super(); 
			k=30; }
		void print() {System.out.print(k+",");}
		void test() {
			print();
			super.superprint();
			System.out.print(super.j+",");
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// (1) Z봐야됨
		Z z= new Z();
		z.test();
	}
}
// 디버그 찍기
// (1) void test() 를 탐-> print() 메서드는 일단 본인꺼 k값 출력 (=30)
// (2) super.superprint()는 Y꺼 봄-> super.print()타니까 X꺼 봄. i값 출력(=10)
// (3) 출력문(super.j)은 Y()꺼의 j밖에 없으니까 j값 출력 (=20)
// (4) 출력문(i)는 아버지꺼 (상속받은,제일근접한) i값 출력 (=15)



