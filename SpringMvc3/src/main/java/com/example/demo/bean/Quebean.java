package com.example.demo.bean;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class Quebean {

//	 
//	 @ManyToOne(cascade= CascadeType.ALL,targetEntity=Registerbean.class)
//	    @JoinColumn(name = "r_ID")
//	    private Registerbean rb;
//
//	   public Quebean() {
//	        super();
//		}
//
//	
	@OneToMany(mappedBy = "qbid", cascade = CascadeType.ALL)
	private Set<Ansbean> ansob;
	

	
	public Set<Ansbean> getAnsob() {
		return ansob;
	}

	public void setAnsob(Set<Ansbean> ansob) {
		this.ansob = ansob;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Registerbean rb;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;
	
	@Column
	private String Que;

	public Quebean() {

	}

	public Quebean(String qu, Registerbean rb) {
		super();
		this.Que = qu;

		this.rb = rb;
		
	}

	public Registerbean getRb() {
		return rb;
	}

	public void setRb(Registerbean rb) {
		this.rb = rb;
	}

	

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getQue() {
		return Que;
	}

	public void setQue(String que) {
		Que = que;
	}

}
