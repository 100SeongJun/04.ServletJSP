package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Final
 */
@WebServlet("/final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Final() {
        super();
        // TODO Auto-generated constructor stub
    }
    // Client에 있는 Cookie 정보 획득 - 해당 서비스에 발생시킨 쿠키 정보에 한해서만 획득
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Cookie[] cookies= request.getCookies();
//		for(Cookie cookie : cookies) {
//			System.out.println(cookie.getName()+":"+cookie.getValue());
//			 //key값 비교 후 삭제		
//			if(cookie.getName().equals("myName")) {
//				cookie.setMaxAge(0);
//				response.addCookie(cookie);
//			}
//		}
//		
//		//myName에 대한 cookie만 삭제
//		Cookie removeName= new Cookie("myName",null);
//		removeName.setMaxAge(0);
//		response.addCookie(removeName);
	}

}
