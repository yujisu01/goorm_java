package goormJava.MainExam;

public class exam03_2103_11 {
	public static void main(String[] args) {
		int a=3, b=4, c=3, d=5;
		
		if((a==2|a==c) & !(c>d) & (1==b^c!=d)) {
			a=b+c;
			
			if(7==b^c!=a) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else {
			a=c+d;
			
			if(7==c^d!=a) {
				System.out.println(a);
			}else {
				System.out.println(d);
			}
		}
	}
}
