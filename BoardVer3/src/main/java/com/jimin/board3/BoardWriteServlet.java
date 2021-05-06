package com.jimin.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "WEB-INF/home/write.jsp";
		request.getRequestDispatcher(jsp).forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ttitle = request.getParameter("ttitle");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setTitle(ttitle);
		vo.setCtnt(content);
		request.setAttribute("vo", vo);
		
		BoardDAO.insertBoard(vo);
		response.sendRedirect("/list");
		
	}

}
