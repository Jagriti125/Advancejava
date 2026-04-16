import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class savepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");
			
			con.setAutoCommit(false);
			Statement st= con.createStatement();
			st.execute("insert into student1 values(15,'jivika')");
			st.executeUpdate("UPDATE student1 SET name='pari' WHERE id=7");
			
			con.rollback();
			con.commit();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}