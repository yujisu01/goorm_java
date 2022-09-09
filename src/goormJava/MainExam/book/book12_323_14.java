package goormJava.MainExam.book;

public class book12_323_14 {
	static class papapa{
		public void change(int i, int[] j) {i=20; j[3]=400;}
		public void display(int i, int[] j) {
			System.out.println("i"+i);
			System.out.println("j:"+j);
			for(int k=0; k<j.length; k++)
				System.out.println(j[k]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		papapa pp= new papapa();
		int i=10, j[]= {1,2,3,4};
		pp.change(i, j);
		pp.display(i, j);
	}
}

// 1. 메인부터 보자. i에는 10값, j에는 배열들 들어가 있다.
// 2. pp인스턴스를 생성하고, change메서드를 호출한다. 이때, 인자값은 i=10과, j배열을 넘긴다(100번지)
// 3. change메서드에서, 인자로 넘긴 i값에 20을 넣고, j[3]에 400을 넣는다.  	(i=20, 103번지=400)
// 4. display메서드에서, i값 10을 출력한다 
// 		20을 출력하지 않은이유는, change에서 그 지역변수는 사라졌음. 인자로 넘긴 10값을 찐짜로 출력해줘야 하는거임
// 5. 여튼 i는 그렇다치고, j도 값을 출력해야 되는데 배열에 있던거를 줄줄이 출력해준다.
//		1 2 3 400 이 된다. 왜냐면 아까 change메서드에서 103번지에 400이라는 값을 넣었기 때문에 이렇게 출력해주는게 이게맏따 
