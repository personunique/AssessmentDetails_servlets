package com.cg.assess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.assessment.exception.AssessmentException;
import com.cg.assessment.service.AssessmentServiceImpl;
import com.cg.assessment.service.IAssessmentService;
import com.cg.bean.AssessmentInfo;



@WebServlet("*.obj")
public class AssessmentController extends HttpServlet 


{
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
		HttpSession session=request.getSession();
		AssessmentInfo bean=new AssessmentInfo();
		IAssessmentService service=new AssessmentServiceImpl();
		out=response.getWriter();
		String path=request.getServletPath();
		String target=null;
		switch(path)
		{
		case "/add.obj":
			ArrayList<Integer> list;
			try {
				list = service.retrieveId();
				session.setAttribute("list", list);
				target="AddAssessment.jsp";
			} catch (AssessmentException e) {
				session.setAttribute("error", e.getMessage());
				target="Error.jsp";
				e.printStackTrace();
			}
			
			
			break;
			
		case "/retrieve.obj":
			try {
			int id=Integer.parseInt(request.getParameter("ddlId"));
			String name=request.getParameter("ddlname");
			int practical=Integer.parseInt(request.getParameter("practical"));
			
			int theory=Integer.parseInt(request.getParameter("theory"));
			int assignment=Integer.parseInt(request.getParameter("ass"));
			
			
			bean.setTrainee_id(id);
			bean.setModule_name(name);
			bean.setMpt(practical);
			
			
			bean.setMtt(theory);
			
			bean.setAss_marks(assignment);
			
			int prac=(int)(0.7*practical);
			System.out.println(prac);
			int the=(int)(0.15*theory);
			int ass=(int)(0.15*assignment);
			
			int total=prac+the+ass;
			System.out.println(total);
			int grade=service.givegrade(total);
			bean.setTotal(total);
			bean.setGrade(grade);
			
				int res=service.insert(bean);
				if(res>0)
				{
					session.setAttribute("id", id);
					session.setAttribute("name", name);
					session.setAttribute("total", "total");
					session.setAttribute("grade", grade);
					target="ModuleScores.jsp";
				}
				else
				{
					target="ErrorPage.jsp";
				}
				}
			 catch (AssessmentException e) {
				 session.setAttribute("error", e.getMessage());
					target="Error.jsp";
			}
			
			
			break;
	}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	

	}

}
