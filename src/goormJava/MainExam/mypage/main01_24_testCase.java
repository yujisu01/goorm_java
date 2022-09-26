package goormJava.MainExam.mypage;

//테스트커버리지중 '구문커버리지'

public class main01_24_testCase {
	public main01_24_testCase() {
		int x=0;
		System.out.println("start");		//1
		if(x>0) {							//2
			System.out.println("process");	//3
		}
		System.out.println("end");			//4
	}

}


//  -> 코드 구조 내 모든 구문 한번이상 하는 테스트커비리지(라인수 수행)1
// 		x의 값이 -1일때, 3번은 수행 x
// 		따라서, (3/4)*100=75%수행