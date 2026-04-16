import java.sql.*;
import java.util.Scanner;
public class Menudrivenprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");
			   
			   

			         Scanner sc = new Scanner(System.in);

			           while(true) {
			               System.out.println("1.Insert 2.Update 3.Delete 4.Retrieve 5.Exit");
			               int ch = sc.nextInt();

			               switch(ch) {

			                   case 1:
			                       PreparedStatement ps1 = con.prepareStatement("insert into students values(?,?,?)");
			                       ps1.setInt(1, sc.nextInt());
			                       ps1.setString(2, sc.next());
			                       ps1.setInt(3, sc.nextInt());
			                       ps1.executeUpdate();
			                       break;

			                   case 2:
			                       PreparedStatement ps2 = con.prepareStatement("update students set age=? where id=?");
			                       ps2.setInt(1, sc.nextInt());
			                       ps2.setInt(2, sc.nextInt());
			                       ps2.executeUpdate();
			                       break;

			                   case 3:
			                       PreparedStatement ps3 = con.prepareStatement("delete from students where id=?");
			                       ps3.setInt(1, sc.nextInt());
			                       ps3.executeUpdate();
			                       break;

			                   case 4:
			                       PreparedStatement ps4 = con.prepareStatement("select * from students");
			                       ResultSet rs = ps4.executeQuery();
			                       while(rs.next())
			                           System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			                       break;

			                   case 5:
			                       System.exit(0);
			               }
			           }
		 
			   
			        
			   
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
