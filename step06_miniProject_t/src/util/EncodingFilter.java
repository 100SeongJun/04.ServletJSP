//package util;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//
////@WebFilter("/guestbook.do")
//public class EncodingFilter implements Filter {
//	String env;
//
//	public EncodingFilter() {
//		System.out.println("필터 객체 생성");
//	}
//
//	public void init(FilterConfig config) throws ServletException {
//		System.out.println("필터 객체 init");
//		env = config.getInitParameter("charset");
//	}
//
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("Before : 필터 적용");
//		request.setCharacterEncoding(env);
//		chain.doFilter(request, response);
//		System.out.println("After : 필터 적용");
//	}
//
//	public void destroy() {
//		System.out.println("필터 객체 해제");
//	}
//
//}