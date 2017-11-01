package com.cg.assessment.service;

import java.util.ArrayList;

import com.cg.assessment.DAO.AssessmentDAOImpl;
import com.cg.assessment.DAO.IAssessmentDAO;
import com.cg.assessment.exception.AssessmentException;
import com.cg.bean.AssessmentInfo;



public class AssessmentServiceImpl implements IAssessmentService

{
IAssessmentDAO dao=null;
	
	@Override
	public int insert(AssessmentInfo bean) throws AssessmentException 
	/*********************************************************************************
	-Function Name		:	insert(AssessmentInfo bean)
	-Input Parameters	:	AssessmentInfo bean
	-Return Type		:	int
	-Throws				:	AssessmentException
	-Author				:	Rahul Vishwakarma
	-Creation Date		:	11/10/2017
	-Description		:	Inserting Assessment data
	**********************************************************************************/
	{
		dao=new AssessmentDAOImpl();
		return dao.insert(bean);
		
	}

	@Override
	public ArrayList<Integer> retrieveId() throws AssessmentException 
	/*********************************************************************************
	-Function Name		:	retrieveId() 
	-Input Parameters	:	AssessmentInfo bean
	-Return Type		:	ArrayList
	-Throws				:	AssessmentException
	-Author				:	Rahul Vishwakarma
	-Creation Date		:	11/10/2017
	-Description		:	Retrieving Assessment data
	**********************************************************************************/
	{
		dao=new AssessmentDAOImpl();
		return dao.retrieveId();
		
	}

	@Override
	public int givegrade(int total) {
		
		int grade=0;
		if(total>=90 && total<=100)
		{
			 grade = 5;
			 
		}
		else if(total>=80 && total<=89)
		{
			grade = 4;
		}
		else if(total>=70 && total<=79)
		{
			 grade = 3;
		}
		else if(total>=60 && total<=69)
		{
			 grade = 2;
		}
		else if(total>=50 && total<=59)
		{
			 grade = 1;
		}
		else if(total<=49)
		{
			 grade = 0;
		}
		return grade;
		
	}

	
}
