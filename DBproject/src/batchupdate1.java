import java.sql.*;


public class batchupdate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");

			//using prepared statement 
			PreparedStatement ps = con.prepareStatement("INSERT INTO student1 VALUES(?, ?)");

				ps.setInt(1, 4);
				ps.setString(2, "rahi");
				ps.addBatch();

				ps.setInt(1, 5);
				ps.setString(2, "mahi");
				ps.addBatch();

				ps.executeBatch();
				
				con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}