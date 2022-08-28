package goormJava.Main02_04;

public class main04_01 {
	static class Person{
		String name;
		int age;
		int height;
		
		// (2-1)인자 1개받음 - 여기찾아감
		// 		name = "홍길동"
		public void set_data(String p_name) {
			name=p_name;
		}
		// (5-2)인자 2개받음 - 여기찾아감
		// 		name = "흥달", age= 40
		public void set_data(String p_name, int p_age) {
			name=p_name;
			age=p_age;
		}
		// (3-1) 출력
		// 		현재 값은 name 있음
		// (6-1) 출력
		// 		현재 값은 name,age 있음
		public void print() {
			System.out.println(name+":"+age+","+height);
		}
		public static void main(String[] args) {
			// (1) p1인스턴스안에 멤버변수 확인 (name,age,height)
			Person p1=new Person();
			// (2) 인자 1개넘김
			p1.set_data("홍길동");
			// (3) 
			p1.print();
			
			// (4) p2인스턴스안에 멤버변수 확인 (name,age,height)
			Person p2=new Person();
			// (5) 인자 2개넘김
			p2.set_data("흥달", 40);
			// (6) 
			p2.print();
		}
	}
}
