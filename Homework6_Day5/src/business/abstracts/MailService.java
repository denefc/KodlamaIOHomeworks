package business.abstracts;

import entities.concretes.User;

public interface MailService {
    void send(User user);
}
