package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParameterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;charset=UTF-8");
	
		
		String job = req.getParameter("job");
		String pageNo = req.getParameter("pageNo");
		String searchWord = req.getParameter("searchWord");
		
		//브라우저에 출력
		PrintWriter out  = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>servlet 연습</title></head>");
		out.println("<body>");
		out.println("<h1>job: "+ job +"</h1>");
		out.println("<h1>pageNo: "+ pageNo +"</h1>");
		out.println("<h1>searchWord: "+ searchWord +"</h1>");
	
		out.println("</body>");
		out.print("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//post 방식으로 전송되는 한글 인코딩 설정 
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String[] hobby = req.getParameterValues("hobby");
		String invest = req.getParameter("favorite");
		String desc = req.getParameter("desc");
		

		PrintWriter out  = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>servlet 연습</title></head>");
		out.println("<body>");
		out.println("<h3>name: "+ name +"</h3>");
		out.println("<h3>email: "+ email +"</h3>");
		out.println("<h3>gender: "+ gender +"</h3>");
		out.println("<h3>hobby: ");
		
		for(String h: hobby) {
			out.print(h + ", ");
		}
		out.println("</h3>");
		out.println("<h3>favorite: "+ invest +"</h3>");
		out.println("<h3>desc: "+ desc +"</h3>");
		
		out.println("</body>");
		out.print("<html>");
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(req, resp);
//	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

}
