package com.jimin.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String iboard = request.getParameter("iboard");
		//int intIboard = Integer.parseInt(iboard);
		
		int iboard = MyUtils.getParamInt("iboard", request);
		
		BoardVO vo = new BoardVO (); 
		vo.setIboard(intIboard);
		//vo = BoardDAO.selBoard(vo);
		request.setAttribute("vo", BoardDAO.selBoard(vo));
		
		//String jsp = "/WEB-INF/view/detail.jsp";
		//request.getRequestDispatcher(jsp).forward(request, response);
		
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
		utils.openJSP(jsp, request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
