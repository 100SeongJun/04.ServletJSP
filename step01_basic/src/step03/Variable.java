package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Variable
 */
@WebServlet("/Variable")
public class Variable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Variable() {
        super();
    }
//    String msg;
    //project/var?msg="문자열"
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;
		String msg = request.getParameter("msg");
//		msg = request.getParameter("msg");
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		
		out.println("<html><head>Variable Test</head>");
		out.println("<body><h2>Variable Result</h2>");
		while(num++ < 10) {
			out.println(msg+":"+num+"<br/>");
			out.flush();
			System.out.println(msg+":"+num);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
		out.println("</body></html>");
		out.close();
	}

	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
