package goormJava.Main02_05;

public class main05_19 {
	static class Person{
		String name;
		public Person() {name="유지수";};
		public Person(String n) {name=n;}
		public void whoRU() {System.out.println(name+"입니다.");}
	}
	static class Student extends Person{
		String school;
		public Student() { school="조선대";}
		// 부모의 인자없는 디폴트 생성자 호출해서 name값 갖고와서 대입
		public Student(String n,String s) {super(n); school=s;}
		public void whoRU() {System.out.println(school+"학교에 다니는 "+name+"입니다");}
	}
	public static void main(String[] args) {
		Person obj1= new Person();
		obj1.whoRU();
		
		Person obj2= new Student();
		// 자식이 재정의한 whoRU() 메서드 호출
		obj2.whoRU();
	}
}
