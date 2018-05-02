package com.library.issuebook;

public class Issue {
	
	private int issuebookid;
	private String isuuebookname, issuestudentid, issuestudentname, issuedate, returndate;

	public int getIssueBookId() {
		return issuebookid;
	}

	public void setIssueBookId(int issuebookid) {
		this.issuebookid = issuebookid;
	}

	public String getIssueBookName() {
		return isuuebookname;
	}

	public void setIssueBookName(String issuebookname) {
		this.isuuebookname = issuebookname;
	}

	public String getIssueStudentId() {
		return issuestudentid;
	}

	public void setIssueStudentId(String issuestudentid) {
		this.issuestudentid = issuestudentid;
	}

	public String getIssueStudentName() {
		return issuestudentname;
	}

	public void setIssueStudentName(String issuestudentname) {
		this.issuestudentname = issuestudentname;
	}

	public String getIssueDate() {
		return issuedate;
	}

	public void setIssueDate(String issuedate) {
		this.issuedate = issuedate;
	}
	
	public String getReturnDate() {
		return returndate;
	}

	public void setReturnDate(String returndate) {
		this.returndate = returndate;
	}

}
