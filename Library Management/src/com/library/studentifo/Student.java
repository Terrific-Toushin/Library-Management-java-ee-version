package com.library.studentifo;

import java.sql.Blob;

public class Student {

	private int contact;
	private String studentid, name, roll, batch, dept, session, issuecard;
	private Blob image;

	public String getStudentId() {
		return studentid;
	}

	public void setStudentId(String studentid) {
		this.studentid = studentid;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getIssueCard() {
		return issuecard;
	}

	public void setIssueCard(String issuecard) {
		this.issuecard = issuecard;
	}
}
