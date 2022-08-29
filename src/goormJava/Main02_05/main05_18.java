package goormJava.Main02_05;

public class main05_18 {
	static class Person{
		String name;
		
		// (2) name에 "유지수" 들어감 (들어가고 끝)
		public Person(String n) {name= n;}
		// whoRU()(메서드)
		public void whoRU() { System.out.println(name+"입니다."); }
	}
	static class Student extends Person{
		String school;
		
		public Student(String n, String s) {
			// (1) 인자가 하나있는 생성자 Person으로 이동하면
			super(n);
			// (3) school에는 "조선대"들어감
			school=s;
		}
		public void whoRU() {
			System.out.println(school+"학교에 다니는 "+name+"입니다.");
			}
	}
	static class People{
		public static void main(String[] args) {
			// 인자값 두개넘김
			Person obj= new Student("유지수", "조선대");
			// whoRU()메서드는 (아버지,할아버지 메서드에 다있음) 오버라이딩 형태이므로 아버지메서드꺼 출력
			// (3) whoRU() 호출 출력
			obj.whoRU();	  
		}
	}
}
