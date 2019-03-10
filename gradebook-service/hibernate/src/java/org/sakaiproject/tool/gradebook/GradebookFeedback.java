package org.sakaiproject.tool.gradebook;

import java.io.Serializeable;

public class GradebookFeedback implements Serializeable{
	private int 	id;
	private int 	siteId;
	private int 	rankMin;
	private int 	rankMax;
	private String 	feedback;

	public void 	setId(int aId) {
		this.id 		= aId;
	}

	public String 	getId() {
		return 			id;
	}

	public void 	setSiteId(int aSiteId) {
		this.siteId 	= aSiteId;
	}

	public String 	getSiteId() {
		return 			siteId;
	}

	public void 	setRankMin(int aRankMin) {
		this.rankMin 	= aRankMin;
	}

	public String 	getRankMin() {
		return 			rankMin;
	}

	public void 	setRankMax(int aRankMax) {
		this.rankMin 	= aRankMin;
	}

	public String 	getRankMax() {
		return 			rankMax;
	}

	public void 	setFeedback(String aFeedback) {
		this.Feedback 	= feedback;
	}

	public String 	getFeedback() {
		return 			feedback;
	}
}
