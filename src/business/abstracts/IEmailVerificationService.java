package business.abstracts;

import entities.User;

public interface IEmailVerificationService {
    boolean verificationSend(User user);
    boolean verificationComplete(User user);
}
