package goormJava.Main02_09;

public class main09_13 {
	static class ovr{
		public static void main(String[] args) {
			int a=1, b=2, c=3, d=4;
			int mx,mn;
			// (1) 1<2 = true 므로 mx=b
			mx=a<b?b:a;
			
			// (2) mx!=1이므로 else문 
			if(mx==1) { mn=a>mx?b:a; }
			// (3) b<mx = false므로 c값(=3)을 mn에 대입
			else 	{ mn=b<mx?d:c; }
			System.out.println(mn);
		}
	}
}
