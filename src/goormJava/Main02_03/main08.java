package goormJava.Main02_03;

public class main08 {
	
static class A{
	// (5) A1 얘부터 호출
	A(){
		System.out.println("A0");}
	A(int i){
		System.out.println("A"+i+"");}
}
static class B extends A{
	// (4) A1을 상속받았는데 명시적으로 표시되어 있지 않기떄문에
	// 	  인자가 없는 디폴트생성자 호출
	B(){
		System.out.println("B0");}
	B(int i){
		System.out.println("B"+i+"");}
}
static class C extends B{
	C(){
		System.out.println("C0");}
	// (2) 인자 있는 이걸 호출함
	// (3) super라고 명시적으로 표시되어 있지 않으면,
	//   부모가 갖고있는 인자 없는 디폴트생성자 호출
	C(int i){
		//super(30);
		System.out.println("C"+i+"");}
}

	public static void main(String[] args) {
		// (1) A부터 생성자를 호출
		C b= new C(1000);
	}
}

// 만약 (1)에서 C1 b= new C1(); --인자없는 C1을 호출한다면
// A0 B0 C0 이렇게 출력이된다.

// 만약 C1 에 super(30) 넣어줬으면(25라인) 
// A0 B30 C100 이렇게 출력됨 (인자 있는거)
