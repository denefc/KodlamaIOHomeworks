package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
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
        user.setVerify(true);
        System.out.println("Kullanıcı doğrulandı");
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
