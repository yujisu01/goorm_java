package goormJava.Main02_01;
/* 
 * Q 06.
 * 다음 프로그램의 A3클래스에서 사용할수 있는 객체 변수들로 옳은것만을 모두 고르면?
 *  

public class main06 {
	public int x;
	private int y;
	protected int z;
}
public class A2 extends main06{
	protected int a;
	private int b;
}


// A3는 A2에서도 상속받은거고, main06에서도 상속받은거임 (손자개념)
// main06(그랜파더), A2(파더) 그잡채
// A3는 다 쓸수 있음 (private제외)
// main06에서, public사용가능, protected사용가능(상속 가능이므로)
// A2에서, protected사용가능
// A3에서, 내꺼니까 다 사용가능

public class A3 extends A2{
	private int q;
}

// --> 즉, x,z,a,q 변수 사용가능함 
 * 
 *  */
