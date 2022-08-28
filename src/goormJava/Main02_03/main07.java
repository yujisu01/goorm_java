package goormJava.Main02_03;

class A{
	A(){
		// (3) 부모를 명시적으로 호출하지 않으면 부모가 갖고있는 디폴트 생성자 생성
		//  10 출력
		System.out.printf("%d,",10);
	}
}
class B extends A{
	B(int a){
		// (4) 아까 100받았으니 100출력
		System.out.printf("%d,",a);
	}
}
class C extends B{
	// (2) a=1000이라는값 대입
	C(int a){
		// 생성자는 부모부터 타게되는데, 
		// 자식에서 super라고 명시되있으면, 부모의 인자있는 생성자를 호출
		// (a/10=)100이라는 값을 아버지의 생성자로 보냄
		// (B로 보냄-> 할아버지 호출하는거 없어도 무조건 할아버지부터 타게되있음->할아버지 인자없는 생성자 호출 (A이동))
		super(a/10);
		// 1000출력
		System.out.printf("%d",a);
	}
}
public class main07 {
	public static void main(String[] args) {
		// (1) C의 생성자에 1000이라는 값이 대입
		A A= new C(1000);
	}
}


