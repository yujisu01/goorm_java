package goormJava.Main02_09;

public class main09_14 {
	static class ParaPassing{
		
		public void change(int i, int[] j) {
			// (2) 
			// j[3]=400 으로 값을 메인함수에 넘김
			i=20; j[3]=400;
		}
		public void display(int i, int[] j) {
			// (3-1) i:10 이 넘어왔음
			System.out.println("i:"+i);
			// (4) j의 요소들 0번부터~3번인덱스까지 출력
			System.out.print("j:");
			
			// (5) j[3]의 경우에는 아까 400값으로 받은게 있으므로 1 2 3 400 이런식으로 출력
			for(int k=0; k<j.length; k++)
				System.out.print(j[k]+" ");
			System.out.println();
		}
	}
		public static void main(String[] args) {
			ParaPassing pp=new ParaPassing();
			int i=10, j[]= {1,2,3,4};
			// (1)
			// (2-1) pp.change(i,j)에는 j[3]=400으로 대입 
			pp.change(i, j);
			// (3) i=10과 j배열 넘김
			pp.display(i, j);
		
	}
}
