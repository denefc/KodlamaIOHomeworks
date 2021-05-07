package business.concretes;

import business.abstracts.MailService;
import entities.concretes.User;

public class EmailManager implements MailService {

    @Override
    public void send(String message,String email) {
        System.out.println("E posta mesajı :"+message+ "to : "+email);
    }
}
