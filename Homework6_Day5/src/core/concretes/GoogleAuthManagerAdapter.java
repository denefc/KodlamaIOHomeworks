package core.concretes;

import core.abstracts.AuthService;
import entities.concretes.User;
import googleRegisteration.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
    GoogleAuthManager googleAuthManager;

    public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
        this.googleAuthManager = googleAuthManager;
    }

    @Override
    public void register(User user) {
        googleAuthManager.register(user.getEmail(), user.getPassword());
    }

    @Override
    public void login(String email, String password) {
    googleAuthManager.login(email,password);
    }
}
