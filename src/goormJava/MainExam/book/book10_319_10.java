package goormJava.MainExam.book;

public class book10_319_10 {
	static void rs(char a[]){
		for(int i=0;i<a.length;i++)
			if(a[i]=='B')
				a[i]='C';
			else if(i==a.length-1)
				a[i]=a[i-1];
	}
	static void pca(char a[]) {
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		char c[]= {'A','B','C','D','A','B','K'};
		rs(c);
		pca(c);
	}
}

// 1. 메인부터 봐서 문자열배열 파악하고, rs메서드부터 봐봄
// 2. rs메서드부터 for문 돌면서, a[i]인덱스 값이 'B' 이면 'C'로 변경, 'B'가 아니면,
// 		else if문으로 가서 i번째가 6번째가 될때 a[6]번 인덱스에, a[5]번 인덱스값 넣으면 된다.
// 		그러면 ACCDACC 가 되겠지?
// 3. pca(c)로 이동해서, 배열 그대로 출력하기 