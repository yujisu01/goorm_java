package goormJava.Main02_01;

/*
 * Q 03. 다음조건으로 클래스를 정의하시오

 1. 클래스명은 Subject로 정의한다.
 2. 국어,영어 멤버변수를 kor,eng로 정수형 변수로 정의한다.
 3. 멤버변수는 외부에서 접근할수 없도록 접근지정자를 지정한다.
 4. 각각의 멤버변수 값을 변경할수 있는 setter, getter 메서드를 만든다
   (변수명은 getKor과같이 정의함)
 5. 멤버변수 값을 출력하는 print메서드를 정의한다. (국어:80, 영어:90)
   (단, 점수가 높은과목을 먼저 출력하도록 한다)
 * 
 * */
public class main03 {
	class Subject{
		private int kor=80;
		private int eng=90;
		
		public void setKor(int kor) {
			this.kor=kor;
		}
		public int getKor() {
			return this.kor;
		}
		public void setEng(int eng) {
			this.eng=eng;
		}
		public int getEng() {
			return this.eng;
		}
		
		public void print() {
			// 정의조건(4번) 에 따른 if문 
			if(this.kor>this.eng) {
				System.out.println("국어:"+this.kor+"영어:"+this.eng);
			}else {
				System.out.println("영어:"+this.eng+"국어:"+this.kor);
			}
		}
	}
}
