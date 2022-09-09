package goormJava.MainExam.book;

public class book11_321_12 {
	public static void main(String[] args) {
		int a=3, b=4, c=3, d=5;
		
		if((a==2|a==c)&!(c>d)&(1==b^c!=d)) {			// 아니근데 && 이거가 참트루 구분 아녀? &도 되네 아헷갈려
			a=b+c;
			if(7==b^c!=a) {System.out.println(a);}
			else {System.out.println(b);}
		}
		else {
			a=c+d;
			if(7==c^d!=a) {System.out.println(a);}
			else {System.out.println(d);}
		}
	}
}
