package goormJava.MainExam.book;

public class book06_284_18 {
	static class Person{
		String name;
		public Person(String n) {name=n; 
		//System.out.println(name+"입니다.");		// 출력문이 Person(String n) 메서드엔 없응게 그냥 넘어가는거 만약 있었으면 이것도 출력됨
		}
		public void who() {System.out.println(name+"입니다.");}
	}
	static class Student extends Person{
		String school;
		public Student(String n, String s) {
			super(n);
			school=s;
			}
		public void who() {System.out.println(school+"학교에 다니는"+name+"입니다.");}
	}
	public static void main(String[] args) {
		Person obj=new Student("유지수","조선대");
		obj.who();
	}
}
