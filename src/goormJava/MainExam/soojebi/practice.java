package goormJava.MainExam.soojebi;

public class practice {

	
static abstract class my{
	private String name;
	
abstract public String getName(String val);
	public String getName() {
		return "못생긴 "+name;
	}
	public void setName(String val) {
		name=val;
	}
	protected abstract char[] getInt();
}
static class Hi extends my{
	public Hi(String val) {
		setName(val);
	}
	public String getName(String val) {
		return "잘생긴"+val;
	}
	public String getName(byte val[]) {
		return "예쁜"+val;
	}
	@Override
	protected char[] getInt() {
		int a=3;
		int b=75, c=162, d=256;
		int n=0;
		if((a<=c|b<=c) & !(c>d) & (3==a^c!=d)) {
			n=a*c;
			if(75==b^c!=a) {
				System.out.printf(" %d\n",n);
			}else {
				System.out.println(b);
			}
		}
		//return 0;
		return null;
	}
}
	public static void main(String[] args) {

		my obj= new Hi("계림아");
		my obj1= new Hi("지수야");
		System.out.print(obj.getName());
		System.out.println(obj1.getInt());


		
		
	}

}
