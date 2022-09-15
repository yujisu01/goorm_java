package goormJava.MainExam.soojebi;

 class Parent{
	int a=0;
	Parent(){
		a++;
		System.out.print(a+" ");
	}
}
class Child extends Parent{
	int b=0;
	Child(int a){
		this.b=a;
		System.out.print(a++);
	}
}
public class book_061_20 {
	public static void main(String[] args) {
		Parent pa=new Child(5);
	}

}
