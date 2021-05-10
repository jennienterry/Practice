package com.jimin.board3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtils {// 클래스 하나 만들기
		public static int getParamInt(String key, HttpServletRequest req) {
			String strVal = req.getParameter(key);
			return parseStringToInt(strVal); // 방법 1
		 /* int intVal = parseStringToInt(strVal);
			return intVal; 방법 2*/
		//  return parseStringToInt(req.getParameter(key)); 방법 2
		}
		
		
	public static int parseStringToInt(String strNum) {
				try {
					return Integer.parseInt(strNum); //정수 값으로 바꿔서 return 해준다
				} catch(Exception e) {
					return 0;
				}
		}
	
	
	public static void openJSP(String fileNm, HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
					//request.getRequestDispatcher(fileNm).forward(request,response);		
					
					/* openJSP 호출하기
					 * 1. static 인지 아닌지 판단하기
					 * 2. 아니니까 메모리에 안올라가있음 -> 사용하기 전에 메모리에 올리기 (올리고 나서 호출)
					 * * 자바는 class 단위로만 1급 객체가 될 수 있음 = 클래스를 객체화해야함 = 필요한 것만 클래스화하기, 안에 여러개 넣지*
					*/
		
					String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
					request.getRequestDispatcher(jsp).forward(request,response);
					// request.getRequestDispatche(jsp).forward(request,response); 위 두줄과 같은의미
					
			// throws ServletException, IOException (= do get에 있는 예외, 가 있으면 try, catch 안해도 됨) <-> throws Exception
			
			
					
			}
			
		}
	