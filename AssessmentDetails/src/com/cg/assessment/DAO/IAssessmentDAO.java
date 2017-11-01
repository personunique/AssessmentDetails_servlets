package com.cg.assessment.DAO;

import java.util.ArrayList;

import com.cg.assessment.exception.AssessmentException;
import com.cg.bean.AssessmentInfo;

public interface IAssessmentDAO {

	int insert(AssessmentInfo bean) throws AssessmentException;

	ArrayList<Integer> retrieveId() throws AssessmentException;

}
