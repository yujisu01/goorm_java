package goormJava.MainExam.sinagong.forwenti;

public class book_271_27 {
	public static void main(String[] args) {
		int i,hap=0;
		for(i=1;i<=10;++i,hap+=i) ;
		System.out.printf("%d,%d\n",i,hap);
		
	}
}
// 이거 for문은 ; 있으니까 마지막 실행결과만 출력
// <= , => 이므로 : i의 최댓값+1까지 출력, i는 i+1까지 돌아야 for문탈출.
// for문 연산 마지막+1까지 하고 출력
