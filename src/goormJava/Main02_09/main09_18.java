package goormJava.Main02_09;

public class main09_18 {
	static class Student{
		int id;
		char name;
		static int count=0;		// count라는 정적변수가 생성이 됨.
		
		Student(){ count++; }
	}
	static class Studenttest{
		public static void main(String[] args) {
			Student man1= new Student();
			Student man2= new Student();
			Student man3= new Student();
			Student man4= new Student();
			// 
			System.out.println(man1.count);
		}
	}

}
// new 열어제낄때마다 Sutdent() 열리면서 count 세게 됨. 몇번 열어제껴서 count셌는지 출력

// man1.count해도, man2.count ,man3.count해도 4를 출력하게됨
// 	이유는, 모두 다 static변수이기 때문에 count를 공유하고 있기 떄문에..