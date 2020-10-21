package dao;

import m_interface.DAO;
import module.Person;

import java.util.List;

public class PersonDAO implements DAO<Person> {

	/**
	 * 
	 * @param person
	 */
	public void add(Person person) {
		// TODO - implement PersonDAO.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void edit(String id) {
		// TODO - implement PersonDAO.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void remove(String id) {
		// TODO - implement PersonDAO.remove
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Person> find(String name) {
		return null;
	}
}