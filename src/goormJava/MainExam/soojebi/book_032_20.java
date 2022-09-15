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
