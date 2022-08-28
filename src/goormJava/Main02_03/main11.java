package goormJava.Main02_03;

public class main11 {
	static class Super{
		// (7) 'A'출력
		Super(){
			System.out.print('A');
		}
		// (2) 'C' 출력---s1 출력 끝 
		Super(char x){
			System.out.print((x));
		}
	}
	static class Sub extends Super{
		// (6) 부모가 갖고있는 인자없는 생성자로 이동
		Sub(){
			super();
			// (8) 'B'출력
			System.out.print('B');
		}
		// (4) 여기로 이동
		Sub(char x){
			// (5) this는 일단 인자없는생성자로 이동.
			this();
			// (9) 인자로 받은 'D'출력
			System.out.print(x);
		}
	}
	public static void main(String[] args) {
		// (1)
		Super s1= new Super('C');
		// (3) 
		Super s2= new Sub('D');
	}
}
