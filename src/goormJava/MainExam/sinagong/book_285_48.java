package goormJava.MainExam.sinagong;

public class book_285_48 {
	public static void main(String[] args) {
		int [][] a=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=3;j>=0;j--) {
				a[i][j]= i+j;
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println();
		}
	}
}
