package goormJava.Main02_08;

import java.util.*;
// addLast 이런 단어들을 보고 유추해야함 (util패키지를 다외울순 없으니,,)
public class main08_02 {
	static class List{
		public static void main(String[] args) {
			// (1)LinkedList : 포인터가 다음위치 가리킴 (그냥 배열이라고 생각하셈 ArrayList보다는 느린)
			LinkedList<Integer> ds= new LinkedList<Integer>();
			// (2) addLast: 뭔가 데이터를 추가하는데 끝에 추가
			ds.addLast(new Integer(10));
			ds.addLast(new Integer(30));
			ds.addLast(new Integer(20)); // 현재 {10,30,20}
			
			// (3),(6),(8) ds가 비어있지 않으면
			while(!ds.isEmpty())
				// (4) ds.removeLast (뒤에 있는걸 지우면서 그 값을 가져온다)
				// (5) 20출력하고 remove시켜라
				// (7) 30출력하고 remove시켜라
				// (9) 10출력하고 remove
				System.out.print(ds.removeLast()+" ");
			// (10) ds가 비어있으니 바깥으로 나오고 끝
			System.out.println();
		}
	}

}
