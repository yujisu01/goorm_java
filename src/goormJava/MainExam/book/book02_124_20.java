package goormJava.MainExam.book;

public class book02_124_20 {
	static int snum=0;
	static int inum=0;
	
	public static void main(String[] args) {
		//int inum = 0;
		func();
		snum++;
		inum++;
		func();
	}
	public static void func() {
		//int inum = 0;
		snum++;
		inum++;
		System.out.printf("snum=%d,inum=%d\n",snum,inum);
	}
}
