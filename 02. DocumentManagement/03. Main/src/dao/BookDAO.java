package dao;

import module.Book;
import module.Document;

import java.util.List;

public class BookDAO extends DocumentDAO {

	/**
	 * 
	 * @param book
	 */
	public void add(Book book) {
		// TODO - implement BookDAO.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement BookDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement BookDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Document> find(String name) {
		return super.find(name);
	}
}