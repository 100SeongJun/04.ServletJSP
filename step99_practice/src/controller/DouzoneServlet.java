package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CategoryCRUD;

@WebServlet("/douzone")
public class DouzoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		String type = request.getParameter("type");

		if (cmd == null) {
			cmd = "main";
		}
		if (cmd.equals("main")) {
			main(request, response);
		} else {
			getCRUD(type, cmd, request, response);
		}
	}

	private void main(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.getRequestDispatcher("main.jsp").forward(request, response);
			;
		} catch (IOException e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	private void getCRUD(String type, String cmd, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String url = CategoryCRUD.category(cmd, type, request, response);
			if (url == null) {
				request.getRequestDispatcher("main.jsp").forward(request, response);
				return;
			}
			request.getRequestDispatcher(url).forward(request, response);
			return;
		} catch (SQLException e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
			return;
		}
		/*-
		 * // 메소드화 switch (type) 
		 * { case "Student": request.setAttribute("allStudent",
		 * StudentDAO.getAllStudent()); break; case "Instructor":
		 * request.setAttribute("allInstructor", InstructorDAO.getAllInstructor());
		 * break; case "Manager": request.setAttribute("allManager",
		 * ManagerDAO.getAllManager()); break; } 타입에따라 db접근이 달라짐
		 */
//			CheckType.checkType(type, request, response);
	}

}
