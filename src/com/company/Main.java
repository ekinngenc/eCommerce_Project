package com.company;

import business.abstracts.IRegistrationService;
import business.concretes.EmailVerificationManager;
import business.concretes.RegistrationManager;
import core.concretes.GoogleAuthAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.User;
import validationPackage.concretes.FirstNameValidatorManager;
import validationPackage.concretes.OverallValidationManager;
import validationPackage.concretes.PasswordValidatorManager;
import validationPackage.concretes.UniqueEmailAdressCheck;

public class Main {

    public static void main(String[] args) {

        User userEmailSimulation = new User("Ekin", "Genç", "ekin.genc8697@gmail.com", "Ekin8697@");
        User wrongEmalSimlation = new User("Ekin", "Genç", "ekingmail.com", "G543434");
        User wrongFirstNameSimulation = new User("Ek","Genç", "ekin@gmail.com", "E5G534");
        User wrongPasswordSimulation = new User("Ekin","Genç", "ekin@gmail.com", "E5G534");
        User uniqueEmailCheck = new User("Ekin","Genç", "ekin@gmail.com", "Ek5G5@34");
        User wrongUniqueEmailCheck = new User("Ekin","Genç", "ekin@gmail.com", "Ek5G5@34");

        IRegistrationService registrationService = new RegistrationManager(new HibernateUserDao(), new EmailVerificationManager(),
                new GoogleAuthAdapter(), new OverallValidationManager());

         registrationService.registrationNewUser(userEmailSimulation);
        System.out.println("--------");
        registrationService.registrationNewUser(wrongEmalSimlation);
        System.out.println("--------");
        registrationService.registrationNewUser(wrongFirstNameSimulation);
        System.out.println("--------");
        registrationService.registrationNewUser(wrongPasswordSimulation);
        System.out.println("--------");
        registrationService.registrationNewUser(uniqueEmailCheck);
        System.out.println("--------");
        registrationService.registrationNewUser(wrongUniqueEmailCheck);
        System.out.println("--------");
    }
}
