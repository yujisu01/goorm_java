package goormJava.Main02_06;
/*
 * Q 04.
 * 다음 추상클래스를 정의할때, 문법오류가 발생하는 부분을 모두 고르시오.
 */
public class main06_04 {
	abstract class Person{
		// 멤버변수는 상관없음
		private int age;									// ㄱ
		// 멤버변수는 상관없음
		public String name;									// ㄴ
		// 추상메서드 정의
		abstract public void setAge(int age);				// ㄷ
		// 추상메서드 정의했음
		// {} 중괄호는 본문을 얘기하는거임. 아무것도 하지않은 구현을 해버림.
		// 근데 얘는 추상메서드라서 구현을 하면안됨. 그래서오류발생
		// (1) (주석처리함)
		// abstract public void setName(String name) {};	// ㄹ
		// 추상이 아니니까 얘는 가능함
		private int getAge() {return this.age;}				// ㅁ
		// 추상메서드 정의했음
		// 추상은 하위에서 구현해야 사용가능한데, (default,protected,public)
		// 얘는 private이라서 내부에서만 사용가능하므로 오류발생
		// (2) (주석처리함)
		// abstract private String getName();				// ㅂ
	}
}

// (1)
// Abstract methods do not specify a body
//  --> 추상메서드는 본문을 지정하지 않으므로,
// 		1.abstract를 지정하지 않거나, 2.{}(중괄호)를 삭제한다.
// (2) 
// The abstract method getName in type Person can only 
// set a visibility modifier, one of public or protected
// 	--> getName() 추상메서드는 public 또는 protected중 하나로 설정할수 있다


