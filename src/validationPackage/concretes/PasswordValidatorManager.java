package validationPackage.concretes;

import entities.User;
import validationPackage.abstracts.IPasswordValidator;

import java.util.regex.Pattern;

public class PasswordValidatorManager implements IPasswordValidator {

    @Override
    public boolean passwordValidator(User user) {
        String regex = "^.*(?=.{6,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        Pattern pattern = Pattern.compile(regex);
        if(pattern.matcher(user.getPassword()).matches()==false){
            System.out.println("Parola formata uygun değil");
            return false;
        }else
            return true;
    }
}
