package goormJava.MainExam.soojebi;

public class book_032_20 {
	static int Soo(int num) {
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0)
				return 0;
			System.out.printf("num=%d , i=%d\n",num,i);
		}
		System.out.println();
		return 1;
	}
	public static void main(String[] args) {
		int num=10, cnt=0, i;
		for(i=2;i<num;i++)
			cnt+=Soo(i);
		System.out.printf("최종cnt=%d\n",cnt);
	}

}
// 이해 안돼 
// (1) num값이 i로 나눠지는 (즉, i에 2도 포함되는거니까 짝수들을 뜻함) 것들 갯수 세는 문제
// (2) i는 2부터 9까지 돔 
//  	i=2일때 떨어지는거 없으니 1리턴
// 		i=3일때 떨어지는거 없으니 1리턴
// 		i=4일때 2로 떨어지니 0 리턴
// 		i=5일때 2로 떨어지는거 없으니 1리턴
// 		i=6일때 2로 떨어지니 0 리턴
// 		i=7일때 2로 떨어지는거 없으니 1리턴
// 		i=8일때 2로 떨어지니 0 리턴
//  	i=9일때  