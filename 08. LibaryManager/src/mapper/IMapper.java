package mapper;

import java.sql.ResultSet;

public interface IMapper<T> {
    T rowMapper(ResultSet resultSet);
}
