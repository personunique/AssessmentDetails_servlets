package com.cg.assessment.service;

import java.util.ArrayList;

import com.cg.assessment.exception.AssessmentException;
import com.cg.bean.AssessmentInfo;

public interface IAssessmentService {

	ArrayList<Integer> retrieveId() throws AssessmentException;

	int givegrade(int total);

	int insert(AssessmentInfo bean) throws AssessmentException;

	

}
