package m_Interface;

import java.util.List;

public interface DAO<T> {

    int addNew(T t);
    List<T> getAll();
    void showInfo(List<T> list);
}
