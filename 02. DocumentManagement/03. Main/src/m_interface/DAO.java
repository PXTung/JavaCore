package m_interface;

import java.util.List;

public interface DAO<T> {

	/**
	 * 
	 * @param t
	 */
	void add(T t);

	/**
	 * 
	 * @param id
	 */
	void edit(String id);

	/**
	 * 
	 * @param id
	 */
	void remove(String id);

	/**
	 *
	 * @param name
	 */
	List<T> find(String name);

}