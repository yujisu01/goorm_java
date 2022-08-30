package goormJava.Main02_09;

public class main09_19 {
	static class Student{
		String id;
		String name;
		static int count=0;		// static 으로 선언한 count
		
		Student(String id, String name){
			this.id=id;
			this.name=name;
			this.count++;
		}
		
		public void print() {
			System.out.println(this.id+":"+this.name+":"+count);
		}
	}
	public static void main(String[] args) {
		Student st1= new Student("001", "선우지수");
		Student st2= new Student("002", "남궁지수");
		st1.print();
		st2.print();
	}
}
// count변수는 static으로 선언했으니 모든 변수에서 공유 ..