package mapper;

import dao.impl.PersonDAO;
import model.PersonModel;
import model.ReaderModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReaderMapper implements IMapper<ReaderModel>{
    private PersonDAO personDAO = new PersonDAO();

    @Override
    public ReaderModel rowMapper(ResultSet resultSet) {
        try {
            String redId = resultSet.getString("redid");
            String redType = resultSet.getString("redtype");
            String redNumber = resultSet.getString("rednumber");
            String redEmail = resultSet.getString("redemail");
            String perId = resultSet.getString("perid");

            PersonModel person = personDAO.findOneById(perId);
            return new ReaderModel(person, redId, redType, redNumber, redEmail);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
