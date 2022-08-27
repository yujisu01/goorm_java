package goormJava.Main02_01;
/*
 *  Q 04
 *  .다음은 java 프로그램의 일부 코드이다. 
 *  이프로그램을 컴파일 할때 오류가 발생하는 부분을 고르시오
 * 
 */
	class Test{
		private String name="홍길동";
		public int age=0;
		public void setName(String name) {
			// 인자로 받은 name 집어늫음 
			this.name=name;
		}
		public String getName() {
			return this.name;
		}
	}
	public class main04 {
		public static void main(String[] args) {
			// class Test를 가지고 t라는 인스턴스 생성시킴
			Test t = new Test();   //(ㄱ)
			// 현재 메인클래스임, class Test에서 선언한 name:홍길동은
			// private한 클래스이므로, 쟤를 갖다쓰려고 하니 오류 발생 (주석처리함)
			//t.name="유지수";		   //(ㄴ)
			// int age는 public으로 선언했으니 오류 x
			t.age=10;			   //(ㄷ)
			// setName의 접근지정자는 public으로 선언했으니 오류 x
			t.setName("유지수");	   //(ㄹ)
		}
	}


