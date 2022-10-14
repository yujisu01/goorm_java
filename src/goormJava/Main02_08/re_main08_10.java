package goormJava.Main02_08;

// 천천히 풀기
public class re_main08_10 {
	static class Ape{
		
		 void rs(char a[]) {
			// (2) for문 a의 length만큼 
			for(int i=0; i<a.length; i++)
				// a[i] = B랑 같은지?
				if(a[i]=='B')   	   a[i] ='C';
				// i가 a.length-1(=6)과 같은지? 
				// i가 a.length-1(=6)과 같은지? ㅇㅇ -> a[6]에 = a[5]값을 집어넣어라 
				else if(i==a.length-1) a[i] = a[i-1];
		}
		 void pca(char a[]) {
			// (4)
			for(int i=0; i<a.length; i++) System.out.print(a[i]);
			System.out.println();
		}
		public static void main(String[] args) {
			Ape ape = new Ape();
			// (1) 
			char c[]= {'A','B','D','D','A','B','K'};
			ape.rs(c);
			// (3) pca(c)는 rs에서 바뀌어진 배열의 값들 출력
			ape.pca(c);
		}
	}
}
