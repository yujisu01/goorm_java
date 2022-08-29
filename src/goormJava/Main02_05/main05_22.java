package goormJava.Main02_05;

public class main05_22 {
// 재귀함수,메서드 오버라이딩(or오버로딩) 묻는 문제	
	static class Parent{
		int compute(int num) {
			if(num<=1) return num;
			return compute(num-1)+compute(num-2);
		}
	}
	static class Child extends Parent{
		int compute(int num) {
			if(num<=1) return num;
			// (2) c언어에서 재귀함수 푸는것처럼 풀기
			// (3) compute(3)+compute(1) .... 각각 상수나올때까지 풀고 합계 구하기
			// 		0+1 이 나옴
			return compute(num-1)+compute(num-3);
		}
	}
	public static void main(String[] args) {
		Parent obj= new Child();
		// (1) 오버라이딩
		// (4) 출력
		System.out.println(obj.compute(4));
	}

}
