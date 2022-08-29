package goormJava.Main02_06;
/*
 * Q 08.
 * 다음 자바코드는 컴파일 오류가 발생한다. 원인에 대해서 약술하시오.
 * 
 */
public interface main06_08 {
	// (1) 이 단락에서는 오류 발생 X
	interface interfaceA{
		public void up();
		public void down();
		public void left();
	}
	// 인터페이스를 가져간 클래스는 여기 있는 모든 메서드를 사용해야 하는데, left()메서드 사용을 안함.
	 class AB implements interfaceA{
		int value=0;
		public void up() { value++; }
		public void down() { value--; }
		public void left() {};  		// 얘가 원래 없었음
		
		public static void main(String[] args) {
			AB ab= new AB();
			ab.up();
			ab.down();
		}
	}
}

// 정답
// : AB클래스에서 left() 메서드를 구현하지 않았기 때문에 오류발생