package goormJava.Main02_05;

public class main05_15 {
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
			// (1) Circle() 생성시킴
			Shape s1= new Circle();
			// (2) Square() 생성시킴
			Shape s2= new Square();
			
			Shape s;
			
			// (1-1) s.draw() 하면 Circle()을 출력한다
			// 		: Circle()형태로 생성시켰으니까
			s= s1; s.draw();
			// (2-1) s.draw() 하면 Square()출력함
			s= s2; s.draw();
		}
	}
}
