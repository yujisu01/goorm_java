package goormJava.Main02_08;
import java.util.*;

public class main08_04 {
	static class StackTest{
		public static void main(String[] args) {
			Stack<Integer> s= new Stack<Integer>();
			s.push(1);
			s.push(2);
			s.pop();
			s.push(3);
			s.push(4);
			s.pop();
			s.push(5);
			while(!s.empty()) {System.out.print(s.pop()+" ");}
		}
	}

}
// 스택 박스 생각 (출입구 한개)
// 1 -> 1,2 -> 1 -> 1,3 -> 1,3,4 -> 1,3 -> 1,3,5 

// print할때 1 3 5   --X 
// s.pop 이니까 5 3 1 
