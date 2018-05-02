package com.library.reservebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.main.db;

public class ReserveBookDao {

	public static int save(Book b) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into library_books(book_id,book_name,author,publisher,quantity) values(?,?,?,?,?)");
			ps.setInt(1, b.getBookId());
			ps.setString(2, b.getBookName());
			ps.setString(3, b.getAuthor());
			ps.setString(4, b.getPublisher());
			ps.setInt(5, b.getQuantity());

			status = ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static int update(Book b) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update library_books set book_name=?, author=?, publisher=?, quantity=? where book_id=?");
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getPublisher());
			ps.setInt(4, b.getQuantity());
			ps.setInt(5, b.getBookId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static int delete(int inbookid) {
		int status = 0;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from library_books where book_id=?");
			ps.setInt(1, inbookid);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static List<Book> getAllRecords() {
		List<Book> list = new ArrayList<Book>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from library_books");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book b = new Book();
				b.setBookId(rs.getInt("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setQuantity(rs.getInt("quantity"));
				list.add(b);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static List<Book> getSearchRecords(int inbookid) {
		List<Book> slist = new ArrayList<Book>();

		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from library_books where book_id=?");
			ps.setInt(1, inbookid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book b = new Book();
				b.setBookId(rs.getInt("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor(rs.getString("author"));
				b.setPublisher(rs.getString("publisher"));
				b.setQuantity(rs.getInt("quantity"));
				slist.add(b);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return slist;
	}

	public static Book getRecordById(int inbookid) {
		Book b = null;
		try {
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from library_books where book_id=?");
			ps.setInt(1, inbookid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				b = new Book();
				b.setBookId(rs.getInt(1));
				b.setBookName(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setPublisher(rs.getString(4));
				b.setQuantity(rs.getInt(5));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

}
