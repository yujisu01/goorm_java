package goormJava.MainExam.sinagong;

import java.util.Scanner;

public class book_279_41 {
	public static void main(String[] args) {
		int a=1, b=1;
		int y=a+b;
		int n=10;
		for(int i=3; i<n; i++) {
			int c=a+b;
			y+=c;
			a=b;
			b=c;
			System.out.printf("%d %d %d ",a,b,c);
		}
	}
}
