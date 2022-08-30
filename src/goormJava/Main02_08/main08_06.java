package goormJava.Main02_08;
/*
 * 
 * Q 06.
 *  다음 java프로그램은 3의 배수를 제외한 1부터 10까지 정수의 누적합이 10을 초과하는 최초 시점에서의
 *  합을 출력하는 프로그램이다.
 *  (ㄱ)과 (ㄴ)에 들어가는 내용으로 적절한 것은?
 *  
 */
public class main08_06 {
	static public class JavaApplication{
		public static void main(String[] args) {
			int i=0, sum=0;
			while(i<10) {
				i++;
				if(i%3==0) 
					continue;
			      /*----(ㄱ)---*/
				if(sum>10) 
					break;
			     /*----(ㄴ)--*/
				sum+=i;
			}
			System.out.println("sum="+sum);
		}
	}
}

// (ㄱ) continue;
// (ㄴ) break;
