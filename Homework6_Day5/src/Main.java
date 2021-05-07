import business.abstracts.MailService;
import business.abstracts.ValidationService;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.abstracts.AuthService;
import core.concretes.GoogleAuthManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import googleRegisteration.GoogleAuthManager;

public class Main {
    public static void main(String[] args) {
        User user=new User(1,"Furkan","Cevik","example@gmail.com","123456");

        UserDao userDao=new HibernateUserDao();
        ValidationService validationService=new ValidationManager(userDao);
        MailService mailService=new EmailManager();
        AuthService authService=new GoogleAuthManagerAdapter(new GoogleAuthManager());

        UserManager userManager= new UserManager(userDao,validationService);

        userManager.register(user);
        mailService.send("Registered ",user.getEmail());
        userManager.login(user);

        authService.register(user);
        authService.login(user.getEmail(),user.getPassword());




    }
}
