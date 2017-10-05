import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	String uname=null;
	String pwd=null;
	String phoneNo=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
		String name=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		String phone=request.getParameter("phoneNo");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println(name);
		out.println("<br/>"+pass);
		out.println("<br/>"+phone);
		out.println("</body></html>");
		
		//ServletContext context=getServletContext();
		//context.setAttribute("username",name);
		
		request.setAttribute("username", name);
		
		ServletContext context=getServletContext();
		
		RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		rd.forward(request , response);
		
		/*RequestDispatcher rd1=getServletContext().getRequestDispatcher("/SecondServlet");
		rd1.forward(request,response);*/
		
		//response.sendRedirect("SecondServlet");
	}

}
