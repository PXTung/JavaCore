package dao.impl;

import dao.IPersonDAO;
import mapper.PersonMapper;
import model.PersonModel;

import java.sql.*;
import java.util.List;

public class PersonDAO extends AbstractDAO<PersonModel> implements IPersonDAO {

    @Override
    public PersonModel save(PersonModel person) {
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append("person(perid, pername, peraddress, perdob, pergender) ");
        sql.append("VALUES(?, ?, ?, ?, ?)");
        insert(sql.toString(), person.getPerId(), person.getPerName(),
            person.getPerAddress(), person.getPerDob(), person.getPerGender());
        return person;
    }

    @Override
    public PersonModel findOneById(String perId) {
        String sql = "SELECT * FROM person WHERE perid = ?";
        List<PersonModel> persons = query(sql, new PersonMapper(), perId);
        return persons.get(0);
    }
}