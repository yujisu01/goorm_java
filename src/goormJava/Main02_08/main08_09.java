package goormJava.Main02_08;

public class main08_09 {
	static class arrayl{
		public static void main(String[] args) {
			int cnt=-2;
			// do~ while문: 그냥 무조건 일단 들어감
			do {cnt++;}
			// (1) do문 ++만나서 cnt는 1이 됐으므로 while문 빠져나옴
			while(cnt<0);
		
			// (2) cnt==1이므로 cnt++ 수행
			if(cnt==1) cnt++;
			else 	cnt=cnt+3;
			
			// (3) cnt값 출력
			System.out.printf("%d",cnt);
		}
	}
}
