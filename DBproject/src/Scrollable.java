import java.sql.*;
import java.sql.DriverManager;

public class Scrollable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
 	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
 	   System.out.println("connected");
 	   
 	   //select query
 	   
 	   Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 	   ResultSet rs=st.executeQuery("select * from student1");
 	   
// 	   while(rs.next()) {
// 		   System.out.println(rs.getInt(1)+ " "+rs.getString(2));
// 	   }
 	   
    	System.out.println("----backward---");
    	rs.afterLast();
    	while(rs.previous()) {
    		 System.out.println(rs.getInt(1)+ " "+rs.getString(2));

    	}
    	//at specific position
    	rs.absolute(5);
    	System.out.println("name at 5th row = " + rs.getString("name"));
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
	}

}
