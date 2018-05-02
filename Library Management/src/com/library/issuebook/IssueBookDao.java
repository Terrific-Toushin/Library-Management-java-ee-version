package com.library.issuebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.main.db;

public class IssueBookDao {

	public static int save(Issue i) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into issue_books(book_id,book_name,student_name,student_id,issue_date,return_date) values(?,?,?,?,?,?)");
			ps.setInt(1, i.getIssueBookId());
			ps.setString(2, i.getIssueBookName());
			ps.setString(3, i.getIssueStudentId());
			ps.setString(4, i.getIssueStudentName());
			ps.setString(5, i.getIssueDate());
			ps.setString(6, i.getReturnDate());

			status = ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	/*
	 * public static int update(Issue i) { int status = 0; try { Connection con =
	 * db.getConnection(); PreparedStatement ps = con.prepareStatement(
	 * "update issue_books set book_name=?, student_id=?, student_name=?, issue_date=?, return_date=? where book_id=?"
	 * );
	 * 
	 * ps.setString(1, i.getIssueBookName()); ps.setString(2,
	 * i.getIssueStudentId()); ps.setString(3, i.getIssueStudentName());
	 * ps.setString(4, i.getIssueDate()); ps.setString(5, i.getReturnDate());
	 * ps.setInt(6, i.getIssueBookId());
	 * 
	 * status = ps.executeUpdate();
	 * 
	 * con.close(); } catch (Exception e) { System.out.println(e); }
	 * 
	 * return status; }
	 */

	public static int delete(String ststudentid, String stbookname) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from issue_books where student_id=? && book_name=?");
			ps.setString(1, ststudentid);
			ps.setString(2, stbookname);

			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static List<Issue> getAllRecords() {
		List<Issue> list = new ArrayList<Issue>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from issue_books");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Issue i = new Issue();
				i.setIssueBookId(rs.getInt("book_id"));
				i.setIssueBookName(rs.getString("book_name"));
				i.setIssueStudentId(rs.getString("student_id"));
				i.setIssueStudentName(rs.getString("student_name"));
				i.setIssueDate(rs.getString("issue_date"));
				i.setReturnDate(rs.getString("return_date"));

				list.add(i);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static List<Issue> getSearchRecords(int inbookid) {
		List<Issue> ilist = new ArrayList<Issue>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from issue_books where book_id=?");
			ps.setInt(1, inbookid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Issue i = new Issue();
				i.setIssueBookId(rs.getInt("book_id"));
				i.setIssueBookName(rs.getString("book_name"));
				i.setIssueStudentId(rs.getString("student_id"));
				i.setIssueStudentName(rs.getString("student_name"));
				i.setIssueDate(rs.getString("issue_date"));
				i.setReturnDate(rs.getString("return_date"));

				ilist.add(i);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return ilist;
	}
}
