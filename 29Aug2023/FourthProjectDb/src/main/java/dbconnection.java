import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbconnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public dbconnection() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String uname = request.getParameter("userName");
		String pw = request.getParameter("userPassword");
		String query = "INSERT INTO login (name,password)" + "VALUES('"+uname+"','"+pw+"')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naveen?characterEncoding=utf8","root","naveen");
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			
			pwriter.println("Total Rows updated "+count);
			pwriter.println("User Details Page: ");
			pwriter.println("Hello " + uname);
			pwriter.println("Your Password is **"+pw+"**");
			pwriter.close();
			con.close();
		}
		catch(Exception e) {
			pwriter.println(e);
		}
		finally {}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
