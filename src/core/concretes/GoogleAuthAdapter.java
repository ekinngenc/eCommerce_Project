package core.concretes;

import core.abstracts.IGoogleAuthService;
import googleRegistrationPackage.GoogleRegistrationManager;

public class GoogleAuthAdapter implements IGoogleAuthService {
    @Override
    public void GoogleAccountRegistration(String message) {

        GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
        googleRegistrationManager.registration(message);
    }
}
