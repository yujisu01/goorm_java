package goormJava.MainExam.sinagong.forwenti;

public class book_269_22 {
	public static void main(String[] args) {
		int i,hap=0;
		for(i=0;i<10;++i,hap+=i);
		System.out.printf("%d,%d\n",i,hap);
	}
}

// 이거 for문도 ; 있으니까 마지막 실행결과만 출력
// < > : i의 최대값까지 출력. i는 10까지 돌아야 for문 탈출
// for(1;2;3) -> 1,2 for문 돌고, 3에서 ++ 하고 첨엔 연산안하고 
// 				그 담부터 돔
// for문 연산 마지막까지 하고 출력