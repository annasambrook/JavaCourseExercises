package com.anna.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.anna.database.BookDatabase;
import com.anna.entity.Book;

@Component("dao")
public class BookDaoImpl implements BookDao{

    @Override
    public Collection<Book> listAllBooks() {
    	Connection connection = null;
		PreparedStatement preparedStatement;

		Collection<Book> bookList = new ArrayList<Book>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "");

			preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("bookID");
				String name = resultSet.getString("bookName");
				String author = resultSet.getString("authorName");
				int copies = resultSet.getInt("numberCopies");

				bookList.add(new Book(id, name, author, copies));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bookList;
    }


    @Override
    public Book searchBookId(int bookID) {
    	Connection connection = null;
		PreparedStatement preparedStatement;

		Book book=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "");

			preparedStatement = connection.prepareStatement("SELECT * FROM BOOKS WHERE BOOKID=?");
			
			preparedStatement.setInt(1, bookID);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("bookID");
				String name = resultSet.getString("bookName");
				String author = resultSet.getString("authorName");
				int copies = resultSet.getInt("numberCopies");

				book = new Book(id, name, author, copies);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
    }

    @Override
    public int addBook(Book book) {
    	Connection connection = null;
		PreparedStatement preparedStatement;

		int rows=0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "");

			preparedStatement = connection.prepareStatement("INSERT INTO BOOKS VALUES(?,?,?,?)");
			
			preparedStatement.setInt(1, book.getBookId());
			preparedStatement.setString(2, book.getBookName());
			preparedStatement.setString(3, book.getAuthorName());
			preparedStatement.setInt(4, book.getNumberCopies());

			rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
    }


	@Override
	public int deleteBook(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		int rows=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "");

			preparedStatement = connection.prepareStatement("DELETE FROM BOOKS WHERE BOOKID=?");

			preparedStatement.setInt(1, id);

			rows = preparedStatement.executeUpdate();

			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return rows;
	}
	

}
