package goormJava.Main02_06;
/*
 * Q 07.
 *  다음 인터페이스를 정의할때, 문법오류가 발생하는 부분을 고르시오
 * 
 */
public interface main06_07 {
	interface interfaceA{
		// 인터페이스에서도 변수 선언 가능
		int val1=0;				// ㄱ
		// 아까 추상클래스 같은경우에는 여기에 private,protected ..하던 아무상관 없었는데
		// 인터페이스 같은 경우에는 private이 올수 없다
		// 이유: 인터페이스는 모든 메서드가 추상화되있어야 하는데, private으로 선언을 해버리면 사용할곳이 아무데도 없어지게 된다
		// 		따라서 private은 선언할수 없다. 
	//	private int val2=0;		// ㄴ 
		// 메서드의 원형 정상적으로 생성했음 
		public void up();		// ㄷ
		public void down();		// ㄹ
		// private으로 선언했으니 X
	//	private void left();	// ㅁ
		// {}(중괄호)로 구현을 해버렸으니 틀린문법이 된다.
		// 인터페이스는 모든메서드가 추상메서드이다. 근데 여기에 중괄호를 쓰면 어불성설임(이미 구현을 해버렸단 뜻이되므로)
	//	public void right() {};	// ㅂ
	}
}

// 답은 ㄴ,ㅁ,ㅂ

// (ㄴ), (ㅁ)
// Illegal modifier for the interface field main06_07.interfaceA.val2; only public, static & final are permitted
//  --> 인터페이스 필드 main06_07.interfaceA.val2에 대한 잘못된 modifier이다
//		static및 final만 허용됨 (private으로 선언할수 없다는 뜻)
// (ㅂ)
// Abstract methods do not specify a body
//  --> 추상메서드는 본문을 지정하지 않음


