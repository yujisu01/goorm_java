package goormJava.MainExam.book;

public class book09_318_09 {
	public static void main(String[] args) {
		int cnt=0;
		do {
			cnt++;
			System.out.println(cnt);
		}while(cnt<0);
			System.out.println(cnt);		// cnt가 1이고 while문은 true가 아님. if문으로 이동
		if(cnt==1)
			cnt++;							// cnt==1 이고 if문에 부합되므로 ++ 해줌
		else cnt=cnt+3;
		System.out.printf("%d",cnt);
	}
}
