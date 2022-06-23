package data;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataSave
 */
@WebServlet("/save")
public class DataSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DataSave() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Cookie 생성 -> 저장 jsp02_EL.jsp
		Cookie cookie9 = new Cookie("cat", "쿠키밸류");
		response.addCookie(cookie9);
		System.out.println("쿠키");
		response.addCookie(cookie9);
		response.sendRedirect("jsp02_EL.jsp");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp02_EL.jsp");
//		dispatcher.forward(request, response);
	}

}
