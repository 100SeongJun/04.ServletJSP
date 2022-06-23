package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Idcheck
 */
@WebServlet("/Idcheck")
public class Idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Idcheck() {
        super();
        // TODO Auto-generated constructor stub
    }
    // id 값이 busan이라고 한다면 -> /valid 매핑되어 있는 servlet으로 화면 이동
    // busan이 아니라고 한다면 /valid가 아닌 invalid로 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		String psw = request.getParameter("psw");
		String id = request.getParameter("uname");
		if("busan".equals(id)) {
			request.getRequestDispatcher("Valid").forward(request,response);
		}else {
			request.getRequestDispatcher("InValid").forward(request,response);
		}

	}

}
