package goormJava.MainExam.sinagong.forwenti;

public class book_272_30 {
	public static void main(String[] args) {
		int a=0, b=10;
		for(a=0;a<5;++a,b-=a) ;
		System.out.printf("a=%d,b=%d\n",a,b);
	}
}
// 문제 보면 for문 ; 있음. 마지막 실행결과만 출력 
// 	(근데 {}중괄호로 for문이면, a<5니까 4까지 출력함. 
//		4까지 출력하고 for문 벗어남)
// < > : 이므로 i의 최댓값까지 출력
// 이런 짜증나는 for문은 
// (1) a=0, b=10  초기값으로 시작
// (2) ++a해서 a=1되고, b=b-a (10-1) = 9됨