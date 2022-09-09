package goormJava.MainExam.exam;

public class exam06_2201_19 {
	 static int isPrime(int number) {
		int i;
		for(i=2;i<number;i++) {
			if(number%i==0) 
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		int number=13195, max_div=0, i;
		//int number=45, max_div=0, i;
		for(i=2;i<number;i++) {
			if(isPrime(i)==1 && number%i==0) {
				max_div=i;
				
			}
		}System.out.printf("print %d,%d",max_div,i);
	}
}

// c언어 문제 자바로 짜봄

