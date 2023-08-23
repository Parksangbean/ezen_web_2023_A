package model.dto;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.dao.AccountbookDao;
import model.dao.VisitDao;


@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Accountbook() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String atext = request.getParameter("atext");
		int aprice = Integer.parseInt(request.getParameter("aprice"));
		String adate = request.getParameter("adate");
		
		AccountbookDto accountbookDto = new AccountbookDto(atext,aprice,adate);
		
		boolean result = AccountbookDao.getinstance().atext(accountbookDto);
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(result);
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<AccountbookDto> result = AccountbookDao.getinstance().aread();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray=objectMapper.writeValueAsString(result);
		System.out.println(jsonArray);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(jsonArray);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
