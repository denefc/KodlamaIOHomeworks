package business.concretes;

import business.abstracts.UserService;
import business.abstracts.ValidationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private ValidationService validationService;

    public UserManager(UserDao userDao, ValidationService validationService) {
        this.userDao = userDao;
        this.validationService = validationService;
    }


    @Override
    public void register(User user) {
        userDao.add(user);
        System.out.println("Kullanıcı eklendi");
    }

    @Override
    public void login(User user) {
        verify(user.getId());
        System.out.println("Kullanıcı giriş yaptı");
    }

    @Override
    public void remove(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void verify(int id) {
        User user=userDao.get(id);
        if (validationService.verify(user.getEmail(), user.getPassword())){
            user.setVerify(true);
            System.out.println("Kullanıcı doğrulandı");
        }


    }

    @Override
    public User get(int id) {
       return userDao.get(id);
    }

    @Override
    public User getByEmail(String email) {
       return userDao.getByEmail(email);
    }

    @Override
    public List<User> getAll() {
       return userDao.getAll();
    }
}
