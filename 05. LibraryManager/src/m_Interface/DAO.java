package m_Interface;

import java.util.ArrayList;

public interface DAO<O> {
    <T> void add(T t);

    <T> void show(ArrayList<T> ts);

    void edit(String id);

    void remove(String id);

    void find(String name);
}
