package goormJava.MainExam.soojebi;

public class book_130_20_2 {
// Main02_03 - main08.java 문제

static class A{
	A(){
		System.out.println("A0");}
	A(int i){
		System.out.println("A"+i+"");}
}
static class B extends A{
	B(){
		System.out.println("B0");}
	B(int i){
		System.out.println("B"+i+"");}
}
static class C extends B{
	C(){
		System.out.println("C0");}
	C(int i){
		System.out.println("C"+i+"");}
}
	public static void main(String[] args) {
		C b= new C(1000);
	}

}



//만약 (1)에서 C1 b= new C1(); --인자없는 C1을 호출한다면
//A0 B0 C0 이렇게 출력이된다.

//만약 C1 에 super(30) 넣어줬으면(25라인) 
//A0 B30 C100 이렇게 출력됨 (인자 있는거)
