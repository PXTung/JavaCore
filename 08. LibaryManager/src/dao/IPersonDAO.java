package dao;

import model.PersonModel;

public interface IPersonDAO {
    PersonModel save(PersonModel personModel);
    PersonModel findOneById(String perId);
}
