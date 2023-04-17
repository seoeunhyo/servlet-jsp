package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(loadOnStartup = 1, urlPatterns = "/lifecycle")  //<servlet> 태그

//@WebServlet( urlPatterns = "/lifecycle")  //<servlet> 태그

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet() {
		System.out.println("LifeCycleServlet construct call..");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet doGet call..");
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>get</title></head>");
		out.println("<body>");
		out.println("<h1>"+"안녕하세요, LifeCycleServlet 입니다."+"</h1>" );
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet doPost call..");
		this.doGet(req, resp);
	}

//	@Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		System.out.println("LifeCycleServlet service call..");
//	}

	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet destroy call..");
		
	}

	@Override
	public void init() throws ServletException {
		System.out.println("LifeCycleServlet init call..");
	
		
	}
	
	
	
}
