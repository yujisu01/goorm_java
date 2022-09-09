package goormJava.MainExam.book;
import java.util.*;
public class book08_313_03 {
	public static void main(String[] args) {
		LinkedList<Integer> my= new LinkedList<Integer>();
		my.addFirst(new Integer(10));
		my.addFirst(new Integer(20));
		my.addFirst(new Integer(40));
		while(!my.isEmpty()) {
			Integer num=my.removeFirst();
			System.out.printf("%d ",num);
		}
	}
}
// 스택 비울때까지 출력하라. 
// removeFirst는 삭제된것 부터 출력하라는 뜻. 그래서 출력은 40 20 10 이렇게 되야한다