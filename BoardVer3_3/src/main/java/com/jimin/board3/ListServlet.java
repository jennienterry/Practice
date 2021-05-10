package com.jimin.board3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		List<BoardVO> list = BoardDAO.selBoardList();
		request.setAttribute("list", list);
		
		
		
		String jsp = "/WEB-INF/view/list.jsp";
		request.getRequestDispatcher(jsp).forward(request,response);
		
		// * MyUtils class에 static 안붙은 경우 //
		// MyUtils utils = new MyUtils();// 객체화 계속되면 메모리적으로 불리함
		// utils.openJSP(jsp, request, response);
					
				
		// * MyUtils class에 static 붙은 경우 //
		openJSP(jsp, request, response);
			
	}

}