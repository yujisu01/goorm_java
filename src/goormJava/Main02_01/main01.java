package goormJava.Main02_01;

public class main01 {
	public static void main(String[] args){
        // (1) a인스턴스에 model, year 생성
		Car a=new Car();
        //     b라는 인스턴스에도 model, year 생성
		Car b=new Car();
        // (2) setModel하면, 내가 가지고 있는 모델값에 "소나타" 값 넣겠다
        // (5) a인스턴스에 소나타, 2020 대입
		a.setModel("소나타");
		a.setYear(2020);
        // (6) b인스턴스에 그랜저,2016 대입 
		b.setModel("그랜저");
		b.setYear(2016);
        
        // (7) print() 메서드로 이동 
		a.print();
		b.print();
		}

static class Car{
	// model,year라는 두개의 멤버변수가 있음.
	public String model;
	public int year;
    
	public void setModel(String model){
    // (3) 인자값으로 model을 받아서 this.model에다가 인자로 받은 모델을 집어넣겠다
		this.model=model;
	}
	public String getModel(){
		return this.model;
	}
    // (4) 인자로 받은 year값을 내가 가지고있는 year값에다 대입하겠다 는 개념
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;
	}
	public void print(){
        // (8) 소나타: 2020 이런식으로 출력 
		System.out.println(this.model+":"+this.year);
	}

 }
}
