package goormJava.Main02_08;

public class main08_08 {
	public static void main(String[] args) {
		System.out.println("5+2="+3+4);		// (1)
		System.out.println("5+2="+(3+4));	// (2)
		System.out.printf("5+2=%d\n",3+4);	// (3)
	}
}


// (1)
// 3도 문자열로 보고, 4도 문자열로 봄 
// +를 보고 문자열을 붙여서 출력해라 라고 인식함
// (2)
// (3+4)는 문자열로 보긴 보는데, 괄호를 묶었으니 연산자 우선순위로 인해 연산하고 그 값을 출력해줌

// (3) 내가 만듬
// 이건 문자열로 안보고 값을 합산해서 출력 