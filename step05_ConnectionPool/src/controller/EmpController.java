package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.EmpDAO;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empno = Integer.parseInt(request.getParameter("empno"));
		try {
			String ename = EmpDAO.getName(empno);
			HttpSession session1 = request.getSession();
			if (ename != null) {
				session1.setAttribute("name", ename);
//				request.getRequestDispatcher("view.jsp").forward(request, response);
			} else {
				session1.setAttribute("name", "이름이없음");
			}
			response.sendRedirect("view.jsp");
		} catch (SQLException e) {
			response.sendRedirect("failView.jsp");
		}

		// 메소드 정의
		/*- step01.
		 * empno 사번 -> ename 사원의이름을 반환받으려고 한다.
		 * String ename=EmpDAO.getName(empno);
		 * 
		 * step02. 페이지 이동
		 * ename 있다고 한다면 -> view.jsp로 이름값 전달
		 * enmae 없다고 한다면 -> view.jsp로 "사원이름이 없음" 문자열 전달
		 * 
		 * 만약 sql 오류가 뜨면 failView로 전달
		 * */
	}

}
