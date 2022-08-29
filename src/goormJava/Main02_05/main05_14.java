package goormJava.Main02_05;

public class main05_14 {
	static class Shape{
		void draw() {System.out.println("Shape");}
	}
	static class Circle extends Shape{
		void draw() {System.out.println("Circle");}
	}
	static class Square extends Shape{
		void draw() {System.out.println("Square");}
	}
	static class Shapes{
		public static void main(String[] args) {
			Shape s1= new Shape();
			Circle s2= new Circle();
			Square s3= new Square();
			
			// Shape s1과 똑같은 위치 바라보고 있음. (s1, s) 
			Shape s;
			
			s= s1; s.draw();
			s= s2; s.draw();
			s= s3; s.draw();
		}
	}
}
