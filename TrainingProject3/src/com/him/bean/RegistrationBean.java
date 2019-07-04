package com.him.bean;

import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.http.Part;

public class RegistrationBean {

	private int IdRegistration;
	private String FirstName;
	private String LastName;
	private String Password;
	private String ConfirmPassword;
	private String EmailId;
	private Blob photo1;
	private InputStream inputStream;
	private String UserName;
	private String Company;
	private String base64Image;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;

		System.out.println("cheching");
		System.out.println(userName);
	}

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void setPhoto(InputStream photo) {
	}

	public Blob getPhoto1() {
		return photo1;
	}

	public void setPhoto1(Blob photo1) {
		this.photo1 = photo1;
	}

	public int getIdRegistration() {
		return IdRegistration;
	}

	public void setIdRegistration(int idRegistration) {
		IdRegistration = idRegistration;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public Blob getPhoto() {
		return photo1;
	}

	public void setPhoto(Part part) {
		this.photo1 = (Blob) part;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

}
