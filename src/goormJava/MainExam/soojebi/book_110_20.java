package goormJava.MainExam.soojebi;

public class book_110_20 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] temp= {1,2,4,6,8};
		int idx=0; 			// 이거 idx 맨날 놓치고 있었음 이거 주의 
		boolean flag;
		
		for(int i=0;i<arr.length;i++) {
			flag=false;
			if(arr[i]==temp[i]) {
				flag=true;
			}
			if(!flag) {
				temp[idx++]=arr[i];
				System.out.println("temp[idx]="+temp[idx]);
				System.out.println("arr[i]="+arr[i]);
			}
		}
	}
}

//(1)arr배열과 temp배열 확인하고, for문의 i=0~4까지 확인, if문은 arr[i]==temp[i] 같으면 넘어간다는 뜻 . 해석완
//(2)arr[i]배열과 temp[i]배열 값이 다르면 아래 if(!flag)이동
//(3)temp[idx++] 여기서 뭔 소린가 맨날 막혔는데 idx는 위에 0으로 선언해 있는거 맨날 못보고 지나쳤어서 그럼
//	temp[0]=arr[2] 가 된다. (값이 달라지는게 arr[2]부터 이기 떄문에)
//	그리고 출력할때는 temp[1]이 되서 '2' 출력하게된다.
//(4)temp[1]=arr[3]이 됨. (temp[1]값을 arr[3]에 대입)
//(5)temp[2]값을 arr[4]에 대입. 그리고 for문 끝
//
// 그래서 temp[idx]를 출력하면,temp[1][2][3] 246이 나오게 될거고, (temp={2,4,6})
// arr[i]배열을 출력하면, arr[2][3][4]의 값인 345가 나올거임.
