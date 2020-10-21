package mapper;

import model.PersonModel;
import model.ReaderModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements IMapper<PersonModel>{
    @Override
    public PersonModel rowMapper(ResultSet resultSet) {
        try {
            String perId = resultSet.getString("perid");
            String perName = resultSet.getString("pername");
            String perAddress = resultSet.getString("peraddress");
            String perDob = resultSet.getString("perdob");
            String perGender = resultSet.getString("pergender");

            return new PersonModel(
                    perId, perName, perAddress, perDob, perGender);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
