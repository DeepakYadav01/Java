package JDBC_DB;

import java.io.*;
import java.sql.*;
import java.util.*;


public class Data_insertion {

	public static void main(String arg[])
	{
		try
		{
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","1404");
	           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	           System.out.println("please Sign up");
	           System.out.println("set your id ");
	           int id=Integer.parseInt(br.readLine());

	           System.out.println("set your password");
	           String s=br.readLine();


	       	PreparedStatement stmt = con.prepareStatement("insert into project values(?,?)");
		       stmt.setInt(1, id);

	       stmt.setString(2, s);
	    int i =   stmt.executeUpdate();

   System.out.println(i+"record updated");


		}catch(Exception e) {
	           System.out.println(e);

		}
	}
}
