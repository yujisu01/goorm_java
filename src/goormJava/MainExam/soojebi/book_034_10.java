package goormJava.MainExam.soojebi;

import java.util.Random;

public class book_034_10 {
	public static void main(String[] args) {
		Random rand =new Random();
		rand.setSeed(System.currentTimeMillis());
		int hist[]= {0,};
		int n,i=0;
		do {
			i++;
			//n = rand()%6+1;
			hist[i-1]+=1;
		}
		while(i<10);
		for(i=0;i<6;i++)
			System.out.printf("h[%d]=%d\n",i,hist[i]);
	}

// c언어 코드 자바로 바꿔서 돌려볼라 했는데 모르겠다 ㅋㅋ 
// 근데 c언어의 srand(time(NULL)) 선언은
// 자바에서 rand.setSeed(System.currentTimeMills()) 로 해주면됨. 
// 고정된 값없이 난수발생시키는 함수 

}
