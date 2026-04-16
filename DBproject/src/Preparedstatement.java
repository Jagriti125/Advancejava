import java.sql.*;
import java.util.Scanner;
public class Preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
	   System.out.println("connected");
	   
	   //user input
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter id:");
	   int id = s.nextInt();
	   s.nextLine();
       System.out.println("Enter Name:");
	   String name= s.nextLine();
       String query1 = "insert into student1 values(?,?)";
       PreparedStatement pst = con.prepareStatement(query1);
       pst.setInt(1, id);
	   pst.setString(2, name);
       pst.executeUpdate();


	   
	   //String query3="update student1 set name='" + nm + "' where id=1";
	  // s.executeUpdate(query3);
	   
	   //insert query
	   /*String query="insert into student1 values(?,?)";
	   PreparedStatement pst=con.prepareStatement(query);
	   pst.setInt(1, 2);
	   pst.setString(2, "rahul");
	   pst.executeUpdate();
	   
	   pst.setInt(1, 3);
	   pst.setString(2,"alia");
	   pst.executeUpdate();*/
	   
	   //update
	  // String query="update student1 set name=? where id=?";
	  // PreparedStatement pst=con.prepareStatement(query);
	   //pst.setString(1, "sita");// 1st ? //1st is for colmn, 2nd is for value
	   //pst.setInt(2, 2);//2nd ?
	  // pst.executeUpdate();
	   
	   //delete
	   String query="delete student1 where id=? ";
	   PreparedStatement pst1=con.prepareStatement(query);
	   pst1.setInt(1,2);
	   pst1.executeUpdate();
	   
	   //select
	   String query3="select * from student1";
	   PreparedStatement pst3=con.prepareStatement(query3);
	   ResultSet rs=pst3.executeQuery();
	   while(rs.next()) {
		   System.out.println(rs.getInt(1) + " " + rs.getString(2));
		   
	   }

	   

   }
   catch(Exception e) {
	   e.printStackTrace();
   }
	}

}
