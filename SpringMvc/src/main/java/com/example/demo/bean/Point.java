package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Points")
public class Point {

	
	public Point() {

	}
	public Ansbean getAb() {
		return ab;
	}
	public void setAb(Ansbean ab) {
		this.ab = ab;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	private Registerbean rb;
	@ManyToOne(fetch = FetchType.LAZY)
	private Ansbean ab;


	@ManyToOne(fetch = FetchType.LAZY)
	private Quebean qbid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;

	
	public Registerbean getRb() {
		return rb;
	}
	public void setRb(Registerbean rb) {
		this.rb = rb;
	}
	public Quebean getQbid() {
		return qbid;
	}
	public void setQbid(Quebean qbid) {
		this.qbid = qbid;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public long getTotlike() {
		return Totlike;
	}
	public void setTotlike(long totlike) {
		Totlike = totlike;
	}
	public long getTothelp() {
		return Tothelp;
	}
	public void setTothelp(long tothelp) {
		Tothelp = tothelp;
	}
	public long getCorrect() {
		return correct;
	}
	public void setCorrect(long correct) {
		this.correct = correct;
	}
	@Column
	private long Totlike;
	@Column
	private long Tothelp;
	@Column
	private long correct;
}
