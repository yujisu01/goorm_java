package goormJava.MainExam.book;

public class book01_096_34 {
	public static void main(String[] args) {
		int a,b;
		a=2;
		while(a-- > 0) {					// a=2일때 while문 타서, 출력할떄는 1로됨 
			System.out.printf("a=%d\n",a);	// a=1일때 while문 타서, 출력할때는 0됨 
		}									// a=0일때 while문 조건 부합하지 않으니, 빠져나와서 for문으로 이동
		System.out.printf("a=%d\n",a); 	
		for(b=0;b<2;b++) {
			System.out.printf("a=%d\n",a++);
		}
	}
}
