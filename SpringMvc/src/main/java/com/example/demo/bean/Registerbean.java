package com.example.demo.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Registered")
public class Registerbean {

	@OneToMany(mappedBy = "rb", cascade = CascadeType.ALL)
	private Set<Quebean> que;

	public Set<Quebean> getQue() {
		return que;
	}

	public void setQue(Set<Quebean> que) {
		this.que = que;
	}
	@OneToMany(mappedBy = "rb", cascade = CascadeType.ALL)
	private Set<Ansbean> ans;
	@OneToMany(mappedBy = "rb", cascade = CascadeType.ALL)
	private Set<Point> p;


	public Set<Point> getP() {
		return p;
	}

	public void setP(Set<Point> p) {
		this.p = p;
	}

	public Set<Ansbean> getAns() {
		return ans;
	}

	public void setAns(Set<Ansbean> ans) {
		this.ans = ans;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String first_name;
	@Column
	private String last_name;	
	@Column
	private String email;	
	@Column
	private int contact;	
	@Column
	private String company;	
	@Column
	private String userName;	
	@Column
	private String passWord;	
	@Column
	private String cPass;	
	public Registerbean()
	{
		
	}
public Registerbean( String fn,String ln, String em,int con,String cmp,String un,String ps,String cp,Set<Quebean> employeeAddress) {
		 super();
	        this.first_name = fn;
	        this.last_name = ln;
	        this.email = em;
	        this.contact = con;
	        this.company = cmp;
	        this.userName = un;
	        this.passWord = ps;
	        this.cPass = cp;
	         
	        this.que= employeeAddress;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getcPass() {
		return cPass;
	}

	public void setcPass(String cPass) {
		this.cPass = cPass;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
