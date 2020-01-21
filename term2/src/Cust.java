

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cust")
public class Cust extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		String s1=request.getParameter("aid");
		long aadharId=Long.parseLong(s1);
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String s2=request.getParameter("pincode");
		int pincode=Integer.parseInt(s2);
		String s3=request.getParameter("noofdep");
		int noOfDependents=Integer.parseInt(s3);
		String occupation=request.getParameter("occupation");
		String s4=request.getParameter("salary");
		double salary=Double.parseDouble(s4);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			PreparedStatement ps=cname.prepareStatement("insert into userdetails values(?,?,?,?,?,?,?,?)");

			ps.setString(1,userName );
			ps.setLong(2,aadharId );
			ps.setString(3, city);
			ps.setString(4, state);
			ps.setInt(5, pincode);
			ps.setInt(6,noOfDependents );
			ps.setString(7, occupation);
			ps.setDouble(8, salary);
			int result=ps.executeUpdate();
			if(result>0)
			{
				cname.commit();
				PrintWriter out=response.getWriter();
				out.println("registration done "+userName);

			}

		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
		}
		catch(SQLException s)
		{
			System.out.println(s);
		}

	}
}


