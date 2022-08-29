package goormJava.Main02_06;

public interface main06_06 {
	interface interfaceA{
		public void up();
		public void down();
	}
	// AB라는 클래스는 인터페이스의 모든 메서드를 다 구현해야 함 (up(), down()) 
	// 그래야 new 선언하고 사용할수가 있음.
	class AB implements interfaceA{
		int value=0;
		// (3-1) 0에서 ++해서 1이됨
		public void up() {value++;}
		public void down() {value--;}
		// (4-1) 현재 ab의 value값은 1
		void printValue() {System.out.println(value);}
	}
	public static void main(String[] args) {
		AB ab= new AB();		// (1)
		interfaceA ia=ab;		// (2) ia=ab 같은곳 참조한다는 이야기
		// (3) ia의 up()메서드 호출
		ia.up();
		// (4)
		ab.printValue();
	}
}
