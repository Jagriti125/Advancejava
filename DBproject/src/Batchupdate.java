import java.sql.*;

public class Batchupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");
			
			Statement st = con.createStatement();
			st.addBatch("INSERT INTO student1 VALUES(13, 'A')");
            st.addBatch("INSERT INTO student1 VALUES(12, 'B')");
            st.addBatch("UPDATE student1 SET name='nipun' WHERE id=18");
            st.addBatch("DELETE FROM student1 WHERE id=9");

            
            int[] result = st.executeBatch(); //int[] result- return array in execute batch query

            System.out.println("Batch executed successfully");

            
            con.close();

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
