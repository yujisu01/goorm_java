package goormJava.Main02_07;

public class main07_06 {
	static class Test{
		public static void main(String[] args) {
			int ar[]= {10,20,30,40,50};
			int sum=0, a=100, b=0;
			try {
				for(int i=0; i<ar.length; i++) {
					sum+= ar[i];
				}
				// 배열의 범위를 벗어나지 않으니, 예외가 발생하지 않는다. (ar.length만큼 돌렸음)
				System.out.println(sum);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception");
			}
			// 이 try문은 예외발생 (100/0= 연산 수행못함)
			try {
				float z=a/b;
				System.out.println(z);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
		}
	}
}
