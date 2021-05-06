package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users=new ArrayList<>();


    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public void update(User user) {
      User userChange=get(user.getId());
      userChange.setFirstName(user.getFirstName());
      userChange.setLastName(user.getLastName());
    }

    @Override
    public User get(int id) {
        for (User user:users){
            if (user.getId()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getByEmail(String email) {
        for (User user:users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
