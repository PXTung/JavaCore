package dao;

import m_interface.DAO;
import module.Bill;

import java.util.List;

public class BillDAO implements DAO<Bill> {

	/**
	 * 
	 * @param bill
	 */
	public void add(Bill bill) {
		// TODO - implement BillDAO.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement BillDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement BillDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Bill> find(String name) {
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public Bill getById(String id) {
		// TODO - implement BillDAO.getById
		throw new UnsupportedOperationException();
	}

	public List<Bill> getAll() {
		// TODO - implement BillDAO.getAll
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param minOrMax
	 */
	public List<Bill> getBookBorrowing(String minOrMax) {
		// TODO - implement BillDAO.getBookBorrowing
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param minOrMax
	 */
	public List<Bill> getPersonBorrowing(String minOrMax) {
		// TODO - implement BillDAO.getPersonBorrowing
		throw new UnsupportedOperationException();
	}
}