package com.library.studentifo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.main.db;

/**
 * @author hp
 *
 */
public class StudentInfoDao {

	public static int save(String st_id, String name, String roll, String batch, String department, String year,
			int contact, String issue_card, File img, FileInputStream fis) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into student(student_id,name,roll,batch,department,year,contact,issue_card,image) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, st_id);
			ps.setString(2, name);
			ps.setString(3, roll);
			ps.setString(4, batch);
			ps.setString(5, department);
			ps.setString(6, year);
			ps.setInt(7, contact);
			ps.setString(8, issue_card);
			/*
			 * InputStream inputStream = input.getInputStream(); ps.setBlob(9, inputStream);
			 */
			ps.setBinaryStream(9, fis, (int) img.length());

			status = ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static int update(String st_id, String name, String roll, String batch, String department, String year,
			int contact, String issue_card, File img, FileInputStream fis) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update student set name=?, roll=?, batch=?, department=?, year=?, contact=?, issue_card=?, image=? where student_id=?");

			ps.setString(1, name);
			ps.setString(2, roll);
			ps.setString(3, batch);
			ps.setString(4, department);
			ps.setString(5, year);
			ps.setInt(6, contact);
			ps.setString(7, issue_card);
			ps.setBinaryStream(8, fis, (int) img.length());
			ps.setString(9, st_id);

			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static int delete(String stid) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where student_id=?");
			ps.setString(1, stid);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static List<Student> getAllRecords() {
		List<Student> list = new ArrayList<Student>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setStudentId(rs.getString(1));
				s.setName(rs.getString(2));
				s.setRoll(rs.getString(3));
				s.setBatch(rs.getString(4));
				s.setDept(rs.getString(5));
				s.setSession(rs.getString(6));
				s.setContact(rs.getInt(7));
				s.setIssueCard(rs.getString(8));
				s.setImage(rs.getBlob(9));

				list.add(s);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static List<Student> getSearchRecords(String stid) {
		List<Student> slist = new ArrayList<Student>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where student_id=?");
			ps.setString(1, stid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();

				s.setName(rs.getString(1));
				s.setRoll(rs.getString(2));
				s.setBatch(rs.getString(3));
				s.setDept(rs.getString(4));
				s.setSession(rs.getString(5));
				s.setContact(rs.getInt(6));
				s.setIssueCard(rs.getString(7));
				s.setImage(rs.getBlob(8));
				s.setStudentId(rs.getString(9));

				slist.add(s);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return slist;
	}

	public static Student getRecordById(String stid) {
		Student s = null;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where student_id=?");
			ps.setString(1, stid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s = new Student();

				s.setStudentId(rs.getString(1));
				s.setName(rs.getString(2));
				s.setRoll(rs.getString(3));
				s.setBatch(rs.getString(4));
				s.setDept(rs.getString(5));
				s.setSession(rs.getString(6));
				s.setContact(rs.getInt(7));
				s.setIssueCard(rs.getString(8));
				s.setImage(rs.getBlob(9));

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}

}
