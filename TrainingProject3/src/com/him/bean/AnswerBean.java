package com.him.bean;

public class AnswerBean {
	
	private int New_LID;
	private int Qus_ID;
	public int getQus_ID() {
		return Qus_ID;
	}
	public void setQus_ID(int qus_ID) {
		Qus_ID = qus_ID;
	}
	private String answer;
	public int getNew_LID() {
		return New_LID;
	}
	public void setNew_LID(int new_LID) {
		New_LID = new_LID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
