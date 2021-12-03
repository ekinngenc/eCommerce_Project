package business.concretes;

import business.abstracts.IRegistrationService;
import core.concretes.GoogleAuthAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.User;
import validationPackage.concretes.OverallValidationManager;


public class RegistrationManager implements IRegistrationService {
    HibernateUserDao hibernateUserDao;
    GoogleAuthAdapter googleAuthAdapter;
    EmailVerificationManager emailVerificationManager;
    OverallValidationManager overallValidationManager;
    String message;
    private User user;

    public RegistrationManager(HibernateUserDao hibernateUserDao, GoogleAuthAdapter googleAuthAdapter, EmailVerificationManager emailVerificationManager,
                               OverallValidationManager overallValidationManager, String message, User user) {
        this.hibernateUserDao = hibernateUserDao;
        this.googleAuthAdapter = googleAuthAdapter;
        this.emailVerificationManager = emailVerificationManager;
        this.overallValidationManager = overallValidationManager;
        this.message = message;
        this.user = user;
    }

    public RegistrationManager(HibernateUserDao hibernateUserDao, EmailVerificationManager emailVerificationManager, GoogleAuthAdapter googleAuthAdapter, OverallValidationManager overallValidationManager) {
        this.hibernateUserDao = hibernateUserDao;
        this.emailVerificationManager = emailVerificationManager;
        this.googleAuthAdapter = googleAuthAdapter;
        this.overallValidationManager = overallValidationManager;

    }


    @Override
    public void registrationNewUser(User user) {
        if(overallValidationManager.validator(user)){
            emailVerificationManager.verificationComplete(user);
            this.hibernateUserDao.add(user);
        }
        else
            return;
    }

    @Override
    public void deleteUser(User user) {
        System.out.println(user.getFirstName()+" "+user.getLastName()+ " adlı kullanucu silindi.");
        this.hibernateUserDao.delete(user);
    }

    @Override
    public void updateUserInformation(User user) {
            System.out.println(user.getFirstName()+" "+user.getLastName()+" adlı kullanıcı bilgileri güncellendi");
            this.hibernateUserDao.update(user);
    }
}
