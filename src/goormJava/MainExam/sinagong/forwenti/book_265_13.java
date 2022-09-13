package goormJava.MainExam.sinagong.forwenti;

public class book_265_13 {
	public static void main(String[] args) {
		int a=0, sum=0;
		while(a<10) {
			a+=1;
			if(a%2==1) {
				continue;
			}sum+=a;
			System.out.printf("sum=%d,a=%d\n",sum,a);
		}
	}
}
// while문 안이니까 전부다 출력
// < > : i의 최대값 까지 출력함. i는 10까지 돌아야 while문 탈출.
// 		 while문 연산도 최대까지 하고 출력 