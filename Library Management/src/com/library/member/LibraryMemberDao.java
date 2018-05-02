package com.library.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.main.db;

public class LibraryMemberDao {

	public static int save(Member m) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into library_member(member_id, name, contact, position, joining_date) values(?,?,?,?,?)");
			ps.setInt(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(3, m.getContact());
			ps.setString(4, m.getPosition());
			ps.setString(5, m.getJoiningDate());

			status = ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static int update(Member m) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update library_member set name=?, position=?, contact=?, joining_date=? where member_id=?");
			ps.setString(1, m.getName());
			ps.setString(2, m.getPosition());
			ps.setString(3, m.getContact());
			ps.setString(4, m.getJoiningDate());
			ps.setInt(5, m.getId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static int delete(int id, String name) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from library_member where member_id=? && name=?");
			ps.setInt(1, id);
			ps.setString(2, name);

			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static List<Member> getAllRecords() {
		List<Member> list = new ArrayList<Member>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from library_member");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Member m = new Member();
				m.setId(rs.getInt("member_id"));
				m.setName(rs.getString("name"));
				m.setPosition(rs.getString("position"));
				m.setContact(rs.getString("contact"));
				m.setJoiningDate(rs.getString("joining_date"));
				list.add(m);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static Member getRecordById(int id) {
		Member m = null;
		try {
			Connection con = db.getConnection();
			System.out.println("executed1");
			PreparedStatement ps = con.prepareStatement("select * from library_member where member_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			System.out.println("executed2");
			if (rs.next()) {
				m = new Member();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setPosition(rs.getString(3));
				m.setContact(rs.getString(4));
				m.setJoiningDate(rs.getString(5));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return m;
	}

}
