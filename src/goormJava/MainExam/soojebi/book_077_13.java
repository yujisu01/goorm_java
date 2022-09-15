package goormJava.MainExam.soojebi;

public class book_077_13 {
	static class Parent{
		String name="Parent";
		
		public Parent() {
			System.out.print(this.name);
			}
	static class Child extends Parent{
		public Child(String name) {
			System.out.print(this.name);
			}
	}
	public static void main(String[] args) {
		Child c=new Child("Soojebi");
	//	System.out.println(c.name);
		}
	}
}
// book_077_13_2 참고 (Soojebi는 그냥 Child생성자에서 넘긴 파라미터 이다.
// 찾아가라는 지표가 된다.
// Child(String name) 으로 이동하고, 묵시적으로 Parent() 부모 생성자로 이동
// 여기서 받은 매개변수는 Parent이다.
// Child에서 따로 선언한 매개변수가 없기 떄문에, 부모꺼 에서 받은 Parent를 또 출력해줌

// 수제비에는 해설이 ㅈㄴ짜증나게 나와있어서 직접 돌려봐야 이해가 됨
