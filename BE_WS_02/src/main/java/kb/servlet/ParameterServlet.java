package kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns={ "/params"}, loadOnStartup =1)
public class ParameterServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;charset=UTF-8");
	
		HashMap<String,String> map = new HashMap<String,String>();
		
		String job = req.getParameter("job");
		String pageNo = req.getParameter("pageNo");
		String searchWord = req.getParameter("searchWord");
		map.put("job", job);
		map.put("pageNo", pageNo);
		map.put("searchWord", searchWord);
		req.setAttribute("map", map);
		req.getRequestDispatcher("getResult.jsp").forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
	    String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    String gender = req.getParameter("gender");
	    String [] hobby = req.getParameterValues("hobby");
	    String favorite = req.getParameter("favorite");
	    String desc = req.getParameter("desc");
	   
	    ParameterDto param = new ParameterDto(name, email, gender, hobby, favorite, desc);
	    req.setAttribute("param", param);
	    req.getRequestDispatcher("postResult.jsp").forward(req, resp);
	    
	}


	@Override
	public void destroy() {}

	@Override
	public void init() throws ServletException {}
}
