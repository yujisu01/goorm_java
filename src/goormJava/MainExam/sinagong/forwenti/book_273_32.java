package goormJava.MainExam.sinagong.forwenti;

public class book_273_32 {
	public static void main(String[] args) {
		int i=0, hap=0;
		for(i=1;i<=5; ++i,hap+=i) {
			System.out.printf("합은%d%4d입니다\n",hap,i);
		}
	}
}
// for문 ; (바깥출력) 일때 i>5 : 최댓값까지 
// for문 ; (바깥출력) 일때 i>=5 : 최댓값+1까지

// for문 {} 일때 i>5 : 최댓값-1까지 출력
// for문 {} 일때 i>=5 : 최댓값까지 

// 짜증나는 for문일때
// (1) i값은 for문의 i, hap값은 default(주로 0)으로 시작
// (2) 그리고 i는 ++되서 연산 시작 