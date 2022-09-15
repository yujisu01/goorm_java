package goormJava.MainExam.soojebi;

public class book_110_20 {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4};
		int[] temp= {0,1,2,5,6};
		int idx=0;
		boolean flag;
		
		for(int i=0;i<arr.length;i++) {
			flag=false;
			if(arr[i]==temp[i]) {
				flag=true;
				//System.out.println(arr[i]);
			}
			if(!flag) {
				System.out.println("전 ="+temp[idx]);
				temp[idx++]=arr[i];
				System.out.print("temp[idx]="+temp[idx]);
				System.out.println(", arr[i]="+arr[i]);
			}
		}
	}
}
