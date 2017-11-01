package com.cg.assessment.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.assessment.DbUtil.DbUtil;
import com.cg.assessment.exception.AssessmentException;

import com.cg.bean.AssessmentInfo;


public class AssessmentDAOImpl implements IAssessmentDAO{
	Connection conn=null;
	@Override
	public int insert(AssessmentInfo bean) throws AssessmentException{
		/*********************************************************************************
		-Function Name		:	insert(AssessmentInfo bean)
		-Input Parameters	:	AssessmentInfo bean
		-Return Type		:	int
		-Throws				:	AssessmentException
		-Author				:	Rahul Vishwakarma
		-Creation Date		:	11/10/2017
		-Description		:	Inserting Assessment data
		**********************************************************************************/
		int row=0;
		int value=0;
		try{
			conn=DbUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into AssessmentScore values(?,?,?,?,?,?,?)");
			
			ps.setInt(1,bean.getTrainee_id());
			ps.setString(2,bean.getModule_name());
			ps.setInt(3,bean.getMpt());
			ps.setInt(4,bean.getMtt());
			ps.setInt(5,bean.getAss_marks());
			ps.setInt(6,bean.getTotal());
			ps.setInt(7,bean.getGrade());
			
			
			row=ps.executeUpdate();
		}
			
		catch(SQLException e)
		{
			
			throw new AssessmentException("ERROR:" +e.getMessage());
		}
		return row;
	}

	@Override
	public ArrayList<Integer> retrieveId() throws AssessmentException{
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		try
		{
		conn=DbUtil.getConnection();
		String sl="Select trainee_id from trainees";
		
		
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(sl);
		while(rs.next())
		{
			
			list.add(rs.getInt(1));
		}
		System.out.println(list);
	}
	catch(SQLException e)
	{
	
		System.out.println(e.getMessage());
	}
	return list;
	}

	}


