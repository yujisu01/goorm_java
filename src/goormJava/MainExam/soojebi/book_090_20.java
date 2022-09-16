package goormJava.MainExam.soojebi;

public class book_090_20 {
	public static void main(String[] args) {
		int[] numArr=new int[5];
		int result=0;
		for(int i=0;i<5;i++) {
			numArr[i]=++i;
			System.out.printf("i=%d ,\n",i);
		}
		for(int i:numArr) {
			result+=i;
			System.out.printf("%d \n", result);
		}
		System.out.printf("result=%d", result);
	}

}
