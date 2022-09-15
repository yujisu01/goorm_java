package goormJava.MainExam.soojebi;

class book{
	String name="수험서";
	void getPrice(String name) {
		System.out.println("name:"+name);
	}
}
class Price extends book{
	String price="10,000원";
	void getPrice(String name) {
		super.getPrice(name);
		System.out.println("price:"+price);
	}
}
public class book_031_14 {
	public static void main(String[] args) {
		book b=new Price();
		b.getPrice("정보처리기사");
	}

}
// 오버라이딩