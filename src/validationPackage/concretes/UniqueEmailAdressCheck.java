package validationPackage.concretes;

import entities.User;
import validationPackage.abstracts.IUniqueEmailAdressCheck;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAdressCheck implements IUniqueEmailAdressCheck {
    List<String> eMailAdress = new ArrayList<String>();
    @Override
    public boolean uniqueEmailAdressCheck(User user) {
        if(eMailAdress.contains(user.geteMail())){
            System.out.println("Bu eposta kullanılıyor. Lütfen yeni bir eposta adresi giriniz.");
            return false;
        }else{
            eMailAdress.add(user.geteMail());
            return true;
        }

    }
}
