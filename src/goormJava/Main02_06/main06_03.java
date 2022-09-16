package goormJava.Main02_06;
/*
 * 
 * Q 03.
 * 다음 자바코드를 컴파일 할때, 문법 오류가 발생하는 부분은?
 * 
 * */
	abstract class Person{
		public int age;
		abstract public void setAge(int age);
		public String toString() {
			return("age:"+this.age);
		}
	}
  class Student extends Person{
		public void setAge(int age) {
			this.age=age;
		}
   }
  public class main06_03 {
	public static void main(String[] args) {
		// abstract 클래스는 그 안에 추상메서드를 포함할수 있다. 얘는 생성을 시킬수 없다 (new못함)
		// 추상클래스를 인스턴스화 할경우 발생하는 오류이다.
		//Person a=new Person();	// ㄱ  -- 얘가 오류 발생해서 일단 주석처리함 
		Person b=new Student();	// ㄴ
		b.setAge(27);			// ㄷ
		System.out.println(b);	// ㄹ
		}
	}
