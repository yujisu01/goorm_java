package goormJava.Main02_08;

public class main08_05 {
	static public class ArrayCloneTest{
		public static void main(String[] args) {
			int sum=0;
			int[] mydream=new int[] {5,4,6,9,7,9};
			int[] mytarget=(int[])mydream.clone();	// mydream 복사
			
			for(int i=0; i<mytarget.length; i++) {
				sum= sum+mytarget[i];
			}
			System.out.println(sum);
		}
	}
}
