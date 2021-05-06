package business.concretes;

import business.abstracts.MailService;
import entities.concretes.User;

public class EmailManager implements MailService {
    @Override
    public void send(User user) {
        System.out.println(user.getFirstName()+" adlı user'a Email ile gönderildi ");
    }
}
