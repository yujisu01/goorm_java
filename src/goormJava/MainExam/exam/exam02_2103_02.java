package goormJava.MainExam.exam;

public class exam02_2103_02 {
	static class Connection{
		static private Connection _inst=null;
		private int count=0;
		
		static public Connection get() {
			if(_inst==null) {
				_inst=new Connection();
				return _inst;
			}
			return _inst;
			
		}
		public void count() {count++;}
		public int getCount() {return count;}
	}
	public static class testcon{
		public static void main(String[] args) {
			Connection conn1=Connection.get();
			conn1.count();
			Connection conn2= Connection.get();
			conn2.count();
			Connection conn3= Connection.get();
			conn3.count();
			System.out.println(conn1.getCount());
		}
	}
}
