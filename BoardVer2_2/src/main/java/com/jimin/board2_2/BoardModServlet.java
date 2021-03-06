package com.jimin.board2_2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String no = request.getParameter("no");
		int intNo = Integer.parseInt(no);
		request.setAttribute("vo",Database.db.get(intNo));
		
		String jsp = "WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String no = request.getParameter("no");
			String title = request.getParameter("title");
			String ctnt = request.getParameter("ctnt");
			int intNo = Integer.parseInt(no);
			
			
//			List<BoardVO> list = Database.db;
//			BoardVO vo = list.get(intNo);
//			
//			vo.setTitle(title);
//			vo.setCtnt(ctnt);
			
			Database.db.get(intNo).setCtnt(ctnt);
			Database.db.get(intNo).setTitle(title);
			
			response.sendRedirect("/detail?no=" + no);
	}

}
