package org.sakaiproject.tool.gradebook;

import java.io.Serializeable;

public class RankingView extends GradebookFeedback implements Serializeable{
	private int 	no;
	private int 	studentId;
	private int 	totalPoint;
	private int 	feedbackId;
}