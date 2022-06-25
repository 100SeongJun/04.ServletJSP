package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		System.out.println(cmd);
		if (cmd == null) {
			request.getRequestDispatcher("main.jsp").forward(request, response);
		} else if (cmd.equals("allData")) {
			try {
				request.setAttribute("allStudent", StudentDAO.getAllStudent());
				request.getRequestDispatcher("student.jsp").forward(request, response);
			} catch (SQLException e) {
			}
		} else if (cmd.equals("selectData")) {
		}
		System.out.println("test");
	}

}
