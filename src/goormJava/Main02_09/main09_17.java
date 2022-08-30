package goormJava.Main02_09;
/*
 * Q 17.
 *  다음 자바프로그램이 실행될때, (ㄱ)에 들어갈 내용은?
 * 
 */
public class main09_17 {
	static class Test{
		public static void main(String[] args) {
			// check(1)은 객체 생성 시키지 않고 인스턴스를 만들지 않았는데, 
			// 사용할수 있는경우는, static한 메서드이기 떄문에 (프로그램이 시작되면 바로 메모리상에 올라가니까)
			System.out.println(check(1));
		}
		static String check(int num) {
	  /*--(ㄱ)--*/
			return (num>=0)?"positive":"negative";
		}
	}
}
// 정답은 static 
// (눈치로 맞춤;)