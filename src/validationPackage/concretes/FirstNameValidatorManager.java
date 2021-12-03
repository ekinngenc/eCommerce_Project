package validationPackage.concretes;

import entities.User;
import validationPackage.abstracts.IFirstNameValidator;

public class FirstNameValidatorManager implements IFirstNameValidator {
    @Override
    public boolean firstNameValidator(User user) {
        if(user.getFirstName().length()<3){
            System.out.println("Ad en az 3 karakterden oluşmalıdır. Lütfen tam adınızı giriniz");
            return false;
        }
        else
            return true;
    }
}
