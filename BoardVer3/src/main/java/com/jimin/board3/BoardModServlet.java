package com.jimin.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iboard = request.getParameter("iboard");
		int intIboard = Integer.parseInt(iboard);
		BoardVO vo = new BoardVO();
		vo.setIboard(intIboard);
		BoardVO data = BoardDAO.selBoard(vo);
		request.setAttribute("data", data);
		
		String jsp = "WEB-INF/home/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request,response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iboard = request.getParameter("iboard");
		int intIboard = Integer.parseInt(iboard);
		String ttitle = request.getParameter("ttitle");
		String content = request.getParameter("content");
		BoardVO bowl = new BoardVO();
		bowl.setIboard(intIboard);
		bowl.setTitle(ttitle);
		bowl.setCtnt(content);
		BoardDAO.updateBoard(bowl);
		
		response.sendRedirect("/detail?iboard=" + iboard);
	}

}
