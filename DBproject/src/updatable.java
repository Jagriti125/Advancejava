import java.sql.*;
import java.sql.DriverManager;

public class updatable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		    	Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
		 	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
		 	   System.out.println("connected");
		 	   
		 	   Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 	   ResultSet rs=st.executeQuery("select id,name from student1");
		 	   
		 	   //update row
//		 	   rs.absolute(2);
//		 	   rs.updateString("name", "siya");
//		 	   rs.updateRow();
		 	   
		 	   //insert 
		 	  // rs.beforeFirst();
		 	  // rs.moveToInsertRow();
		 	 //  rs.updateInt("id", 10);
		 	  // rs.updateString("name", "friend");
		 	  // rs.insertRow();
		 	   
		 	   //delete
//		 	   rs.absolute(4);
//		 	   rs.deleteRow();
		 	   
		 	  //searching of the basis of id
		 	   while(rs.next()) {
		 		   int r=rs.getInt("id");
		 		   if(r==0) {
		 			   rs.updateString("name","deepak");
		 			   rs.updateRow();
		 		   }
		 	   }
		 }
		 catch(Exception e) {
		    	e.printStackTrace();
		    }
	}

}
