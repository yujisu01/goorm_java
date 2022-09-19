package goormJava.MainExam.QnA;

class Account{
	int money=100;
	public void test(int money) {System.out.println(this.money+money);}
}

public class qna02_javaThis {
	public static void main(String[] args) {
		Account a= new Account();
		Account b= new Account();	//추가한거
		a.test(50);
		b.test(70);					//추가한거
	}
}

// 디버그 찍어보면 
// this.money는 해당 클래스에 생성된 money의 값이다.
// money는 인스턴스로 받은 인자값이다. 두개 합하면 됨
// * super는 부모, this는 내꺼임


// Account b를 생성해서 봐보자 170출력됨 
