package dao;

import m_interface.DAO;
import module.BookState;
import module.Borrowing;

import java.util.List;

public class BorrowingDAO implements DAO<Borrowing> {

	/**
	 * 
	 * @param bookState
	 */
	public void add(BookState bookState) {
		// TODO - implement BorrowingDAO.add
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(Borrowing borrowing) {

	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement BorrowingDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement BorrowingDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Borrowing> find(String name) {
		return null;
	}

	public List<Borrowing> sortByReaderName() {
		// TODO - implement BorrowingDAO.sortByReaderName
		throw new UnsupportedOperationException();
	}

	public List<Borrowing> sortByQuantity() {
		// TODO - implement BorrowingDAO.sortByQuantity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public List<Borrowing> findByName(String name) {
		// TODO - implement BorrowingDAO.findByName
		throw new UnsupportedOperationException();
	}

	public List<Borrowing> getAll() {
		// TODO - implement BorrowingDAO.getAll
		throw new UnsupportedOperationException();
	}
}