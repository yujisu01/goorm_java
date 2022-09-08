package goormJava.MainExam;

// 밑줄친곳에 들어갈 단어 쓰는문제
public class exam05_2201_11 {
	static class Car implements Runnable{
		int a;
		public void run() {
			
		}
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Car());
						       /*------*/		
		t1.start();
		
	}
}
