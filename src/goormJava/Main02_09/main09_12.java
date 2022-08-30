package goormJava.Main02_09;

public class main09_12 {
	static class Test{
		public static void main(String[] args) {
			int a=3, b=4, c=3, d=5;
			
			// (1)
			//     f|t =t    !f = t      f^t = t (^는 다르면 true)
			if((a==2|a==c) & !(c>d) & (1==b^c!=d)) {
				// (2) 전부다 true므로 b+c값 a에 대입 
				a=b+c;
				
				// (3)
				//  f^t = true이니, (2)에서 대입해준 a값 출력
				if(7==b^c!=a) { System.out.println(a); }
				else { System.out.println(b); }
			}
		}
	}

}
