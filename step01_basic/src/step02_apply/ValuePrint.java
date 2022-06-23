package step02_apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view/ValuePrint")
public class ValuePrint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValuePrint() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String[] like = request.getParameterValues("like");
		ServletInputStream input = request.getInputStream();
		System.out.println(input);
		int length = request.getContentLength();
		byte[] data = new byte[length];
		input.readLine(data, 0, length);
		String str = new String(data);
		System.out.println(str);
		out.print("<div>체크 박스 : " + Arrays.toString(like) + "</div><br/>");
		out.close();
	}
}
