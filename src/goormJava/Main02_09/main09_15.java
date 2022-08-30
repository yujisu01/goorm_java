package goormJava.Main02_09;

public class main09_15 {
	static class Rarr{
		
		static int[] marr() {
			int temp[]=new int[4];
			for(int i=0; i<temp.length; i++)
				temp[i]=i;
			return temp;
		}
		public static void main(String[] args) {
			int iarr[];
			iarr=marr();
			for(int i=0; i<iarr.length; i++)
				System.out.print(iarr[i]+" ");
		}
	}
}

// (1) iarr에 marr의 리턴값을 받을거임
// (2) marr()에는 temp[] (4개공간) 배열 있음
// 		for문은 i가 0부터 3까지 돌고, temp[0]=0, temp[1]=1, temp[2]=2, temp[3]=3 
// (3) 그대로 출력