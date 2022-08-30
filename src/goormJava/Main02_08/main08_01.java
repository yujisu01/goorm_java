package goormJava.Main02_08;
// java패키지의 util패키지안에 모든 것들을 다 import해라
import java.util.*;

public class main08_01 {
	static class Viest{
		public static void main(String[] args) {
			Vector v1= new Vector();
			Vector v2= new Vector();
			v1.addElement("java_book");
			v2.addElement("java_book");
			// v1과 v2에 들어가있는 내용이 같냐 (true: 내용 동일)
			System.out.println(v1.equals(v2));
			// v1과 v2가 같냐? (false: 각자 생성된 메모리영역이 다름)
			System.out.println(v1==v2);
		}
	}
}
