package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.AccountbookDao;
import model.dto.AccountbookDto;

@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Accountbook() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acontent=request.getParameter("acontent");
		int aprice= Integer.parseInt(request.getParameter("aprice"));
		String adate=request.getParameter("adate");
		
		AccountbookDto accountbookDto = new AccountbookDto(acontent,aprice,adate);
		
		boolean result=AccountbookDao.getInstanct().awriter(accountbookDto);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
