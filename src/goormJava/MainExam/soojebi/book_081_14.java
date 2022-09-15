package goormJava.MainExam.soojebi;

public class book_081_14 {
	static public class Parent{
		String className="Parent Class";
		public void info() {
			System.out.println(className);
		}
	}
	static public class Child extends Parent{
		String className="Child Class";
		public void info() {
			super.info();
			System.out.println(className);
		}
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.info();
	}
}
