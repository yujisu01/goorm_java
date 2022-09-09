package goormJava.MainExam.book;
import java.util.*;
public class book07_311_01 {
	public static void main(String[] args) {
		Vector v1= new Vector();
		Vector v2= new Vector();
		v1.addElement("java");
		v2.addElement("java");
		System.out.println(v1.equals(v2));
		System.out.println(v1==v2);
		
		System.out.println(System.identityHashCode(v1));		// v1 메모리 주소 
		System.out.println(System.identityHashCode(v2));		// v2 메모리 주소 
	}
}

// v1.equals(v2)는 가지고 있는 값이 똑같으므로 true가 나온다.
// v1==v2가 바라보고 있는 메모리주소값이 같냐? 고 하면 당연히 false가 출력된다.

// 뭔가 더 자세히 알고 싶어서 System.identityHashCode 메소드를 사용해서 객체 자체가 참고하고 있는 고유의 해시코드 주소를 출력하여 비교해봤다
// 당연히 다르게 나온다
