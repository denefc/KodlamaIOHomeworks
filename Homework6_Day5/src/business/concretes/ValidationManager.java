package business.concretes;

import business.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class ValidationManager implements ValidationService {
    UserDao userDao;

    public ValidationManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean verify(String email, String password) {
       if (userDao.getByEmailAndPassword(email, password) instanceof User ){
           return true;
       }
       else
           return false;
    }
}
