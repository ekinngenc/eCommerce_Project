package business.concretes;

import business.abstracts.IEmailVerificationService;
import entities.User;

public class EmailVerificationManager implements IEmailVerificationService {
    @Override
    public boolean verificationSend(User user) {
        System.out.println("Doğrulama maili " + user.geteMail() + " adresine gönderilmiştir.");
        return true;
    }

    @Override
    public boolean verificationComplete(User user) {
        if(verificationSend(user)){
            System.out.println(user.geteMail() + " adresi doğrulamayı başarıyla gerçekleştirmiştir.");
            return true;
        }else
            return false;

    }
}
