package goormJava.MainExam.soojebi;

public class book_077_13_2 {

	static class Shape{
		String name="Shape";
		public Shape() {}
		void draw(String name) {System.out.println(this.name);}
	}
	static class Circle extends Shape{
		//String name="Circle";
		void draw(String name) {System.out.println(this.name);}
	}
	static class Square extends Shape{
		//String name="Square";
		void draw(String name) {System.out.println(this.name);}
	}
	static class Shapes{
		public static void main(String[] args) {
			Shape s1= new Circle();
			Shape s2= new Square();
			
			Shape s;
			s= s1; s.draw("soojebi");
			s= s2; s.draw("sinagong");
		}
	}

}
