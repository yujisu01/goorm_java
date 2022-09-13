package goormJava.MainExam.sinagong.forwenti;

public class book_276_37 {
	public static void main(String[] args) {
		int numAry[]= {0,0,0,0,3};
		int i,j;
		for(j=4;j>=0;--j) 
			for(i=4;i>j;--i)
				numAry[j]+=numAry[i];
		for(j=0;j<5;++j) 
			System.out.printf("%d ",numAry[j]);
		
	}
}
// 배열의 번지수 찾아주는 문제
// 2개 for문 돌아감. 
// num[4]번인덱스에만 값 들어가있음. 얘 기준으로 0,1,2,3 넣어주기