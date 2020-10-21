package dao;

import mapper.IMapper;

import java.util.List;

public interface GenericDAO<T> {
    List<T> query(String sql, IMapper<T> mapper, Object... parameters);
    void insert(String sql, Object ... parameters);
}
