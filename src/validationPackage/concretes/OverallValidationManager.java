package validationPackage.concretes;

import entities.User;
import validationPackage.abstracts.IOverallValidationService;

public class OverallValidationManager implements IOverallValidationService {
    EmailCheckRegexManager emailCheckRegexManager = new EmailCheckRegexManager();
    FirstNameValidatorManager firstNameValidatorManager = new FirstNameValidatorManager();
    PasswordValidatorManager passwordValidatorManager = new PasswordValidatorManager();
    UniqueEmailAdressCheck uniqueEmailAdressCheck = new UniqueEmailAdressCheck();
    @Override
    public boolean validator(User user) {
        if(emailCheckRegexManager.emailCheckRegexService(user)&&
        firstNameValidatorManager.firstNameValidator(user)&&
        passwordValidatorManager.passwordValidator(user)&&
        uniqueEmailAdressCheck.uniqueEmailAdressCheck(user)){
            System.out.println("Girilen bilgiler doğru");
            return true;
        }

    else{
        System.out.println("Girilen bilgiler yanlış");
        return false;
    }
}}
