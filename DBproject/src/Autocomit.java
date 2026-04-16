import java.sql.*;


public class Autocomit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");
		
			   
			con.setAutoCommit(false);
			Statement st= con.createStatement();
			st.execute("insert into student1 values(13,'jatin')");
			con.commit();
			
		}
			
		
		catch(Exception e) {
			try {
				con.rollback();
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}