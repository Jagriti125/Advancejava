import java.sql.*;
import java.util.Scanner;
public class DBconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
    	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
    	   System.out.println("connected");
    	   Statement st=con.createStatement();//interface through statement
    	   
    	   //create table
    	 //  String query="create table student1(id number primary key,name varchar(20))";
    	  // st.executeUpdate(query);//select use with executequery();
    	  // System.out.println("Table created");
    	   
    	   //insertion 
    	   //String query2="insert into student1 values(2,'alex')";
    	  // st.executeUpdate(query2);
    	  // System.out.println("inserted data");
    	   
    	  // String query3="insert into student1 values(1,'ram')";
    	  // st.executeUpdate(query3);
    	  // System.out.println("inserted data");
    	 
    	   //user input
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("enter name for id=1");
    	   String nm=s.nextLine();
    	   String query3="update student1 set name='" + nm + "' where id=1";
    	   st.executeUpdate(query3);
    	   //update
    	   
    	  //String query="update student1 set name='sita' where id=2";
    	  // st.executeUpdate(query);
    	  // System.out.println("table update");
    	   
    	   //delete
    	   //String query="delete from student1 where id=2";
    	   //int n=st.executeUpdate(query);// int n is used to store how many rows affected in a table because of a query
    	   //System.out.println("deleted");
    	  // System.out.println(n + "rows affected");
    	   
    	   //select(result set interface is used to retrieve table 
    	   String query="select * from student1";
    	 //String query="select * from student1 where id=2";//for retriving only one row
    	   ResultSet rs=st.executeQuery(query);// work only with select query 
    	   while(rs.next()) {//loop to visit every row in table to retrieve data,next() is used to viit next row it works ill it reaches all row
    		  // int id=rs.getInt(1);// 1 is 1st column
    		  // String name=rs.getString(2);// 2 is second column or we can write name also ("name")
    		 // System.out.println(id + " " + name);
    		  System.out.println(rs.getInt(1) + " " + rs.getString(2));
    	   }
    	   
    	   
    	  
    	   con.close();
    	   st.close();//close is needed otherwise it will give garbage value
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	}

}
