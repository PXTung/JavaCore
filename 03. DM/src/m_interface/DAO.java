package m_interface;

import java.util.ArrayList;
import java.util.List;

public interface DAO<T> {
    void add(T t);

    void edit(String id);

    void remove(String id);

    void find(String string);

    <O> void show(ArrayList<O> o);
}
