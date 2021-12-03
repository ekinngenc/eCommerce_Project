package validationPackage.concretes;

import entities.User;
import validationPackage.abstracts.IEmailCheckRegexService;

import java.util.regex.Pattern;

public class EmailCheckRegexManager implements IEmailCheckRegexService {

    @Override
    public boolean emailCheckRegexService(User user) {

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

       if(user.geteMail().isEmpty()){
           System.out.println("Lütfen email adresinizi giriniz. Email adresi boş olamaz.");
           return false;
       }

       else if(pattern.matcher(user.geteMail()).find()==false){
           System.out.println("Email adresi yanlış girdiniz.");
           return false;
       }
       else
           return true;
    }
}
