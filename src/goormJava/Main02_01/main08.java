package goormJava.Main02_01;
// 이런문제 나오면 실수 할수 있으니 그림 그리는거 중요함
class Ref{
	int a;
	Ref(int x){
		a=x;
	}
	int sum(Ref obj) {
		int k;
			// (4) obj.a는 인자로 받은 값 =3
			//   	a는 obj2가 호출을 했으니 =4
		k=obj.a - a;
			// (5) obj2로 호출을 했으니 여기 a에 10값 대입
		a=10;
			// (6) 인자로 받은 obj1값에 20 넣음
		obj.a=20;
		
		return k;
	}
}
public class main08 {
	public static void main(String[] args) {
			// (1) Ref라는 클래스를 이용해서 obj1 인스턴스 생성
			// Ref가 갖고있는 멤버변수에 값을 대입(생성자가) 그래서 3값 대입
		Ref obj1= new Ref(3);
			// (2) Ref에 4값 대입
		Ref obj2= new Ref(4);
			// (3) k1이라는 변수생성 
			// obj2를 가지고 sum이라는 메서드를 호출하는데,
			// obj1이라는 인자를 받았음.
		int k1=obj2.sum(obj1);
		System.out.println("k1="+k1);
		System.out.println("obj1.a="+obj1.a);
		System.out.println("obj2.a="+obj2.a);
	}
}
