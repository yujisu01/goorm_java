package goormJava.MainExam.sinagong;

public class book_282_44 {
	public static void main(String[] args) {
		int p=2;
		int n=3;
		
		while(true) {
			double t=Math.sqrt(n);		// n의 제곱근 값을 반환한다
			int m=(int)t;
		
			for(int i=2;i<=m;i++) {
				int r=n%i;
				if(r==0)
					break;
				if(i==m)
					p= n;
			}
			
			n++;
			if(n>50)
				break;
		}
		
		System.out.printf("%d\n",p);
	}

}
