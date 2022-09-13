package goormJava.MainExam.sinagong.forwenti;

public class book_269_21 {
	public static void main(String[] args) {
		int i=0,hap=0;
		do {
			++i;
			hap+=i;
		}while(i<5);
		System.out.printf("%d,%d\n",i,hap);
	}
}

// do ~while문은 do는 무조건 해야됨
// while문 마침표 찍었응께 실행결과 마지막꺼만 출력
// < > : i의 최대값까지 출력함. i는 5까지 돌아야 while문 탈출.
// 		while문 연산도 최대까지 하고 출력