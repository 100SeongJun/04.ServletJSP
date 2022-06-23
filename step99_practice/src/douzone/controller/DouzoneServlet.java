package douzone.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstructorDAO;
import model.ManagerDAO;
import model.StudentDAO;
import service.CategorynCRUD;

@WebServlet("/douzone")
public class DouzoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		String type = request.getParameter("type");
//		System.out.println(cmd);
//		System.out.println(type);
//		String type = request.getParameter("type");
//서브에서의 main
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
		String url = "error.jsp";
		try {
			url = "main.jsp";
			request.getRequestDispatcher(url).forward(request, response);
			;
		} catch (IOException e) {
			response.sendRedirect(url);
		}
	}

	private void getCRUD(String type, String cmd, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String url = CategorynCRUD.category(cmd);
			if (type == null) {
				request.getRequestDispatcher(url).forward(request, response);
			} else {
				switch (type) {
				case "Student":
					request.setAttribute("allStudent", StudentDAO.getAllStudent());
					break;
				case "Instructor":
					request.setAttribute("allInstructor", InstructorDAO.getAllInstructor());
					break;
				case "Manager":
					request.setAttribute("allManager", ManagerDAO.getAllManager());
					break;
				}
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (SQLException e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
