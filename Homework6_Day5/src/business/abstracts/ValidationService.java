package business.abstracts;

import entities.concretes.User;

public interface ValidationService {
    boolean verify(String email,String password);
}
