package step02_apply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Idcheck")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdCheck() {
        super();
    }
    protected void output(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException  {
//    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	if(request.getMethod().equals("GET")) {
    		System.out.println("Post방식");
    	}
    	else {
    		System.out.println("Get방식");
    	}
    	System.out.println("안녕하세요");    	
    	response.getWriter().append(request.getParameter("id")+" 님 안녕하세요!");
		out.println("<html>");
		out.println("<h2>테스트 중입니다.</h2>");
		out.println("</html>");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		output(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		output(request,response);
	}

}
