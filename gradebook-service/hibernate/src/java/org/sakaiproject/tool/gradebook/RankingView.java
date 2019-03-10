package org.sakaiproject.tool.gradebook;

import java.io.Serializeable;

public class RankingView extends GradebookFeedback implements Serializeable{
	private int 	no;
	private int 	studentId;
	private int 	totalPoint;
	private int 	feedbackId;
	private int 	uuid;

	public void setNo(int aNo){
		this.no 		= aNo;
	}

	public int 	getNo(){
		return 			no;
	}

	public void setStudentId(int aStudentId){
		this.studentId 	= aStudentId;
	}

	public int 	getStudentId(){
		return 			studentId;
	}

	public void setTotalPoint(int aTotalPoint){
		this.totalPoint = aTotalPoint;
	}

	public int 	getTotalPoint(){
		return 			totalPoint;
	}

	public void setFeedbackId(int aFeedbackId){
		this.feedbackId = aFeedbackId;
	}

	public int 	getFeedbackId(){
		return 			feedbackId;
	}

	public void setUuid(int aUuid){
		this.uuid 		= aUuid;
	}

	public int 	getUuid(){
		return 			uuid;
	}
}