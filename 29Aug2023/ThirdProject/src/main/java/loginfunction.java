

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class loginfunction
 */
@WebServlet("/loginfunction")
public class loginfunction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginfunction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");
		String State=request.getParameter("State");
		String qualification=request.getParameter("qualification");
		String skill[] = request.getParameterValues("skill");
	
		if(user.equals("naveen") && pass.equals("1")) {
			pw.println("<!DOCTYPE html>");
			pw.println("<html lang=\"en\">");
			pw.println("<head>");
			pw.println("    <meta charset=\"UTF-8\">");
			pw.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			pw.println("    <style>");
			pw.println("        body {");
			pw.println("            font-family: Arial, sans-serif;");
			pw.println("            background: linear-gradient(to right, #85D8CE, #0082FC);");
			pw.println("            display: flex;");
			pw.println("            justify-content: center;");
			pw.println("            align-items: center;");
			pw.println("            min-height: 100vh;");
			pw.println("            margin: 0;");
			pw.println("        }");
			pw.println("        .glass-container {");
			pw.println("            background: rgba(255, 255, 255, 0.2);");
			pw.println("            padding: 20px;");
			pw.println("            border-radius: 10px;");
			pw.println("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);");
			pw.println("        }");
			pw.println("        table {");
			pw.println("            width: 100%;");
			pw.println("            border-collapse: collapse;");
			pw.println("        }");
			pw.println("        th, td {");
			pw.println("            border: 1px solid #ddd;");
			pw.println("            padding: 8px;");
			pw.println("            text-align: left;");
			pw.println("        }");
			pw.println("        th {");
			pw.println("            background-color: #0082FC;");
			pw.println("            color: white;");
			pw.println("        }");
			pw.println("    </style>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("    <div class=\"glass-container\">");
			pw.println("        <table>");
			pw.println("            <tr>");
			pw.println("                <th>Login Status</th>");
			pw.println("                <td>Success</td>");
			pw.println("            </tr>");
			pw.println("            <tr>");
			pw.println("                <td>State:</td>");
			pw.println("                <td>" + State + "</td>"); // Replace with your State value
			pw.println("            </tr>");
			pw.println("            <tr>");
			pw.println("                <td>Qualification:</td>");
			pw.println("                <td>" + qualification + "</td>"); // Replace with your qualification value
			pw.println("            </tr>");
			pw.println("            <tr>");
			pw.println("                <td colspan=\"2\"></td>"); // Empty row
			pw.println("            </tr>");
			pw.println("            <tr>");
			pw.println("                <th colspan=\"2\">Skill:</th>");
			pw.println("            </tr>");
			// Loop through your skills and add rows here
			for (String egambaram : skill) {
			    pw.println("            <tr>");
			    pw.println("                <td colspan=\"2\">" + egambaram + "</td>"); // Skill
			    pw.println("            </tr>");
			}
			pw.println("        </table>");
			pw.println("    </div>");
			pw.println("</body>");
			pw.println("</html>");


		}
		else {
		pw.println("Login Failed...!");}
		pw.close();
		
	}
}
