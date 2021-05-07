package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
   void register(User user);
   void login(User user);
   void remove(User user);
   void update(User user);
   void verify(int id);
   User get(int id);
   User getByEmail(String email);
   List<User> getAll();
}
