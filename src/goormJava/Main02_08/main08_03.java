package goormJava.Main02_08;
import java.util.*;

public class main08_03 {
	static class ListTest{
		public static void main(String[] args) {
			LinkedList<Integer> myLL = new LinkedList<Integer>();
			// (1) addFirst은 앞에다 넣어라
			// (2) {30,20,10}
			myLL.addFirst(new Integer(10));
			myLL.addFirst(new Integer(20));
			myLL.addFirst(new Integer(30));
			
			// (3) myLL이 비어있지 않으면..
			while (!myLL.isEmpty()) {
				// (4) myLL의 앞에 있는값 출력하고 삭제 
				Integer num= myLL.removeFirst();
				System.out.printf("%d ",num);
			}
		}
	}
}
