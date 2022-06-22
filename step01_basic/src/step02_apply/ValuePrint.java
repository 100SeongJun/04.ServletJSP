package step02_apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValuePrint
 */
@WebServlet("/view/ValuePrint")
public class ValuePrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValuePrint() {
        super();
    }
    public void output(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	response.setCharacterEncoding("UTF-8");
//    	response.setContentType("text/html; charset=UTF-8");
//    	request.setCharacterEncoding("UTF-8");
//    	PrintWriter out = response.getWriter();
//    	String [] results =new String[5];
//    	results=request.getParameterValues("like");
//    	for(String result: results) {
//    		System.out.println(result);
//    		out.println("<head>");
//    		out.println("<body>");
//    		response.getWriter().append(result);
//    		out.print("</body>");
//    		out.println("</head>");
//    		response.getWriter().append(result);
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		output(request, response);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String[] like = request.getParameterValues("like");
		
		out.print("<div>체크 박스 : " +  Arrays.toString(like) + "</div><br/>");
		out.close();
	}
}
