package goormJava.MainExam.QnA;
//2022년 1호 정보처리기사 필기- 연산자 우선순위 문제임 ㅋㅋ
public class qna04_operatorPrecedenc {
	public static void main(String[] args) {
	int a=1;
	int b=2;

	boolean c;
	c = a < b + 2 && a<<1 <= b;
	System.out.println(c);
	}
}

// boolean이면 true로 출력

//해설
//	&&를 기준으로 참거짓 판별 문제
//	좌: a<b+2 ====> 덧셈뺼셈부터 조져야됨. b+2 = 4임
//									a가 b보다 작냐? 1 (=true)
//	우: a<<1<=b ===> 0001 에서 0010 됨. 2 <= b
//									 2가 b보다 작냐? 1 (=true) (2<=2)
//	1 && 1 ====> 
	
	//정답은 1 임 