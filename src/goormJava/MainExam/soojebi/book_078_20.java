package goormJava.MainExam.soojebi;

public class book_078_20 {
	public static void main(String[] args) {
		String str="12345000";
		char arr[]=str.toCharArray();
		char ch;
		int i,j;
		
		for(i=0;i<8;i++) {
			ch= arr[i];
			if(ch=='0') 
				break;
		}
		for(j=0;j<i;j++) {
			i--;
			ch=arr[j];
			arr[j]=arr[i];
			arr[i]=ch;
			System.out.printf("%s",arr);
		}
	}

}
