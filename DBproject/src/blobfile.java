import java.sql.*;
import java.io.*;
public class blobfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Ankit&12");//get connection(url,username,password),1521:oracle codenumber
			   System.out.println("connected");
		
//		PreparedStatement pst=con.prepareStatement("insert into file1 values(?,?,?,?)");
//		pst.setInt(1,1);
//		pst.setString(2, "deepak");
//		//image file
//		FileInputStream fis=new FileInputStream("C:\\Users\\jagri\\OneDrive\\Desktop\\20251120_OHR.ManateeBaby_EN-IN4061513303_UHD_bing.jpg");
//		pst.setBlob(3, fis);
//		//textfile
//		FileReader fr=new FileReader("C:\\Users\\jagri\\Downloads\\JAGRITI_GUPTA_Resume.txt");
//		pst.setClob(4, fr);
//		
//		pst.executeUpdate();
			   
			  //retrive 
//			   PreparedStatement ps=con.prepareStatement("select binarydata from files where id=1 ");
//			   ResultSet rs=ps.executeQuery();
//			   if(rs.next()) {
//				   Blob b=rs.getBlob(1);
//		              byte[] data=b.getBytes(1,(int)b.length());
//		              FileOutputStream fos=new FileOutputStream("C:\kiet\sem2\advance java\\picture.png");
//		              fos.write(data);
//		              fos.close();
		              
		              PreparedStatement ps=con.prepareStatement("select binarydata from files where id=1 ");
					   ResultSet rs=ps.executeQuery();
					   if(rs.next()) {
						   Clob b=rs.getClob(1);
				              Reader r=b.getCharacterStream();
				              
				              FileWriter fw=new FileWriter("C:\\kiet\\sem2\\advance java\\notepad file.txt");
		              int i;
		              while((i=r.read())!=-1) {
		            	  fw.write(i);
		                  }
			          		             
				   
			   }
					   con.close();
		}
		
		
		catch(Exception e){
			
		}
	}

}
