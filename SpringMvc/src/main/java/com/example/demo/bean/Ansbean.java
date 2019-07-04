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
@Table(name = "Answerdata")
public class Ansbean {

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
	public Ansbean() {

	}
	
	@OneToMany(mappedBy = "ab", cascade = CascadeType.ALL)
	private Set<Point> pobj;;
	public Set<Point> getPobj() {
		return pobj;
	}
	public void setPobj(Set<Point> pobj) {
		this.pobj = pobj;
	}
	public int getLikec() {
		return Likec;
	}
	public void setLikec(int likec) {
		Likec = likec;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Registerbean rb;
	public Registerbean getRb() {
		return rb;
	}
	public String getAns() {
		return Ans;
	}

	public void setAns(String ans) {
		this.Ans = ans;
	}
	public void setRb(Registerbean rb) {
		this.rb = rb;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	private Quebean qbid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long aid;

	@Column
	private String Ans;
	@Column
	private int Likec;
	@Column
	private int Helpful;
	@Column
	private int valid;
	

	public int getLike() {
		return Likec;
	}
	public void setLike(int likec) {
		Likec = likec;
	}
	public int getHelpful() {
		return Helpful;
	}
	public void setHelpful(int helpful) {
		Helpful = helpful;
	}


	public Ansbean(String aa, Quebean qb,int l,int h,int v) {
		super();
		
		this.Ans = aa;
		this.qbid = qb;
		this.Likec=l;
		this.Helpful=h;
		this.valid=v;

	}

	public Long getAid() {
		return aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public Quebean getQbid() {
		return qbid;
	}

	public void setQbid(Quebean qbid) {
		this.qbid = qbid;
	}

	

}
