package goormJava.MainExam.book;

public class book13_329_20 {
	public static void main(String[] args) {
		System.out.println(3+4+5);
		System.out.println("3"+4+5);
		System.out.println(3+4+"5");		// 문자열 만나기전까진 앞숫자들 연산 
		System.out.println(3+4+"5"+6+7); 	// 문자열 "5"를 만나니까 뒤에 숫자들도 문자열로 바뀜요
	}
}
