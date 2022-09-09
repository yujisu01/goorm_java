package goormJava.MainExam.book;

// 아 이해완 ㅋㅋ
public class book03_247_08 {
	static class Ref{
		int a;
		Ref(int x){
			a=x;
		}
		int sum(Ref obj) {
			int k;
			k=obj.a-a;
			System.out.printf("%d,%d\n",obj.a, a);
			a=10; obj.a=20;
			return k;
		}
	}
	public static void main(String[] args) {
		Ref obj1= new Ref(3);
		Ref obj2= new Ref(4);
		int k1= obj2.sum(obj1);	// obj1의 값=3을 인스턴스로 넘김. k 연산에서 obj.a 값은 3이 되는거임.
		System.out.println("k1="+k1);
		System.out.println("obj1.a="+obj1.a);
		System.out.println("obj2.a="+obj2.a);
	}
}


// 1. Ref클래스의 인스턴스 obj1을 생성하면서, 생성자를 이용해 a에 3값을 대입한다.
// 2. Ref클래스의 인스턴스 obj2를 생성하면서, 생성자을 이용해 a에 4값을 대입한다,
// 3. obj1의 멤버 a에는 3, obj2의 멤버 a에는 4값이 들어가 있음.
// 4. obj2.sum(obj1)을 호출하고, sum함수에서 일어나는 일들을 보면
// 5. k 지역변수를 선언하고, k에 인자로 받은 obj.a의 값. 즉, obj1이 가지고 있는 3값에서, obj2 가 갖고있는 4값을 뺴주고 그값을 k에 대입함.
// 6. 그리고 a=10; 지금 메서드를 호출한 인스턴스 obj2의 a값을 10으로 변경하고,
//		obj.a=20; 인자로 받은 obj1의 a값을 20으로 변경한다. 그러면 아다리가 딱딱 맞겠쥬?
// 7. 그리고 출력 해봐봐 