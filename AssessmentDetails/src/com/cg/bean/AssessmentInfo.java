package com.cg.bean;

public class AssessmentInfo {
	private int trainee_id;
	private String module_name;
	private int mpt;
	private int mtt;
	private int ass_marks;
	private int total;
	private int grade;
	
	
public AssessmentInfo(int trainee_id, String module_name, int total,
			int grade) {
		super();
		this.trainee_id = trainee_id;
		this.module_name = module_name;
		this.total = total;
		this.grade = grade;
	}








	public int getTrainee_id() {
		return trainee_id;
	}








	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}








	public String getModule_name() {
		return module_name;
	}








	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}








	public int getMpt() {
		return mpt;
	}








	public void setMpt(int mpt) {
		this.mpt = mpt;
	}








	public int getMtt() {
		return mtt;
	}








	public void setMtt(int mtt) {
		this.mtt = mtt;
	}








	public int getAss_marks() {
		return ass_marks;
	}








	public void setAss_marks(int ass_marks) {
		this.ass_marks = ass_marks;
	}








	public int getTotal() {
		return total;
	}








	public void setTotal(int total) {
		this.total = total;
	}








	public int getGrade() {
		return grade;
	}








	public void setGrade(int grade) {
		this.grade = grade;
	}








	public AssessmentInfo() {
		
	}
	
}
