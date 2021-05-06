package business.abstracts;

import entities.concretes.User;

public interface ValidationService {
    boolean verify(User user);
}
