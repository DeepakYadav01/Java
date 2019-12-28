package JDBC_DB;
import java.io.*;
import java.io.InputStreamReader;
import java.sql.*;

public class Data_deletion{
	public static void main(String args[])  {

		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");


		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1404");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


          System.out.println("please enter the id ,whose data you want to delete");
          int id=Integer.parseInt(br.readLine());

	PreparedStatement stmt = con.prepareStatement("delete from project where id=?");
     stmt.setInt(1,id);
     int i= stmt.executeUpdate();
		System.out.println(i+"records deleted");

	con.close();
		}catch(Exception e) {
			System.out.println(e);
		}


	}
}
