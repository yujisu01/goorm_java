package goormJava.MainExam.planzzz;

public class test {
	static class Connection{
	private static Connection inst=null;
	private int count =0;

	static public Connection getInstance() {
		if(inst==null) {
			inst=new Connection();
			return inst;
		}
		return inst;
	}
	
	public void count() {count++; }
	public int getCount() { return count; }
	}
	static class Soojebi{
		public static void main(String[] args) {
			Connection conn1= Connection.getInstance();
			conn1.count();
			Connection conn2= Connection.getInstance();
			conn2.count();
			System.out.println(conn1.getCount());
		}
	}
}
