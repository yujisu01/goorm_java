package goormJava.MainExam.mypage;

//  테스트커버리지중 '조건커버리지'
public class main02_24_testCase {
	public main02_24_testCase() {
		int x=0, y=0;
		//  2번    3번
		if(x>0 && y<0) {		//1번
			System.out.println("process");
		}
	}

}

// 결정포인트내 모든개별조건식에 대해 수행하는 테스트커버리지
// 조건커버리지는 if문 봄. x>0, y<0 두개의 조건(2번,3번) 있음
// x>0   y<0
//  T 	 F
//  F 	 T

// 개별조건식이 각각 true,false가 나와야함


// 결정포인트내 모든 분기문에 대해 수행하는 테스트 커버리지
// 결정커버리지는 1번 전체 if문 식을 봄
// 저 식에서 결정포인트가 true, false가 나오면됨.
// x>0    y<0	결정포인트
//  T      T		T
//  T      F 		F