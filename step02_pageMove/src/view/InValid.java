package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InValid")
public class InValid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InValid() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><head>로그인화면</head>");
		out.println("<Button name=btn1>Home</Button>");
		out.println("<body><h2>");
		out.println(request.getParameter("uname")+"는 존재하지 않는 아이디 입니다.");
		out.println("</h2></body>");
		System.out.println(request.getParameter("btn1"));
	}

}

