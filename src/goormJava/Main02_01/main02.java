package goormJava.Main02_01;

public class main02 {
	static class Store{
        public String name;
        public String item;
     
        public static void main(String[] args){
        // a 인스턴스 , b 인스턴스 생성
        Store a= new Store();
        Store b= new Store();
        
        // 대입
        a.name="상점1";
        a.item="인형";
        b.name="상점2";
        b.item="과자";
        
        System.out.println(a.name+":"+a.item);
        System.out.println(b.name+":"+b.item);
        
        }
     }
}
