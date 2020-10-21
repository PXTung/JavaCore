package dao;

import m_interface.DAO;
import module.Book;
import module.Document;

import java.util.List;

public class DocumentDAO implements DAO<Document> {

	/**
	 * 
	 * @param document
	 */
	public void add(Document document) {
		// TODO - implement DocumentDAO.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement DocumentDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement DocumentDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Document> find(String name) {
		return null;
	}
}