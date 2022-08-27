package goormJava.Main02_01;
/* 
 * Q 05.
 * 다음 자바코드를 컴파일 할때, 문법 오류가 발생하는 부분은?  
 */

	class Person{
		private String name;
		public int age;
		public void setAge(int age) {
			this.age=age;
		}
		public String toString() {
			return("name:"+this.name+",age:"+this.age);
		}
	}
	public class main05 {
		public static void main(String[] args) {
			Person a = new Person();		//(ㄱ)  -- O
			a.setAge(27);				    //(ㄴ)  -- O
			// name을 대입하려 했으나 private 요소로 접근하려 하니 오류발생(주석처리함)
			// (출력되는 조건: public class main05 함수를 전역으로 갔다쓰면 됨)
			// a.name = "Gildong";				//(ㄷ)  -- X
			System.out.println(a);			//(ㄹ)  -- O
		}
	}


