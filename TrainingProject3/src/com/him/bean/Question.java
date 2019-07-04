package com.him.bean;

import java.sql.Timestamp;

public class Question {
	
	private int qid;
	private int aid;
	private int L_ID;
	private int New_LID;
	private int name;
	private String U_NAME;
	private Timestamp TIME;
	
	
	public String getU_NAME() {
		return U_NAME;
	}
	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}
	public Question(String qUE, String uNAME, Timestamp time, int qID) {
		// TODO Auto-generated constructor stub
		this.question=qUE;
		this.U_NAME=uNAME;
		this.TIME=time;
		System.out.println("checking in bean");
		System.out.println(time);
		this.qid=qID;		
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getNew_LID() {
		return New_LID;
	}
	public void setNew_LID(int new_LID) {
		New_LID = new_LID;
		
	}
	public int getL_ID() {
		return L_ID;
	}
	public void setL_ID(int l_ID) {
		L_ID = l_ID;
		System.out.println("bean");
		System.out.println(l_ID);
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
		System.out.println("checking in bean");
		System.out.println(question);
	}
	private String question;
	

}
