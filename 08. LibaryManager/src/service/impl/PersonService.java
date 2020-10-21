package service.impl;

import dao.IPersonDAO;
import dao.impl.PersonDAO;
import model.PersonModel;
import service.IPersonService;

public class PersonService implements IPersonService {

    IPersonDAO personDAO = new PersonDAO();

    @Override
    public PersonModel save(PersonModel personModel) {
        return personDAO.save(personModel);
    }
}
